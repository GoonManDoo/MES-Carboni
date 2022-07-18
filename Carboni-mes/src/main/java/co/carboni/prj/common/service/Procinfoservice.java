package co.carboni.prj.common.service;

import java.util.List;

import co.carboni.prj.common.vo.ProcinfoVO;

public interface Procinfoservice {
	
	List<ProcinfoVO> selectProcinfo();
	int procinfoinsert(ProcinfoVO vo);
	int procinfodelete(ProcinfoVO vo);
	int procinfoupdate(ProcinfoVO vo);
	List<ProcinfoVO> selectLine(ProcinfoVO vo);
}
