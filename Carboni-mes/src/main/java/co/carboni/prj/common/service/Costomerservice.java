package co.carboni.prj.common.service;

import java.util.List;
import java.util.Map;

import co.carboni.prj.common.vo.CostomerVO;

public interface Costomerservice {
	
	List<CostomerVO> selectCostAll();
	int costInsert(CostomerVO vo);
	int costDelete(CostomerVO vo);
	int costUpdate(CostomerVO vo);
	public List<Map<String, Object>> costEx(CostomerVO vo);

}
