package co.caboni.prj.goodsstk.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoodsStkController {

	@RequestMapping("/goodsstk.do")
	public String goodsstk() {
		return "sales/goodsstk";
		
	}
	
}
