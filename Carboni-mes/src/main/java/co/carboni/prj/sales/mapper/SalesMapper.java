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
		
		//생산의뢰관리 > 수주일자 조회
		public List<SalesVO> findPcndateList(@Param("startDt")String startDt, @Param("endDt")String endDt);
	
		//생산의뢰관리 > 생산의뢰등록
		public void prodReqInsert(SalesVO vo); //생산의뢰등록
		public void updateCnStat(SalesVO vo);  //수주상태변경 cnstatus
	
		//출하관리 > 출하등록
		public void shipInsert(SalesVO vo);
		
	
	
	//출하관리
		//출하관리 > 출고목록 조회
		public List<SalesVO> findShipList(@Param("startCp")String startCp, @Param("endCp")String endCp, 
										 @Param("startSd")String startSd, @Param("endSd")String endSd, 
										 @Param("gsCode")String gsCode);

		//출하관리 > 출하목록 삭제
		public void findDelShList(SalesVO vo);
		
		//출하관리 > 미출고건 납기일자 조회
		public List<SalesVO> findNoProdList(String startCpd, String endCpd);
	
		//출하관리 > 출하등록 수주일자 조회
		public List<SalesVO> findScndateList(@Param("startScd") String startScd, @Param("endScd") String endScd);
	
	//제품재고관리
		
		//제품재고관리 > 제품재고 조회
		public List<SalesVO> findStkList(String gsCode);
		
		//제품재고관리 > 제품재고 삭제
		public void findDelGsmList(SalesVO vo);
		
		//제품재고관리 > 제품재고등록 제품검색조회
		public List<SalesVO> findStkProdList(@Param("addStk") String addStk);
		
		//제품재고관리 > 제품재고등록 제품전체조회
		public List<SalesVO> findAllStkProdList(SalesVO vo);
		
		//제품재고관리 > 제품재고수정
		public void updateStkStat(SalesVO vo);  
		
		//제품재고관리 > 제품재고등록
		public void goodsStkInsert(@Param("gsamin") String gsamin, @Param("jepoomcoin") String jepoomcoin);



		
	//배송관리
		
		//배송관리 > 제품검색
		public List<SalesVO> findJepoomList(@Param("cnList") String cnList);
	
}
