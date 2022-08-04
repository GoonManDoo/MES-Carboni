package co.carboni.prj.produce.web;


import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import co.carboni.prj.CommonExcelView;
import co.carboni.prj.mat.vo.MatVO;
import co.carboni.prj.produce.service.ProdService;
import co.carboni.prj.produce.service.Prodovservice;
import co.carboni.prj.produce.vo.ProcMoniterVO;
import co.carboni.prj.produce.vo.ProdOrderVO;
import co.carboni.prj.produce.vo.ProdPlanVO;


@Controller
public class ProdController {
	
	@Autowired ProdService service;
   @Autowired private Prodovservice prodovDAO;

	
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
		
		/*
		 * // 생산계획관리 - 생산계획상세 수정
		 * 
		 * @RequestMapping("upPPlanDetail")
		 * 
		 * @ResponseBody public void upPPlanDetail(@RequestBody List<ProdPlanVO> plans)
		 * { service.upPPlanDetail(plans); }
		 */		
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
		
		// 생산지시관리 - 생산계획목록의 제품, 자재정보
		@RequestMapping("goodsInfo")
		@ResponseBody
		public List<ProdOrderVO> goodsInfo(@RequestParam String gic) {
			return service.goodsInfo(gic);
		}
		
		// 생산지시관리 - 해당 생산라인의 생산공정
		@RequestMapping("procInfo")
		@ResponseBody
		public List<ProdOrderVO> procInfo(@RequestParam String gic) {
			return service.procInfo(gic);
		}
		
		// 생산지시관리 - 현장담당자 등록을 위한 사원 조회
		@RequestMapping("empList")
		@ResponseBody
		public List<ProdOrderVO> empList(@RequestParam String posit) {
			return service.empList(posit);
		}
		
		// 생산지시관리 - 생산지시등록
		@RequestMapping("addProdOrder")
		@ResponseBody
		public ProdOrderVO addProdOrder(ProdOrderVO vo) {
			service.addProdOrder(vo);
			return vo;
		}
		
		// 생산지시관리 - 생산지시상세등록
		@RequestMapping("addPOrderDetail")
		@ResponseBody
		public void addPOrderDetail(@RequestBody List<ProdOrderVO> orders) {
			service.addPOrderDetail(orders);
		}
		
		// 생산지시관리 - 재생산내역모달 조회
		@RequestMapping("reprodList")
		@ResponseBody
		public List<ProdOrderVO> reprodList(ProdOrderVO vo) {
			return service.reprodList(vo);
		}
		
		// 생산지시관리 - 생산지시수정
		@RequestMapping("updateOrder")
		@ResponseBody
		public void updateOrder(ProdOrderVO vo) {
			service.updateOrder(vo);
		}
		
		// 생산지시관리 - 생산지시상세수정
		@RequestMapping("updateOrDetail")
		@ResponseBody
		public void updateOrDetail(@RequestBody List<ProdOrderVO> orders) {
			service.updateOrDetail(orders);
		}
		
		// 생산지시관리 - 생산지시조회 검색
		@RequestMapping("searchOrder")
		@ResponseBody
		public List<ProdOrderVO> searchOrder(@RequestParam String ostartDt, @RequestParam String oendDt, @RequestParam String ostatus) {
			return service.searchOrder(ostartDt, oendDt, ostatus);
		}
		
		// 생산지시관리 - 생산지시 페이지로드
		@RequestMapping("prodOrder")
		@ResponseBody
		public ProdOrderVO prodOrder(@RequestParam String findNum) {
			return service.prodOrder(findNum);
		}
		
		// 생산지시관리 - 생산지시상세 페이지로드
		@RequestMapping("prodOrderDetail")
		@ResponseBody
		public List<ProdOrderVO> prodOrderDetail(@RequestParam String findDNum) {
			return service.prodOrderDetail(findDNum);
		}
		
		// 생신지시관리 - 생산지시삭제
		@RequestMapping("removeProdOrder")
		@ResponseBody
		public void removeProdOrder(ProdOrderVO vo) {
			service.removeProdOrder(vo);
		}
	
	
	// 생산지시조회
   @RequestMapping("/prodOrView.do")
   public String prodOrderView(Model model) {
      model.addAttribute("list", prodovDAO.selectProdov());
      return "produce/prodOrView";
   }
   
   		// 생산지시조회 - 지시조회
   		@RequestMapping("orderView")
   		@ResponseBody
   		public List<ProdOrderVO> orderView(@RequestParam String orderDtS, @RequestParam String orderDtE, @RequestParam String orderDiv) {
			return service.orderView(orderDtS, orderDtE, orderDiv);
   			
   		}
   		
   		// 생산지시조회 - 지시상세조회
   		@RequestMapping("orderDView")
   		@ResponseBody
   		public List<ProdOrderVO> orderDView(ProdOrderVO vo) {
			return service.orderDView(vo);
   			
   		}
   		
	
	// 공정관리
	@RequestMapping("/procMoniter.do")
	public String procMoniter() {
		return "produce/procMoniter";
	}
		
