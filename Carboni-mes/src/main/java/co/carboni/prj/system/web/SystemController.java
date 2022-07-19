package co.carboni.prj.system.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.carboni.prj.system.mapper.SysinfoMapper;
import co.carboni.prj.system.vo.SystemVO;

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
	public String ProdDetail(SystemVO vo, Model model) {
		System.out.println(vo);
		
		model.addAttribute("detail", mapper.selectSysDetAll(vo));
		
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
	
	@RequestMapping("/systemInsert")
	public String systemInsert(SystemVO vo) {
		mapper.systemInsert(vo);
		return "redirect:productSysMain";
	}
	
	 
	
	@RequestMapping("/DetailView")
	@ResponseBody
	public List<SystemVO> DetailView (SystemVO vo) {
		List<SystemVO> DetailView = mapper.selectSysDetAll(vo);
		return DetailView;	
	}
	

}
