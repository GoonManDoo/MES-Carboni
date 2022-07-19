package co.carboni.prj.produce.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.carboni.prj.produce.vo.ProdOrderVO;
import co.carboni.prj.produce.vo.ProdPlanVO;

public interface ProdMapper {
	
	// 생산계획관리
	
		// 생산계획검색
		public List<ProdPlanVO> searchPlan(@Param("pstartDt") String pstartDt, @Param("pendDt") String pendDt, @Param("pstatus") String pstatus);
		
		// 생산계획 로드
		public ProdPlanVO prodPlan(@Param("findNum") String findNum);
		
		// 생산계획상세 로드
		public List<ProdPlanVO> prodPlanDetail(@Param("findDNum") String findDNum);
		
		// 미생산주문조회 - 기간검색
		public List<ProdPlanVO> findUnprod(@Param("startDt") String startDt, @Param("endDt") String endDt);
	
		// 생산계획에 추가할 제품목록
		public List<ProdPlanVO> planProduct(ProdPlanVO vo);
	
		// 생산계획에서 선택한 제품의 자재목록
		public List<ProdPlanVO> matList(@Param("prn") String prnum);
	
		// 생산계획에서 부족한 자재 발주요청
		public void requestMat(ProdPlanVO vo);
	
		// 생산계획등록
		public int addProdPlan(ProdPlanVO vo);
		
		// 생산계획상세등록 + 수정 시 재등록
		public void addPPlanDetail(ProdPlanVO vo);
	
		// 생산계획수정
		public void updateProdPlan(ProdPlanVO vo);
		
		// 생산계획상세수정
		public void upPPlanDetail(ProdPlanVO vo);
	
		// 생산계획삭제
		public void removeProdPlan(ProdPlanVO vo); // 생산계획
		public void removePPlanDetail(ProdPlanVO vo); // 생산계획상세

		
	// 생산지시관리
		
		// 미지시계획조회
		public List<ProdOrderVO> unorderList(@Param("startDt") String startDt, @Param("endDt") String endDt);
		
		// 생산지시에 추가할 계획목록
		public List<ProdOrderVO> addPlan(ProdOrderVO vo);

		




	
	
}
