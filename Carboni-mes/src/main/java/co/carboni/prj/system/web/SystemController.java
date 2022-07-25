package co.carboni.prj.system.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.carboni.prj.system.mapper.SysinfoMapper;
import co.carboni.prj.system.service.SysinfoService;
import co.carboni.prj.system.vo.SystemVO;

@Controller
//설비 메인화면
public class SystemController {
	
	
	@Autowired SysinfoService service;
	
	/*
	 * @RequestMapping("/productSysMain") public String productSysMain() { return
	 * "system/productSysMain"; }
	 */
	
	//설비 자세히 보기
	@RequestMapping("/ProdDetail.do")
	public String ProdDetail(SystemVO vo, Model model) {
		model.addAttribute("detail", service.selectSysDetAll(vo));
		return "system/ProdDetail";
	}
	
//	@RequestMapping("/test")
//	public  String test(Model model) {
//		model.addAttribute("test", mapper.selectSysAll());
//		return "system/test";
//	}
	
	
	
	@RequestMapping("/productSysMain")
		public String productSysMain(Model m1, Model m2) {
		m1.addAttribute("divalign", service.selectSysAll());
		m2.addAttribute("Pid", service.selectPicoid());
		return "system/productSysMain";
	}

	@RequestMapping("/systemInsert")
	public String systemInsert(SystemVO vo) {
		service.systemInsert(vo);
		service.sysmanInsert(vo);
		return "redirect:productSysMain";
	}
	
	
	@RequestMapping("/deleted")
	public String systemDelete(SystemVO vo) {
			service.systemDelete(vo);
		return "redirect:productSysMain";
	}
	 
	
	
	@RequestMapping("/DetailView")
	@ResponseBody
	public List<SystemVO> DetailView (SystemVO vo) {
		List<SystemVO> DetailView = service.selectSysDetAll(vo);
		return DetailView;	
	}
	

}
