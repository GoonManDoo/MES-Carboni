package co.carboni.prj.sales.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.carboni.prj.sales.service.SalesService;
import co.carboni.prj.sales.vo.SalesVO;

@Controller
public class SalesController {
	
	@Autowired
	SalesService service;

	// 수주관리
	@RequestMapping("/contract.do")
	public String contract() {
		return "sales/contract";
	}
	
		// 수주관리 > 수주일자 조회
		@RequestMapping("cndateList")
		@ResponseBody
		public List<SalesVO> cndateList(@RequestParam String startDt, @RequestParam String endDt, 
				                        @RequestParam String cusCode, @RequestParam String goodsCode) {
			List<SalesVO> cndateList = service.findCndateList(startDt, endDt, cusCode, goodsCode);
			return cndateList;
		}
		
		
		//수주관리 > 수주목록 삭제
		@RequestMapping("delCnList")
		@ResponseBody
		public void delCnList(SalesVO vo) {
			service.findDelCnList(vo);
		}
		
		// 수주관리 > 거래처 모달 전체조회
		@RequestMapping("allCostomerList")
		@ResponseBody
		public List<SalesVO> allCostomerList(SalesVO vo) {
			List<SalesVO> allCostomerList = service.findAllCsList(vo);
			return allCostomerList;
			
		}
		
		// 수주관리 > 거래처 모달 검색조회
		@RequestMapping("costomerList")
		@ResponseBody
		public List<SalesVO> costomerList(@RequestParam("csname") String csname) {
			List<SalesVO> costomerList = service.findCsList(csname);
			return costomerList;
		}
		
		// 수주관리 > 제품 모달 전체조회
		@RequestMapping("allGoodsList")
		@ResponseBody
		public List<SalesVO> allGoodsList(SalesVO vo) {
			List<SalesVO> allGoodsList = service.findAllGiList(vo);
			return allGoodsList;
			
		}
		
		// 수주관리 > 제품 모달 조회
		@RequestMapping("goodsList")
		@ResponseBody
		public List<SalesVO> goodsList(@RequestParam("giname")String giname) {
			List<SalesVO> goodsList = service.findGiList(giname);
			return goodsList;
		}

	

	// 생산의뢰관리
	@RequestMapping("/productrequest.do")
	public String productrequest() {
		return "sales/productrequest";
	}
	
		//생산의뢰관리 > 마감일자 조회
		@RequestMapping("prCloseList")
		@ResponseBody
		public List<SalesVO> prCloseList(@RequestParam("startCd") String startCd, @RequestParam("endCd") String endCd,
										 @RequestParam("startPr") String startPr, @RequestParam("endCd") String endPr,
										 @RequestParam("gsCode") String gsCode, @RequestParam("complete") String complete) {
			List<SalesVO> prCloseList = service.findPrcloseList(startCd, endCd, startPr, endPr, gsCode, complete);
			return prCloseList;
		}
		
		//생산의뢰관리 > 수주일자 조회
		@RequestMapping("pCndateList")
		@ResponseBody
		public List<SalesVO> pCndateList(@RequestParam String startDt, @RequestParam String endDt) {
			List<SalesVO> pCndateList = service.findPcndateList(startDt, endDt);
			return pCndateList;
		}
		
		//생산의뢰관리 > 생산의뢰목록 삭제
		@RequestMapping("delPrList")
		@ResponseBody
		public void delPrList(SalesVO vo) {
			service.findDelPrList(vo);
		}
		
		//생산의뢰관리 > 생산의뢰등록
		@RequestMapping("prodReqInsert")
		@ResponseBody
		public void prodReqInsert(@RequestBody List<SalesVO> allreq) {
			service.prodReqInsert(allreq);
		}
		
		//제품재고관리 > 제품재고등록
		@RequestMapping("goodsStkInsert")
		@ResponseBody
		public void goodsStkInsert(@RequestBody List<SalesVO> allstk) {
			service.goodsStkInsert(allstk);
		}
				
				

	// 제품재고관리
	@RequestMapping("/goodsstk.do")
	public String goodsstk() {
		return "sales/goodsstk";
	}
	
		//제품재고관리 > 제품재고등록 제품검색조회
		@RequestMapping("stkProdList")
		@ResponseBody
		public List<SalesVO> stkProdList(@RequestParam("addStk") String addStk) {
			List<SalesVO> stkProdList = service.findStkProdList(addStk);
			System.out.println(stkProdList);
			return stkProdList;
		}
		
		//제품재고관리 > 제품재고등록 전체검색조회
		@RequestMapping("allStkProdList")
		@ResponseBody
		public List<SalesVO> allStkProdList(SalesVO vo) {
			List<SalesVO> allStkProdList = service.findAllStkProdList(vo);
			return allStkProdList;
			
		}
		
		//제품재고관리 > 제품재고 조회
		@RequestMapping("stkList")
		@ResponseBody
		public List<SalesVO> stkList(@RequestParam String gssCode) {
			List<SalesVO> stkList = service.findStkList(gssCode);
			return stkList;
		}
		
		//제품재고관리 > 제품재고 삭제
		@RequestMapping("delGsmList")
		@ResponseBody
		public void delGsmList(SalesVO vo) {
			service.findDelGsmList(vo);
		}
				

	// 출하관리
	@RequestMapping("/shipping.do")
	public String shipping() {
		return "sales/shipping";
	}
	
		//출하관리 > 출고일자 조회
		@RequestMapping("shipList")
		@ResponseBody
		public List<SalesVO> shipList(@RequestParam("startCp") String startCp, @RequestParam("endCp") String endCp,
									  @RequestParam("startSd") String startSd, @RequestParam("endSd") String endSd,
									  @RequestParam("gsCode") String gsCode) {
			List<SalesVO> shipList = service.findShipList(startCp, endCp, startSd, endSd, gsCode);			
			return shipList;
		}
		
		//출하관리 > 출고목록 삭제
		@RequestMapping("delShList")
		@ResponseBody
		public void delShList(SalesVO vo) {
			service.findDelShList(vo);
		}

	// 배송관리
	@RequestMapping("/deliver.do")
	public String deliver() {
		return "sales/deliver";
	}

	
	 


}
