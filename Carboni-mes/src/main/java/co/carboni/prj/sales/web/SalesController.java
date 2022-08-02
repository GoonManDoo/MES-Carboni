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

	// 생산관리 > 제품불량내역조회
	  @RequestMapping("prodErrList")
	  @ResponseBody 
	  public List<SalesVO> prodErrList(@RequestParam("startDtS")String startDtS, @RequestParam("endDtE")String endDtE, @RequestParam("errOpList")String errOpList) { 
		  List<SalesVO> prodErrList = service.findProdErrList(startDtS, endDtE, errOpList); 
		  return prodErrList; 
		  }
	 
	
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
										 @RequestParam("startPr") String startPr, @RequestParam("endPr") String endPr,
										 @RequestParam("gsCode") String gsCode, @RequestParam("complete") String complete) {
			List<SalesVO> prCloseList = service.findPrcloseList(startCd, endCd, startPr, endPr, gsCode, complete);
			System.out.println(startCd + "" + endCd + "" + startPr + "" + endPr + "" + gsCode);
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
		
		//출하관리 > 출하등록
		@RequestMapping("shipInsert")
		@ResponseBody
		public void shipInsert(@RequestBody List<SalesVO> allship) {
			System.out.println("=====================");
			System.out.println(allship);
			System.out.println("=====================");
			service.shipInsert(allship);
		}
		
				
				

	// 제품재고관리
	@RequestMapping("/goodsstk.do")
	public String goodsstk() {
		return "sales/goodsstk";
	}
		
		//제품재고관리 > 제품재고수정
		@RequestMapping("goodsStkUpdate")
		@ResponseBody
		public void goodsStkUpdate(@RequestBody List<SalesVO> allstk) {
			service.goodsStkUpdate(allstk);
		}
		
		//제품재고관리 > 제품재고등록
		@RequestMapping("goodsStkInsert")
		@ResponseBody
		public void goodsStkInsert(@RequestParam("gsamin") String gsamin, @RequestParam("jepoomcoin") String jepoomcoin) {
			service.goodsStkInsert(gsamin, jepoomcoin);
		}
	
		//제품재고관리 > 제품재고등록 제품검색조회
		@RequestMapping("stkProdList")
		@ResponseBody public List<SalesVO> stkProdList(@RequestParam("addStk") String addStk) { 
			List<SalesVO> stkProdList = service.findStkProdList(addStk);
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
		
		//출하관리 > 출하등록 수주일자 조회
		@RequestMapping("ScndateList")
		@ResponseBody
		public List<SalesVO> ScndateList(@RequestParam("startScd") String startScd, @RequestParam("endScd") String endScd) {
			List<SalesVO> ScndateList = service.findScndateList(startScd, endScd);
			return ScndateList;
		}
		
		//출하관리 > 미출고건 납기일자 조회
		@RequestMapping("noProdList")
		@ResponseBody
		public List<SalesVO> noProdList(@RequestParam("startCpd") String startCpd, @RequestParam("endCpd") String endCpd) {
			List<SalesVO> noProdList = service.findNoProdList(startCpd, endCpd);
			return noProdList;
		}
		
		
		
		

	// 배송관리
	@RequestMapping("/deliver.do")
	public String deliver() {
		return "sales/deliver";
	}
	
		//배송관리 > 배송등록
		@RequestMapping("deliverInsert")
		@ResponseBody
		public void deliverInsert(@RequestBody List<SalesVO> inDelver) {
			service.deliverInsert(inDelver);
		}
		
		//배송관리 > 수주번호 검색조회
		@RequestMapping("jepoomList")
		@ResponseBody
		public List<SalesVO> jepoomList(@RequestParam("cnList") String cnList) {
			List<SalesVO> jepoomList = service.findJepoomList(cnList);
			return jepoomList;
			
		}
		
		//배송관리 > 수주번호 전체조회
		@RequestMapping("allJepoomList")
		@ResponseBody
		public List<SalesVO> allJepoomList(SalesVO vo) {
			List<SalesVO> allJepoomList = service.findAllJepoomList(vo);
			return allJepoomList;
		}
		
		//배송관리 > 배송목록 삭제
		@RequestMapping("delDlist")
		@ResponseBody
		public void delDlist(SalesVO vo) {
			service.findDelDlist(vo);
		}
		
		//배송관리 > 배송등록 출하번호 검색조회
		@RequestMapping("inShdate")
		@ResponseBody
		public List<SalesVO> inShdate(@RequestParam("shNumList") String shNumList) {
			List<SalesVO> inShdate = service.findInShdate(shNumList);
			return inShdate;
		}
		
		//배송관리 > 배송등록 출하번호 전체조회
		@RequestMapping("allInShdate")
		@ResponseBody
		public List<SalesVO> allInShdate(SalesVO vo) {
			List<SalesVO> allInShdate = service.findAllInShdate(vo);
			return allInShdate;
		}
		
		//배송관리 > 배송목록 조회
		@RequestMapping("deliverSearch")
		@ResponseBody
		public List<SalesVO> deliverSearch(@RequestParam("startSh") String startSh,
				@RequestParam("endSh") String endSh, @RequestParam("cnNumber") String cnNumber) {
			List<SalesVO> deliverSearch = service.findDeliverSearch(startSh, endSh, cnNumber);
			return deliverSearch;
		}
	 


}
