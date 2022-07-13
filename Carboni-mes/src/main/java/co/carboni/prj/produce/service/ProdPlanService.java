package co.carboni.prj.produce.service;

import java.util.List;


import co.carboni.prj.produce.vo.ProdPlanVO;

public interface ProdPlanService {
	
	// 생산계획조회
	
		// 미생산주문조회 - 기간검색
		public List<ProdPlanVO> findUnprod(String startDt, String endDt);
		
		// 생산계획에 추가할 제품 목록
		public List<ProdPlanVO> planProduct(ProdPlanVO vo);

		
	// 생산계획등록

	// 생산계획수정
		
	// 생산계획삭제
		
	// 발주요청

}
