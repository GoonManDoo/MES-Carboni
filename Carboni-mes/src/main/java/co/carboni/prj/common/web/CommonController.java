package co.carboni.prj.common.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.carboni.prj.common.service.Ccodeservice;
import co.carboni.prj.common.vo.CcodeVO;
import co.carboni.prj.produce.vo.ProdPlanVO;

@Controller
public class CommonController {
	
	@Autowired
	private Ccodeservice ccodeDAO;
	
	@RequestMapping("/ccode.do")
	public String cCode(){
		return "common/ccode";
	}
	
	@RequestMapping("bigList")
	@ResponseBody
	public List<CcodeVO> bigList() {
		List<CcodeVO> bigList = ccodeDAO.selectCodeAll();
		return bigList;
	}
	
	@RequestMapping("smallList")
	@ResponseBody
	public List<CcodeVO> smallList(CcodeVO vo) {
		List<CcodeVO> smallList = ccodeDAO.selectCodeClass(vo);
		return smallList;
	}
	
	@RequestMapping("/ccodeinsertsmall.do")
	public String cCodeInsertSmall(CcodeVO vo) {
		ccodeDAO.codeInsertSmall(vo);
		return "redirect:ccode.do";
	}
	
	@RequestMapping("/ccodeupdate.do")
	public String cCodeUpdate(CcodeVO vo) {
		ccodeDAO.codeUpdate(vo);
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
