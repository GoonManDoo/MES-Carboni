package co.carboni.prj.sales.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.carboni.prj.sales.mapper.SalesMapper;
import co.carboni.prj.sales.vo.SalesVO;

@Controller
public class SalesController {
	
	@Autowired
	SalesMapper mapper;

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
			List<SalesVO> cndateList = mapper.findCndateList(startDt, endDt, cusCode, goodsCode);
			return cndateList;
		}
		
		// 수주관리 > 거래처 모달 전체조회
		@RequestMapping("allCostomerList")
		@ResponseBody
		public List<SalesVO> allCostomerList(SalesVO vo) {
			List<SalesVO> allCostomerList = mapper.findAllCsList(vo);
			return allCostomerList;
			
		}
		
		// 수주관리 > 거래처 모달 검색조회
		@RequestMapping("costomerList")
		@ResponseBody
		public List<SalesVO> costomerList(@RequestParam("csname")String csname) {
			List<SalesVO> costomerList = mapper.findCsList(csname);
			return costomerList;
		}
		
		// 수주관리 > 제품 모달 전체조회
		@RequestMapping("allGoodsList")
		@ResponseBody
		public List<SalesVO> allGoodsList(SalesVO vo) {
			List<SalesVO> allGoodsList = mapper.findAllGiList(vo);
			return allGoodsList;
			
		}
		
		// 수주관리 > 제품 모달 조회
		@RequestMapping("goodsList")
		@ResponseBody
		public List<SalesVO> goodsList(@RequestParam("giname")String giname) {
			List<SalesVO> goodsList = mapper.findGiList(giname);
			return goodsList;
		}

	

	// 생산의뢰관리
	@RequestMapping("/productrequest.do")
	public String productrequest() {
		return "sales/productrequest";
	}

	// 제품재고관리
	@RequestMapping("/goodsstk.do")
	public String goodsstk() {
		return "sales/goodsstk";
	}

	// 출하관리
	@RequestMapping("/shipping.do")
	public String shipping() {
		return "sales/shipping";
	}

	// 배송관리
	@RequestMapping("/deliver.do")
	public String deliver() {
		return "sales/deliver";
	}

	
	  // 거래처정보모달
	  //@RequestMapping("/contractModal.do") public String contractModal() { return
	  //"sales/modal/contractModal"; }
	  
	  // 제품정보모달
	  // @RequestMapping("/proName.do") public String proName() { return
	  //"sales/modal/proName"; }
	  
	  // 배송정보모달
	  //@RequestMapping("/deliverModal.do") public String deliverModal() { return
	  //"sales/modal/deliverModal"; }
	  
	  // 배송정보모달
	  //@RequestMapping("/shippingingModal.do") public String shippingingModal() {
	  //return "sales/modal/shippingingModal"; }
	 


}
