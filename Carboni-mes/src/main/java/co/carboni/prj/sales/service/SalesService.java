package co.carboni.prj.sales.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.carboni.prj.sales.vo.SalesVO;

public interface SalesService {

	//수주관리
	
		//수주관리 > 수주목록 삭제
		public void findDelCnList(SalesVO vo);
	
		//수주관리 > 수주일자조회
		public List<SalesVO> findCndateList(String startDt, String endDt, String cusCode, String goodsCode);
		
		//수주관리 > 거래처모달 전체조회
		public List<SalesVO> findAllCsList(SalesVO vo);
		
		//수주관리 > 거래처모달 검색조회
		public List<SalesVO> findCsList(String csname);
		
		//수주관리 > 수주관리 제품 전체조회
		public List<SalesVO> findAllGiList(SalesVO vo);
		
		//수주관리 > 제품모달 검색조회
		public List<SalesVO> findGiList(String giname);
	
	//생산의뢰관리
		
		//생산의뢰관리 > 생산의뢰목록 조회
		public List<SalesVO> findPrcloseList(String startCd, String endCd, String startPr, String endPr,  String gsCode, String complete);
	
		//생산의뢰관리 > 생산의뢰 삭제
		public void findDelPrList(SalesVO vo);
		
		//생산의뢰관리 > 수주일자조회
		public List<SalesVO> findPcndateList(String startDt, String endDt);

		//생산의뢰관리 > 생산의뢰등록
		public void prodReqInsert(List<SalesVO> allreq);
		
	//제품재고관리
	
	
	//출하관리
		
		//출하관리 > 출고목록 조회
		public List<SalesVO> findShipList(String startCp, String endCp, String startSd, String endSd, String gsCode);
		
		//출하관리 > 미출고건 납기일자 조회
		public List<SalesVO> findNoProdList(String startCpd, String endCpd);
		
		//출하관리 > 출하목록 삭제
		public void findDelShList(SalesVO vo);
		
	//제품재고관리
		
		//제품재고관리 > 제품재고 조회
		public List<SalesVO> findStkList(String gssCode);
		
		//제품재고관리 > 제품재고 삭제
		public void findDelGsmList(SalesVO vo);
		
		//제품재고관리 > 제품재고등록 제품검색조회
		public List<SalesVO> findStkProdList(String addStk);
		
		//제품재고관리 > 제품재고등록 제품전체조회
		public List<SalesVO> findAllStkProdList(SalesVO vo);
		
		//제품재고관리 > 제품재고수정
		public void goodsStkUpdate(List<SalesVO> allstk);
		
		//제품재고관리 > 제품재고등록
		public void goodsStkInsert(String gsamin, String jepoomcoin);
		
		
		
		
	
	
	//배송관리
}
