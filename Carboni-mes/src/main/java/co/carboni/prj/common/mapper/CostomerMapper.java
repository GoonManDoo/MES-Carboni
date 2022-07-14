package co.carboni.prj.common.mapper;

import java.util.List;

import co.carboni.prj.common.vo.CostomerVO;

public interface CostomerMapper {
	
	List<CostomerVO> selectCostAll();
	int costInsert(CostomerVO vo);
	int costDelete(CostomerVO vo);
	int costUpdate(CostomerVO vo);
	
	

}
