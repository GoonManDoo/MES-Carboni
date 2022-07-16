package co.carboni.prj.produce.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import co.carboni.prj.produce.vo.ProdPlanVO;

public interface ProdMapper {

	// 생산계획조회
	
	// 미생산주문조회
	public List<ProdPlanVO> findUnprod(@Param("startDt") String startDt, @Param("endDt") String endDt);


	// 생산계획에 추가할 제품목록
	public List<ProdPlanVO> planProduct(ProdPlanVO vo);

	// 생산계획에서 선택한 제품의 자재목록
	public List<ProdPlanVO> matList(@Param("prn") String prnum);

	// 생산계획에서 부족한 자재 발주요청
	public void requestMat(ProdPlanVO vo);

	// 생산계획등록
	public int addProdPlan(ProdPlanVO vo);
	
	// 생산계획상세등록
	public void addPPlanDetail(ProdPlanVO vo);

	// 생산계획수정
	
	// 생산계획삭제
	
	// 발주요청
}
