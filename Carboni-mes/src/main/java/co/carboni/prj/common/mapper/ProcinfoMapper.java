package co.carboni.prj.common.mapper;

import java.util.List;
import java.util.Map;

import co.carboni.prj.common.vo.ProcinfoVO;

public interface ProcinfoMapper {
	List<ProcinfoVO> selectProcinfo();
	int procinfoinsert(ProcinfoVO vo);
	int procinfodelete(ProcinfoVO vo);
	int procinfoupdate(ProcinfoVO vo);
	List<ProcinfoVO> selectLine(ProcinfoVO vo);
	public List<Map<String, Object>> procinfoEx(ProcinfoVO vo);

}
