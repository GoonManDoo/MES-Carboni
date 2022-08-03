package co.carboni.prj.people.service;

import java.util.List;
import java.util.Map;

import co.carboni.prj.people.vo.EmployeeVO;

public interface Employeeservice {
	
	List<EmployeeVO> selectEmployee();
	int employeeupdate(EmployeeVO vo);
	public List<Map<String, Object>> empEx(EmployeeVO vo);

}
