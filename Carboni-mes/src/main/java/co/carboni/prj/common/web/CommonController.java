package co.carboni.prj.common.web;

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
	@RequestMapping("/bom.do")
	public String bom() {
		return "common/bom";
	}
	@RequestMapping("/procinfo.do")
	public String procInfo() {
		return "common/procinfo";
	}
	@RequestMapping("/errinfo.do")
	public String errInfo() {
		return "common/errinfo";
	}

}
