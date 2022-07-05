package co.caboni.prj.mat.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MatController {

	
	@RequestMapping("/matList.do")
	public String matList(Model model) {
	 return "mat/matList";
	}
}
