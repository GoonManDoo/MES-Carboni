package co.carboni.prj.people.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.carboni.prj.CommonExcelView;
import co.carboni.prj.common.vo.BomVO;
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
	
	@RequestMapping("empEx")
	public ModelAndView empEx(EmployeeVO vo) {
		List<Map<String, Object>> list = employeeDAO.empEx(vo);
		HashMap<String, Object> map = new HashMap<String, Object>();
		String[] header = {"사원코드","입사일","직책","이름","카보니ID"};
			map.put("headers", header);
			map.put("filename", "empList");
			map.put("datas", list);
		return new ModelAndView(new CommonExcelView(), map);
	}

}
