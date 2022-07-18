package co.carboni.prj.system.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.carboni.prj.system.mapper.SysinfoMapper;

@Controller
//설비 메인화면
public class SystemController {
	
	@Autowired SysinfoMapper mapper;
	
	
	/*
	 * @RequestMapping("/productSysMain") public String productSysMain() { return
	 * "system/productSysMain"; }
	 */
	
	//설비 자세히 보기
	@RequestMapping("/ProdDetail.do")
	public String ProdDetail() {
		return "system/ProdDetail";
	}
	
	@RequestMapping("/test")
	public  String test(Model model) {
		model.addAttribute("test", mapper.selectSysAll());
		return "system/test";
	}
	
	
	@RequestMapping("/productSysMain")
		public String productSysMain(Model model) {
		model.addAttribute("divalign", mapper.selectSysAll());
		return "system/productSysMain";
	}
}
