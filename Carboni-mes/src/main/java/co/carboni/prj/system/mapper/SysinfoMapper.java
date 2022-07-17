package co.carboni.prj.system.mapper;

import java.util.List;

import co.carboni.prj.system.vo.SystemVO;

public interface SysinfoMapper {
	List<SystemVO> selectSysAll();
	
	int systemInsert(SystemVO vo);
	int systemDelete(SystemVO vo);
	int systemUpdate(SystemVO vo);
}
