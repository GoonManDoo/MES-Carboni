package co.carboni.prj.system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.carboni.prj.system.vo.SystemVO;

public interface SysinfoMapper {
	public List<SystemVO> selectSysAll(SystemVO vo);
	
	public List<SystemVO> selectSysDetAll(SystemVO vo);
	
	//공정 조회
	public List<SystemVO> selectPicoid(SystemVO vo);
	
	//설비 수명
	List<SystemVO> selectSysLifespan(SystemVO vo);
	
	//설비 가동상태
	List<SystemVO> selectSysCondition(SystemVO vo);
	
	//설비 
	List<SystemVO> selectSysStartDie(SystemVO vo);
	
	//입고일 점검주기 다음점검일
	List<SystemVO> selectMaint(SystemVO vo);
	
	void editAdmin(@Param("admin") String admin, @Param("sinum") String sinum);
	
	List<SystemVO> deleteAdmin(SystemVO vo);
	
	public List<SystemVO> selectEmployee();
	
	public List<SystemVO> rePosit(@Param("sinum") String sinum);
	
	public List<SystemVO> deleteAdmin(@Param("sinum") String sinum);
	
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
