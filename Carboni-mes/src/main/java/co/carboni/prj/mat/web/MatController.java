package co.carboni.prj.mat.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
	@RequestMapping("giuplist")
	@ResponseBody
	public List<MatVO> giuplist(MatVO vo) {
		List<MatVO> giuplist = mapper.findgiup(vo);
		return giuplist;
	}

	// 발주에서 자재코드를 조회할때
	@RequestMapping("matlist")
	@ResponseBody
	public List<MatVO> matlist(MatVO vo) {
		List<MatVO> matlist = mapper.findMat(vo);
		return matlist;
	}

	// 입고관리에서 기업체명 검색할때
	@RequestMapping("inputgiuplist")
	@ResponseBody
	public List<MatVO> inputgiuplist(MatVO vo) {
		List<MatVO> inputgiuplist = mapper.inputgiup(vo);
		return inputgiuplist;
	}
}
