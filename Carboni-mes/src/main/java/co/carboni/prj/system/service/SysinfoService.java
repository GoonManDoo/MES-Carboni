package co.carboni.prj.system.service;

import java.util.List;

import co.carboni.prj.system.vo.SystemVO;
//CRUD+AllList
public interface SysinfoService {
	
	List<SystemVO> selectSysAll();
	
	int systemInsert(SystemVO vo);
	int systemDelete(SystemVO vo);
	int systemUpdate(SystemVO vo);
}
