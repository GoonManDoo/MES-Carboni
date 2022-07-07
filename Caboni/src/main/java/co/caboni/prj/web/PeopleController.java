package co.caboni.prj.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PeopleController {
	
	@RequestMapping("/employee.do")
	public String employee() {
		return "people/employee";
	}
	@RequestMapping("/authority.do")
	public String authority() {
		return "people/authority";
	}

}
