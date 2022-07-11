package co.carboni.prj.produce.mapper;

import java.util.List;

import co.carboni.prj.produce.vo.ProdPlanVO;

public interface ProdPlanMapper {

	// 생산계획조회
	
	// 미생산주문조회
	public List<ProdPlanVO> findUnprod();
	
	// 생산계획등록

	// 생산계획수정
	
	// 생산계획삭제
	
	// 발주요청
}
