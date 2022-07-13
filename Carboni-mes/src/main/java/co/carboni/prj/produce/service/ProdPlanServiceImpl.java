package co.carboni.prj.produce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import co.carboni.prj.produce.mapper.ProdPlanMapper;
import co.carboni.prj.produce.vo.ProdPlanVO;

@RestController
public class ProdPlanServiceImpl implements ProdPlanService {
	
	@Autowired
	ProdPlanMapper mapper;

	// 미생산주문조회
	@Override
	public List<ProdPlanVO> findUnprod(String startDt, String endDt) {
		return mapper.findUnprod(startDt, endDt);
	}

	// 생산계획에 추가할 제품 목록
	@Override
	public List<ProdPlanVO> planProduct(ProdPlanVO vo) {
		return mapper.planProduct(vo);
	}


	

	

}
