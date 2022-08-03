package co.carboni.prj.common.service;

import java.util.List;
import java.util.Map;

import co.carboni.prj.common.vo.MatinfoVO;

public interface Matinfoservice {
	
	List<MatinfoVO> selectMatinfo();
	int matinfoInsert(MatinfoVO vo);
	int matinfoDelete(MatinfoVO vo);
	int matinfoUpdate(MatinfoVO vo);
	public List<Map<String, Object>> matinfoEx(MatinfoVO vo);
	
}
