package co.carboni.prj.common.mapper;

import java.util.List;
import java.util.Map;

import co.carboni.prj.common.vo.BomVO;
import co.carboni.prj.common.vo.GoodsinfoVO;

public interface BomMapper {
	
	List<BomVO> selectBom(BomVO vo);
	int bominsert(BomVO vo);
	int bomdelete(BomVO vo);
	List<GoodsinfoVO> selectGoods(GoodsinfoVO vo);
	public List<Map<String, Object>> bomEx(BomVO vo);
	
}
