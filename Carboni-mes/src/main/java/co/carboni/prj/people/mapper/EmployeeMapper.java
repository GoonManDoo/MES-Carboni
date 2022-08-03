package co.carboni.prj.people.mapper;

import java.util.List;
import java.util.Map;

import co.carboni.prj.people.vo.EmployeeVO;

public interface EmployeeMapper {
	
	List<EmployeeVO> selectEmployee();
	int employeeupdate(EmployeeVO vo);
	public List<Map<String, Object>> empEx(EmployeeVO vo);
	
	

}
