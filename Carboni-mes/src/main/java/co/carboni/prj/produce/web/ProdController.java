package co.carboni.prj.produce.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.carboni.prj.produce.mapper.ProdMapper;
import co.carboni.prj.produce.service.ProdService;
import co.carboni.prj.produce.vo.ProdOrderVO;
import co.carboni.prj.produce.vo.ProdPlanVO;


@Controller
public class ProdController {
	
	@Autowired
	ProdService service;
	
	// 생산계획관리
	@RequestMapping("/prodplan.do")
	public String prodPlan() {
		return "produce/prodPlan";
	}
	
		// 생산계획관리 - 생산계획검색
		@RequestMapping("searchPlan")
		@ResponseBody
		public List<ProdPlanVO> searchPlan(@RequestParam String pstartDt, @RequestParam String pendDt, @RequestParam String pstatus) {
			List<ProdPlanVO> planList = service.searchPlan(pstartDt, pendDt, pstatus);
			return planList;
		}
		
		// 생산계획관리 - 생산계획 페이지로드
		@RequestMapping("prodPlan")
		@ResponseBody
		public ProdPlanVO prodPlan(@RequestParam String findNum) {
			return service.prodPlan(findNum);
		}
		
		// 생산계핵관리 - 생산계획상세 로드
		@RequestMapping("prodPlanDetail")
		@ResponseBody
		public List<ProdPlanVO> prodPlanDetail(@RequestParam String findDNum) {
			List<ProdPlanVO> prodPlanDLIst = service.prodPlanDetail(findDNum);
			return prodPlanDLIst;
		}
	
	
		// 생산계획관리 - 미생산주문조회
		@RequestMapping("unprodList")
		@ResponseBody
		public List<ProdPlanVO> unprodList(@RequestParam String startDt, @RequestParam String endDt) {
			List<ProdPlanVO> unprodList = service.findUnprod(startDt, endDt);
			return unprodList;
		}
		
		// 생산계획관리 - 생산계획에 추가할 제품 목록
		@RequestMapping("planProduct")
		@ResponseBody
		public List<ProdPlanVO> planProduct(ProdPlanVO vo) {
			List<ProdPlanVO> planProduct = service.planProduct(vo);
			return planProduct;
		}
		
		// 생산계획관리 - 선택한 제품의 필요자재 체크
		@RequestMapping("matCheck")
		@ResponseBody
		public List<ProdPlanVO> matCheck(@RequestParam("prn") String prnum) {
			List<ProdPlanVO> matCheck = service.matList(prnum);
			return matCheck;
		}
		
		// 생산계획관리 - 부족한 자재 발주요청
		@RequestMapping("requestMat")
		@ResponseBody
		public void requestMat(ProdPlanVO vo) {
			service.requestMat(vo);
		}
		
		// 생산계획관리 - 생산계획 등록
		@RequestMapping("addProdPlan")
		@ResponseBody
		public ProdPlanVO addProdPlan(ProdPlanVO vo) {
			service.addProdPlan(vo);
			return vo;
		}
		
		// 생산계획관리 - 생산계획상세 등록 + 수정 시 재등록
		@RequestMapping("addPPlanDetail")
		@ResponseBody
		public void addPPlanDetail(@RequestBody List<ProdPlanVO> plans) {
			service.addPPlanDetail(plans);
		}
		
		// 생산계획관리 - 생산계획 수정
		@RequestMapping("updateProdPlan")
		@ResponseBody
		public void updateProdPlan(ProdPlanVO vo) {
			service.updateProdPlan(vo);
		}
		
		// 생산계획관리 - 생산계획 삭제
		@RequestMapping("removeProdPlan")
		@ResponseBody
		public void removeProdPlan(ProdPlanVO vo) {
			service.removeProdPlan(vo);
		}
		
	// 생산지시관리
	@RequestMapping("/prodorder.do")
	public String prodOrder() {
		return "produce/prodOrder";
	}
		
		// 생산지시관리 - 미지시계획목록 조회
		@RequestMapping("unorderList")
		@ResponseBody
		public List<ProdOrderVO> unorderList(@RequestParam String startDt, @RequestParam String endDt) {
			List<ProdOrderVO> unorderList = service.unorderList(startDt, endDt);
			return unorderList;
		}
		
		// 생산지시관리 - 생산지시에 추가할 계획 목록
		@RequestMapping("addPlan")
		@ResponseBody
		public List<ProdOrderVO> addPlan(ProdOrderVO vo) {
			List<ProdOrderVO> orderPlan = service.addPlan(vo);
			return orderPlan;
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
