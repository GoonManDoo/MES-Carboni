package co.carboni.prj.sales.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import co.carboni.prj.sales.vo.SalesVO;

public interface SalesMapper {

	//수주관리

		//수주관리 > 수주목록삭제
		public void findDelCnList(SalesVO vo);
		
		//수주관리 > 수주일자조회
		public List<SalesVO> findCndateList(@Param("startDt") String startDt, @Param("endDt") String endDt, 
				                            @Param("cusCode") String cusCode, @Param("goodsCode") String goodsCode);

		//수주관리 > 거래처모달 전체조회
		public List<SalesVO> findAllCsList(SalesVO vo);
		
		//수주관리 > 거래처모달 검색조회
		public List<SalesVO> findCsList(@Param("csname") String csname);
	
		//수주관리 > 제품모달 전체조회
		public List<SalesVO> findAllGiList(SalesVO vo);
		
		//수주관리 > 제품모달 검색조회
		public List<SalesVO> findGiList(@Param("giname") String giname);

		

	//생산의뢰관리
		
		//생산의뢰관리 > 생산의뢰 조회
		public List<SalesVO> findPrcloseList(@Param("startCd") String startCd, @Param("endCd") String endCd, @Param("startPr") String startPr, 
											 @Param("endPr") String endPr, @Param("gsCode") String gsCode, @Param("complete") String complete);
		//생산의뢰관리 > 생산의뢰 삭제
		public void findDelPrList(SalesVO vo);
	
	//제품재고관리
	
	
	//출하관리
	
	
	//배송관리
	
}