		// 공정진행관리 - 생산지시목록 검색
		@RequestMapping("callOrder")
		@ResponseBody
		public List<ProcMoniterVO> callOrder(@RequestParam String workDt) {
			return service.callOrder(workDt);
			
		}
		
		// 공정진행관리 - 진행생산지시
		@RequestMapping("loadOrder")
		@ResponseBody
		public List<ProcMoniterVO> loadOrder(@RequestParam String findNum) {
			return service.loadOrder(findNum);
		}
		
		// 공정진행관리 - 공정목록
		@RequestMapping("loadProdLine")
		@ResponseBody
		public List<ProcMoniterVO> loadProdLine(ProcMoniterVO vo) {
			return service.loadProdLine(vo);
		}
		
		// 공정진행관리 - 자재출고 insert, 자재재고 update
		@RequestMapping("updateMat")
		@ResponseBody
		public void updateMat(ProcMoniterVO vo) {
			service.updateMat(vo);
		}
		
		// 공정진행관리 - 더미테이블 지시번호, 설비번호 등록
		@RequestMapping("insertSinum")
		@ResponseBody
		public void insertSinum(ProcMoniterVO vo) {
			service.insertSinum(vo);
			Scheduler scheduler = new Scheduler();
		    scheduler.start();
		}
		
		// 공정진행관리 - 더미테이블 시작시간, 종료시간 확인
		@RequestMapping("loadTime")
		@ResponseBody
		public ProcMoniterVO loadTime(ProcMoniterVO vo) {
			return service.loadTime(vo);
		}
		
		// 공정진행관리 - 생산완료되면 공정진행에 insert, 수주상태와 영업재고 update
		@RequestMapping("insertProcHead")
		@ResponseBody
		public ProcMoniterVO insertProcHead(ProcMoniterVO vo) {
			service.insertProcHead(vo);
			return vo;
		}
		
		// 공정진행관리 - 생산완료되면 공정진행상세에 insert
		@RequestMapping("insertProcHeadD")
		@ResponseBody
		public void insertProcHeadD(@RequestBody List<ProcMoniterVO> heads) {
			service.insertProcHeadD(heads);
		}
		
		// 공정진행관리 - 긴급중지
		@RequestMapping("emerStop")
		@ResponseBody
		public List<ProcMoniterVO> emerStop() {
			service.emerStop();
			return service.selectEmer();
		}
		
		// 공정진행관리 - 재시작
		@RequestMapping("restart")
		@ResponseBody
		public void restart() {
			service.restart();
			//Scheduler scheduler = new Scheduler();
		    //scheduler.start();
		}
		
		// 실적모니터링 - 생산실적 클릭시 공정별 생산내역 확인
		@RequestMapping("searchHead")
		@ResponseBody
		public List<ProcMoniterVO> searchHead(ProcMoniterVO vo) {
			return service.searchHead(vo);
		}
		
		// 실적모니터링 - 라인번호 클릭시 생산실적
		@RequestMapping("lineProd")
		@ResponseBody
		public List<ProcMoniterVO> lineProd(ProcMoniterVO vo) {
			return service.lineProd(vo);
		}
		
		// 실적모니터링 - 생산일자로 생산실적 검색
		@RequestMapping("lineProdDt")
		@ResponseBody
		public List<ProcMoniterVO> lineProdDt(@RequestParam String prodDtS, @RequestParam String prodDtE, @RequestParam String lineid) {
			return service.lineProdDt(prodDtS, prodDtE, lineid);
		}
		
		// 실적모니터링 - 불량등록
		@RequestMapping("errorInsert")
		@ResponseBody
		public void errorInsert(ProcMoniterVO vo) {
			service.errorInsert(vo);
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
	
		// 불량내역조회 - 엑셀조회
		@RequestMapping("errorExcel")
		public ModelAndView errorExcel(MatVO vo) throws IOException {
			List<Map<String, Object>> list = service.errorExcel(vo);
			HashMap<String, Object> map = new HashMap<String, Object>();
			String[] header = { "불량내역번호", "공정코드", "제품명", "불량코드", "불량명", "불량내역", "불량량", "불량일자"};
				map.put("headers", header);
				map.put("filename", "error_list");
				map.put("datas", list);
			return new ModelAndView(new CommonExcelView(), map);

		}
	
	
		
		
	public class Scheduler extends Thread {
		
	   @Override
	   public void run() {
	      List<String> list = Arrays.asList(null, "SS-1", "SS-5", "SS-7", null);
	      for(int i=1; i<list.size(); i++) {
	    	 System.out.println(list.get(i-1));
	    	 System.out.println(list.get(i));
	         service.schedule(list.get(i-1), list.get(i));
	         try {
	            this.sleep(8000);
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	      }
	   }
	}

}



