package co.carboni.prj.sales.service;

import java.util.List;


import co.carboni.prj.sales.vo.SalesVO;

public interface SalesService {

	//수주관리
	
		//수주기간으로 검색
		public List<SalesVO> findCndateList(String startDt, String endDt);
		
		//거래처모달 검색
		public List<SalesVO> findCsList(String csname);
		
		//제품모달 검색
		public List<SalesVO> findGiList(String giname);
	
	//생산의뢰관리
	
	
	//제품재고관리
	
	
	//출하관리
	
	
	//배송관리
}
