package co.caboni.prj.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
	
	@RequestMapping("/ccode.do")
	public String cCode() {
		return "common/ccode";
	}
	
	@RequestMapping("/costomer.do")
	public String costomer() {
		return "common/costomer";
	}
	
	@RequestMapping("/matinfo.do")
	public String matInfo(){
		return "common/matinfo";
	}

}
