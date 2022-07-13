package co.carboni.prj.produce.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.carboni.prj.produce.mapper.ProdPlanMapper;
import co.carboni.prj.produce.vo.ProdPlanVO;


@Controller
public class ProdController {
	
	@Autowired
	ProdPlanMapper mapper;
	
	// 생산계획관리
	@RequestMapping("/prodplan.do")
	public String prodPlan() {
		return "produce/prodPlan";
	}
	
		// 생산계획관리 - 미생산주문조회
		@RequestMapping("unprodList")
		@ResponseBody
		public List<ProdPlanVO> unprodList(@RequestParam String startDt, @RequestParam String endDt) {
			List<ProdPlanVO> unprodList = mapper.findUnprod(startDt, endDt);
			return unprodList;
		}
		
		// 생산계획관리 - 생산계획에 추가할 제품 목록
		@RequestMapping("planProduct")
		@ResponseBody
		public List<ProdPlanVO> planProduct(ProdPlanVO vo) {
			List<ProdPlanVO> planProduct = mapper.planProduct(vo);
			return planProduct;
		}
		
		// 생산계획관리 - 선택한 제품의 필요자재 체크
		@RequestMapping("matCheck")
		@ResponseBody
		public List<ProdPlanVO> matCheck(@RequestParam("gic") String gicode, @RequestParam("cn") int cnam) {
			List<ProdPlanVO> matCheck = mapper.matList(gicode, cnam);
			return matCheck;
		}
		
		// 생산계획관리 - 부족한 자재 발주요청
		@RequestMapping("requestMat")
		@ResponseBody
		public void requestMat(ProdPlanVO vo) {
			mapper.requestMat(vo);
		}
	
	// 생산지시관리
	@RequestMapping("/prodorder.do")
	public String prodOrder() {
		return "produce/prodOrder";
	}
	
	
	// 생산지시조회
	@RequestMapping("/prodOrView.do")
	public String prodOrderView() {
		return "produce/prodOrView";
	}
	
	// 공정모니터링
	@RequestMapping("/procMoniter.do")
	public String procMoniter() {
		return "produce/procMoniter";
	}
	
	// 생산지시일정조회
	@RequestMapping("/prodOrderDate.do")
	public String prodOrderDate() {
		return "produce/prodOrderDate";
	}
	
	// 불량내역조회
	@RequestMapping("/errorListView.do")
	public String errorListView() {
		return "produce/errorListView";
	}
	
	

}
