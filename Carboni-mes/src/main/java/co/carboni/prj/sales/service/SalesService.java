package co.carboni.prj.sales.service;

import java.util.List;


import co.carboni.prj.sales.vo.SalesVO;

public interface SalesService {

	//수주관리
	
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
	
	
	//제품재고관리
	
	
	//출하관리
	
	
	//배송관리
}
