package co.carboni.prj.system.service;

import java.util.List;

import co.carboni.prj.system.vo.SysmanVO;
//CRUD+AllList
public interface SysinfoService {
	
	List<SysmanVO> selectSysAll();
	
	int systemInsert(SysmanVO vo);
	int systemDelete(SysmanVO vo);
	int systemUpdate(SysmanVO vo);
}
