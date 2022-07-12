package co.carboni.prj.produce.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import co.carboni.prj.produce.service.ProdPlanService;

@Controller
public class ProdController {
	
	public ProdPlanService sr;
	
	@RequestMapping("/login")
	public String login() {
		return "layouts/login";
	}
	
	// 생산계획관리
	@RequestMapping("/prodplan.do")
	public String prodPlan() {
		return "produce/prodPlan";
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
