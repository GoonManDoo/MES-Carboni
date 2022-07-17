package co.carboni.prj.produce.service;

import java.util.List;


import co.carboni.prj.produce.vo.ProdPlanVO;

public interface ProdService {
	
	// 생산계획관리
	
		// 생산계획조회
		public List<ProdPlanVO> searchPlan(String pstartDt, String pendDt, String pstatus);
	
		// 미생산주문조회 - 기간검색
		public List<ProdPlanVO> findUnprod(String startDt, String endDt);
		
		// 생산계획에 추가할 제품 목록
		public List<ProdPlanVO> planProduct(ProdPlanVO vo);
		
		// 생산계획에서 선택한 제품의 자재목록
		public List<ProdPlanVO> matList(String prnum);
		
		// 생산계획에서 부족한 자재 발주요청
		public void requestMat(ProdPlanVO vo);
			
		// 생산계획등록
		public int addProdPlan(ProdPlanVO vo);
			
		// 생산계획상세등록 + 수정 시 재등록
		public void addPPlanDetail(List<ProdPlanVO> plans);

		// 생산계획수정
		public void updateProdPlan(ProdPlanVO vo);
		
		// 생산계획삭제
		public void removeProdPlan(ProdPlanVO vo);

		

			
			

}
