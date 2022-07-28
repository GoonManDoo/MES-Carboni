package co.carboni.prj.system.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public String ProdDetail(SystemVO vo, Model m1) {
		System.out.println();
		m1.addAttribute("detail", service.selectSysDetAll(vo));
		m1.addAttribute("sysStart", service.selectSysStartDie(vo));
		m1.addAttribute("syscon",service.selectSysCondition(vo));
		m1.addAttribute("sysLife", service.selectSysLifespan(vo));
		m1.addAttribute("maint", service.selectMaint(vo));
		System.out.println("====================");
		System.out.println(vo);
		System.out.println("====================");
		return "system/ProdDetail";
	}
	
//	@RequestMapping("/test")
//	public  String test(Model model) {
//		model.addAttribute("test", mapper.selectSysAll());
//		return "system/test";
//	}
	
	
	
	@RequestMapping("/productSysMain")
		public String productSysMain(SystemVO vo, Model m1) {
		m1.addAttribute("divalign", service.selectSysAll(vo));
		m1.addAttribute("Pid", service.selectPicoid(vo));
		return "system/productSysMain";
	}

	
	@RequestMapping("/rePosit")
	@ResponseBody
	public List<SystemVO> rePosit(String sinum){
		System.out.println(sinum);	
		List<SystemVO> rePosit=service.rePosit(sinum);
		return rePosit;
	}
	@RequestMapping("/deleteAdmin")
	@ResponseBody
	public List<SystemVO> deleteAdmin(String sinum){
		System.out.println(sinum);
		List<SystemVO> deleteAdmin=service.deleteAdmin(sinum);
		return deleteAdmin;
	}
	
	
	@RequestMapping("/selEmp")
	@ResponseBody
	public List<SystemVO> selEmp(){
		List<SystemVO> selEmp=service.selectEmployee();
		return selEmp;
	}
	
	@RequestMapping("/systemInsert")
	public String systemInsert(SystemVO vo) {
		service.systemInsert(vo);
		service.sysmanInsert(vo);
		return "redirect:productSysMain";
	}
	
	@RequestMapping("EditAdmin")
	@ResponseBody // 나갈때
	public void editAdmin(@RequestParam String aaad, @RequestParam String aaac) { // 들어올때
		service.editAdmin(aaad, aaac);
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
