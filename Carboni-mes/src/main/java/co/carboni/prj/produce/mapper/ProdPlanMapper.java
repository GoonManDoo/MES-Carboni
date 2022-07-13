package co.carboni.prj.produce.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.carboni.prj.produce.vo.ProdPlanVO;

public interface ProdPlanMapper {

	// 생산계획조회
	
	// 미생산주문조회
	public List<ProdPlanVO> findUnprod(@Param("startDt") String startDt, @Param("endDt") String endDt);


	// 생산계획에 추가할 제품목록
	public List<ProdPlanVO> planProduct(ProdPlanVO vo);


	// 생산계획등록

	// 생산계획수정
	
	// 생산계획삭제
	
	// 발주요청
}
