package co.carboni.prj.people.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.carboni.prj.people.service.Employeeservice;
import co.carboni.prj.people.vo.EmployeeVO;

@Controller
public class PeopleController {
	
	@Autowired private Employeeservice employeeDAO;
	
	@RequestMapping("/employee.do")
	public String employee(Model model) {
		model.addAttribute("employee", employeeDAO.selectEmployee());
		return "people/employee";
	}
	
	@RequestMapping("/employeeupdate")
	public String employeeupdate(EmployeeVO vo) {
		employeeDAO.employeeupdate(vo);
		return "redirect:employee.do";
	}
	
	
	@RequestMapping("/authority.do")
	public String authority() {
		return "people/authority";
	}

}
