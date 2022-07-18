package co.carboni.prj.common.mapper;

import java.util.List;

import co.carboni.prj.common.vo.ErrinfoVO;

public interface ErrinfoMapper {
	
	List<ErrinfoVO> selectErrinfo();
	int errinfoinsert(ErrinfoVO vo);
	int errinfodelete(ErrinfoVO vo);
	int errinfoupdate(ErrinfoVO vo);
	
	

}
