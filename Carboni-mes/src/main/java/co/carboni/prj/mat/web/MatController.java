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

	@RequestMapping(method = RequestMethod.POST, path = "addrequestlist")
	@ResponseBody
	public List<MatVO> addrequestlist(@RequestBody List<MatVO> list) {
		return service.addRequestList(list);
	}
	
	@RequestMapping("finddelreq")
	@ResponseBody
	public void finddelreq(MatVO vo) {
		service.findDelreq(vo);
	}

}
