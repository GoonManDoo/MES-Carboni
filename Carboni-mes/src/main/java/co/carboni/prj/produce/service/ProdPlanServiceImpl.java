package co.carboni.prj.produce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import co.carboni.prj.produce.mapper.ProdPlanMapper;
import co.carboni.prj.produce.vo.ProdPlanVO;

@RestController
public class ProdPlanServiceImpl implements ProdPlanService {
	
	@Autowired
	ProdPlanMapper map;

	// 미생산주문조회
	@Override
	public List<ProdPlanVO> findUnprod() {
		return map.findUnprod();
	}

}
