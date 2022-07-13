package co.carboni.prj.system.mapper;

import java.util.List;

import co.carboni.prj.system.vo.SysmanVO;

public interface SysinfoMapper {
	List<SysmanVO> selectSysAll();
	
	int systemInsert(SysmanVO vo);
	int systemDelete(SysmanVO vo);
	int systemUpdate(SysmanVO vo);
}
