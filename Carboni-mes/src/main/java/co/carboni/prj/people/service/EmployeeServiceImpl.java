package co.carboni.prj.people.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.carboni.prj.people.mapper.EmployeeMapper;
import co.carboni.prj.people.vo.EmployeeVO;

@Repository("employeeDAO")
public class EmployeeServiceImpl implements Employeeservice{
	
	@Autowired
	public EmployeeMapper map;

	@Override
	public List<EmployeeVO> selectEmployee() {
		return map.selectEmployee();
	}

	@Override
	public int employeeupdate(EmployeeVO vo) {
		return map.employeeupdate(vo);
	}

}
