package co.carboni.prj.common.mapper;

import java.util.List;

import co.carboni.prj.common.vo.MatinfoVO;

public interface MatinfoMapper {
	
	List<MatinfoVO> selectMatinfo();
	int matinfoInsert(MatinfoVO vo);
	int matinfoDelete(MatinfoVO vo);
	int matinfoUpdate(MatinfoVO vo);
}
