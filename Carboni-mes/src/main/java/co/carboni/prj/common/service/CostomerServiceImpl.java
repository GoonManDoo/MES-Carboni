package co.carboni.prj.common.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.carboni.prj.common.mapper.CostomerMapper;
import co.carboni.prj.common.vo.CostomerVO;

@Repository("costomerDAO")
public class CostomerServiceImpl implements Costomerservice{
	
	@Autowired
	public CostomerMapper map;

	@Override
	public List<CostomerVO> selectCostAll() {
		return map.selectCostAll();
	}

	@Override
	public int costInsert(CostomerVO vo) {
		return map.costInsert(vo);
	}

	@Override
	public int costDelete(CostomerVO vo) {
		return map.costDelete(vo);
	}

	@Override
	public int costUpdate(CostomerVO vo) {
		return map.costUpdate(vo);
	}

	@Override
	public List<Map<String, Object>> costEx(CostomerVO vo) {
		return map.costEx(vo);
	}

}
