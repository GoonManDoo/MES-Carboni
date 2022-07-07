package co.caboni.prj.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdController {
	
	// 생산계획관리
	@RequestMapping("/prodplan.do")
	public String ProdPlan() {
		return "produce/prodPlan";
	}
	
	// 생산지시관리
	@RequestMapping("/prodorder.do")
	public String ProdOrder() {
		return "produce/prodOrder";
	}
	
	

}
