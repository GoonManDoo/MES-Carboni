package co.carboni.prj.system.service;

import java.util.List;

import co.carboni.prj.system.vo.SystemVO;
//CRUD+AllList
public interface SysinfoService {
	
	
	//메인화면 진입 시 DB 내의 모든 system 을 조회해줌
	List<SystemVO> selectSysAll(SystemVO vo);
	
	//설비 상세보기 관련 1쿼리 1값
	List<SystemVO> selectSysDetAll(SystemVO vo);
	
	//공정정보 조회
	List<SystemVO> selectPicoid(SystemVO vo);
	
	List<SystemVO> selectSysLifespan(SystemVO vo);
	
	List<SystemVO> selectSysCondition(SystemVO vo);
	
	List<SystemVO> selectSysStartDie(SystemVO vo);
	
	List<SystemVO> selectMaint(SystemVO vo);
	
	void editAdmin(String aaad, String aaac); // update라서 return값이 없음
	
	List<SystemVO> deleteAdmin(SystemVO vo);
	
	List<SystemVO> selectEmployee();
	
	
	
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
