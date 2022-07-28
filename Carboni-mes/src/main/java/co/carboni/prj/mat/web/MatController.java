package co.carboni.prj.mat.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.carboni.prj.mat.service.MatService;
import co.carboni.prj.mat.vo.MatVO;

@Controller
public class MatController {

	@Autowired(required = true)
	MatService service;

	// 발주관리
	@RequestMapping("/matOrder.do")
	public String matOrder() {
		return "mat/matOrder";
	}

	// 발주 모달 내용 반환
	@RequestMapping("/matAdd.do")
	public String matAdd() {
		return "mat/matAdd";
	}

	// 입고관리
	@RequestMapping("/matInsert.do")
	public String matInsert() {
		return "mat/matInsert";
	}

	// lot 관리
	@RequestMapping("/matLot.do")
	public String matLot() {
		return "mat/matLot";
	}

	// 출고관리
	@RequestMapping("/matoutput.do")
	public String matoutput() {
		return "mat/matoutput";
	}

	// 안전재고 및 재고 조회
	@RequestMapping("/matList.do")
	public String matList() {
		return "mat/matList";
	}

	// 발주조회의 업체 검색
	@RequestMapping("/matlistadd.do")
	public String matlistadd() {
		return "mat/matlistadd";
	}

	// 생산에서 넘어오는 발주
	@RequestMapping("reqlist")
	@ResponseBody
	public List<MatVO> reqlist(MatVO vo) {
		List<MatVO> reqlist = service.findreq(vo);
		return reqlist;
	}

	// 발주에서 기업명 조회할떄
	// 입고관리에서 기업명 조회
	@RequestMapping("companyList")
	@ResponseBody
	public List<MatVO> companyList(MatVO vo) {
		List<MatVO> companyList = service.findComList(vo);
		return companyList;
	}

	// 발주에서 자재코드를 조회할때
	@RequestMapping("matlist")
	@ResponseBody
	public List<MatVO> matlist(MatVO vo) {
		List<MatVO> matlist = service.findMat(vo);
		return matlist;
	}

	// 입고관리에서 발주일자로 검색시 모달안의 내용
	@RequestMapping("insearchorder")
	@ResponseBody
	public List<MatVO> insearchorder(@RequestParam String startD, @RequestParam String endD) {
		List<MatVO> insearchorder = service.inModalSearch(startD, endD);

		return insearchorder;
	}

	// 발주 메인에서 기업검색 모달안의 내용을 검색하여 조회
	@RequestMapping("findSearchCom")
	@ResponseBody
	public List<MatVO> findSearchCom(@RequestParam String csname) {
		List<MatVO> findSearchCom = service.findSearchComList(csname);
		return findSearchCom;
	}

	// 발주 메인에서 자재검색모달 안의 내용을 검색하여 조회
	@RequestMapping("findserchmaterial")
	@ResponseBody
	public List<MatVO> findserchmaterial(@RequestParam String miname) {
		List<MatVO> findserchmaterial = service.findSearchMat(miname);
		return findserchmaterial;
	}

	// 발주관리의 발주일자 조회
	@RequestMapping("findreqdate")
	@ResponseBody
	public List<MatVO> findreqdate(@RequestParam String startD, @RequestParam String endD, @RequestParam String cusCode,
			@RequestParam String matCode) {
		List<MatVO> findreqdate = service.findReqDate(startD, endD, cusCode, matCode);
		return findreqdate;
	}

	// 발주관리에서 자체발주할떄 자재코드,거래처명 검색해서 그리드에 출력
	@RequestMapping("findcodelist")
	@ResponseBody
	public List<MatVO> findcodelist(@RequestParam String cusCode, @RequestParam String matCode) {
		List<MatVO> findcodelist = service.findCode(cusCode, matCode);
		return findcodelist;
	}
	//자체 발주 및 요청 발주
	@RequestMapping(method = RequestMethod.POST, path = "addrequestlist")
	@ResponseBody
	public List<MatVO> addrequestlist(@RequestBody List<MatVO> list) {
		return service.addRequestList(list);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, path ="finddelreq")
	@ResponseBody
	public void finddelreq(@RequestBody List<MatVO> list) {
		service.findDelreq(list);
	}
	
	@RequestMapping("addinputlist")
	@ResponseBody
	public List<MatVO> addinputlist(@RequestBody List<MatVO> list){
		return service.addInputList(list);
	}

	@RequestMapping("findindate")
	@ResponseBody
	public List<MatVO> findindate(@RequestParam String startD, @RequestParam String endD, @RequestParam String cusCode){

		List<MatVO> findindate = service.findInDate(startD, endD ,cusCode);
		return findindate;
	}
	
	@RequestMapping(method = RequestMethod.POST, path ="inputdelreq")
	@ResponseBody
	public void inputdelreq(@RequestBody List<MatVO> list) {
		service.inputDelreq(list);
	}
	
	@RequestMapping("matlistall")
	@ResponseBody
	public List<MatVO> matlistall(MatVO vo){
		List<MatVO> list = service.matListAll(vo);
		return list;
	}
	
	@RequestMapping("matserchlist")
	@ResponseBody
	public List<MatVO> matserchlist(@RequestParam String matCode){
		List<MatVO> list = service.matSerchList(matCode);
		return list;
	}
	
	//출고에서 출고 된것들 조회 하는 거
	@RequestMapping("selectoutlist")
	@ResponseBody
	public List<MatVO> selectoutlist(MatVO vo){
		return service.selectOutList(vo);
	}
	
	//출고에서 일자로만 검색 또는 일자와 자재로 검색
	@RequestMapping("findoutlist")
	@ResponseBody
	public List<MatVO> findoutlist(@RequestParam String startD, @RequestParam String endD,@RequestParam String matCode){
		return service.findOutList(startD, endD, matCode);
	}
	


}
