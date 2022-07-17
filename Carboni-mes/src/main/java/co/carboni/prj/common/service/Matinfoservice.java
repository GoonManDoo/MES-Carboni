package co.carboni.prj.common.service;

import java.util.List;

import co.carboni.prj.common.vo.MatinfoVO;

public interface Matinfoservice {
	
	List<MatinfoVO> selectMatinfo();
	int matinfoInsert(MatinfoVO vo);
	int matinfoDelete(MatinfoVO vo);
	int matinfoUpdate(MatinfoVO vo);

}
