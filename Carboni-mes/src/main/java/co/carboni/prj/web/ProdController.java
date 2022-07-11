package co.carboni.prj.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdController {
	
	@RequestMapping("/login")
	public String login() {
		return "layouts/login";
	}
	
	// 생산계획관리
	@RequestMapping("/prodplan.do")
	public String prodPlan() {
		return "produce/prodPlan";
	}
	
	// 생산계획관리 - 생산계획모달
	@RequestMapping("/prodPlanModal.do")
	public String prodPlanModal() {
		return "produce/modal/prodPlanModal";
	}
	
	// 생산계획관리 - 미생산의뢰조회 모달
	@RequestMapping("/requestModal.do")
	public String unprodModal() {
		return "produce/modal/requestModal";
	}
	
	// 생산지시관리
	@RequestMapping("/prodorder.do")
	public String prodOrder() {
		return "produce/prodOrder";
	}
	
	// 생산지시관리 - 생산지시모달
	@RequestMapping("/prodOrderModal.do")
	public String prodOrderModal() {
		return "produce/modal/prodOrderModal";
	}
	
	// 생산지시관리 - 미지시계획조회 모달
	@RequestMapping("/unorderModal.do")
	public String unorderModal() {
		return "produce/modal/unorderModal";
	}
	
	// 생산지시조회
	@RequestMapping("/prodOrView.do")
	public String prodOrderView() {
		return "produce/prodOrView";
	}
	
	// 생산지시조회 - 제품코드조회 모달
	@RequestMapping("/productCodeModal.do")
	public String productCodeModal() {
		return "produce/modal/productCodeModal";
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
