package co.carboni.prj.system.mapper;

import java.util.List;

import co.carboni.prj.system.vo.SystemVO;

public interface SysinfoMapper {
	public List<SystemVO> selectSysAll();
	
	public List<SystemVO> selectSysDetAll(SystemVO vo);
	
	//공정 조회
	public List<SystemVO> selectPicoid();
	
	//설비 수명
	List<SystemVO> selectSysLifespan(SystemVO vo);
	
	//설비 가동상태
	List<SystemVO> selectSysCondition(SystemVO vo);
	
	//설비 
	List<SystemVO> selectSysStartDie(SystemVO vo);
	
	//설비 정보 등록
		int systemInsert(SystemVO vo);
		
		//설비 관리 정보 등록
		int sysmanInsert(SystemVO vo);
		
		//설비 삭제
		int systemDelete(SystemVO vo);
		
		//설비 정보 삭제
		int sysmanDelete(SystemVO vo);
		
		//설비 수정
		int systemUpdate(SystemVO vo);
		
		//설비 관리 수정
		int sysmanUpdate(SystemVO vo);
		
		
}
