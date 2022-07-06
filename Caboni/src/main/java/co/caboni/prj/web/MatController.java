package co.caboni.prj.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MatController {

	
	@RequestMapping("/matList.do")
	public String matList(Model model) {
	 return "mat/matList";
	}
	//모달 내용 반환 
	@RequestMapping("/matAdd.do")
	public String matAdd() {
		return "modal/matAdd";
	}
	
	
	@RequestMapping("/matInsert.do")
	public String matInsert(Model model) {
		return "mat/matInsert";
	}
}
