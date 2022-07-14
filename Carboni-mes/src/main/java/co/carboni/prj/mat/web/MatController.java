package co.carboni.prj.mat.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.carboni.prj.mat.mapper.MatMapper;
import co.carboni.prj.mat.vo.MatVO;

@Controller
public class MatController {

	@Autowired
	MatMapper mapper;

	// 발주관리
	@RequestMapping("/matOrder.do")
	public String matOrder(Model model) {
		return "mat/matOrder";
	}

	// 발주 모달 내용 반환
	@RequestMapping("/matAdd.do")
	public String matAdd() {
		return "mat/matAdd";
	}

	// 입고관리
	@RequestMapping("/matInsert.do")
	public String matInsert(Model model) {
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
		List<MatVO> reqlist = mapper.findreq(vo);
		return reqlist;
	}

	// 발주에서 기업명 조회할떄
	// 입고관리에서 기업명 조회
	@RequestMapping("companyList")
	@ResponseBody
	public List<MatVO> companyList(MatVO vo) {
		List<MatVO> companyList = mapper.findComList(vo);
		return companyList;
	}

	// 발주에서 자재코드를 조회할때
	@RequestMapping("matlist")
	@ResponseBody
	public List<MatVO> matlist(MatVO vo) {
		List<MatVO> matlist = mapper.findMat(vo);
		return matlist;
	}

	// 입고관리에서 발주일자로 검색시 모달안의 내용
	@RequestMapping("insearchorder")
	@ResponseBody
	public List<MatVO> insearchorder(@RequestParam String startD, @RequestParam String endD) {
		List<MatVO> insearchorder = mapper.inModalSearch(startD, endD);
		return insearchorder;
	}

	// 발주 메인에서 기업검색 모달안의 내용을 검색하여 조회
	@RequestMapping("findSearchCom")
	@ResponseBody
	public List<MatVO> findSearchCom(@RequestParam String csname) {
		List<MatVO> findSearchCom = mapper.findSearchComList(csname);
		return findSearchCom;
	}

	// 발주 메인에서 자재검색모달 안의 내용을 검색하여 조회
	@RequestMapping("findserchmaterial")
	@ResponseBody
	public List<MatVO> findserchmaterial(@RequestParam String miname) {
		List<MatVO> findserchmaterial = mapper.findSearchMat(miname);
		return findserchmaterial;
	}

	// 발주관리에서 요청 내용이 메인 그리드에 표시
	@RequestMapping("showFindReqList")
	@ResponseBody
	public List<MatVO> showFindReqList(MatVO vo) {
		List<MatVO> showFindReqList = mapper.showFindReq(vo);
		return showFindReqList;
	}

	// 발주관리의 발주일자 조회
	@RequestMapping("findreqdate")
	@ResponseBody
	public List<MatVO> findreqdate(@RequestParam String startD, @RequestParam String endD, @RequestParam String cusCode,
			@RequestParam String matCode) {
		List<MatVO> findreqdate = mapper.findReqDate(startD, endD, cusCode, matCode);
		return findreqdate;
	}
}
