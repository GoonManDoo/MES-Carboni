package co.carboni.prj.common.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.carboni.prj.common.service.Ccodeservice;
import co.carboni.prj.common.vo.CcodeVO;

@Controller
public class CommonController {
	
	@Autowired
	private Ccodeservice ccodeDAO;
	
	@RequestMapping("/ccode.do")
	public String cCode(Model model) {
		model.addAttribute("ccode", ccodeDAO.selectCodeAll());
		return "common/ccode";
	}
	
	@RequestMapping("/ccodeinsertsmall.do")
	public String cCodeInsertSmall(CcodeVO vo) {
		ccodeDAO.codeInsertSmall(vo);
		return "redirect:ccode.do";
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
