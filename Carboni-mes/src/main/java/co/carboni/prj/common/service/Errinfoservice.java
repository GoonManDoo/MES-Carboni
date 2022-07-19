package co.carboni.prj.common.service;

import java.util.List;

import co.carboni.prj.common.vo.ErrinfoVO;

public interface Errinfoservice {
	
	List<ErrinfoVO> selectErrinfo();
	int errinfoinsert(ErrinfoVO vo);
	int errinfodelete(ErrinfoVO vo);
	int errinfoupdate(ErrinfoVO vo);

}
