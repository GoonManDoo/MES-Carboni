package co.carboni.prj.people.service;

import java.util.List;

import co.carboni.prj.people.vo.EmployeeVO;

public interface Employeeservice {
	
	List<EmployeeVO> selectEmployee();
	int employeeupdate(EmployeeVO vo);

}
