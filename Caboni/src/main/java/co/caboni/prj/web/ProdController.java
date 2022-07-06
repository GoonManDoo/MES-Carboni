package co.caboni.prj.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdController {
	
	@RequestMapping("/prodplan.do")
	public String ProdPlan() {
		return "produce/prodplan";
	}
	
	

}
