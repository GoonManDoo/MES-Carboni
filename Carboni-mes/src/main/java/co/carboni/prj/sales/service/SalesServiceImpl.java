package co.carboni.prj.sales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import co.carboni.prj.sales.mapper.SalesMapper;
import co.carboni.prj.sales.vo.SalesVO;

@RestController
public class SalesServiceImpl implements SalesService {
	
	@Autowired
	SalesMapper mapper;

	//수주관리
		//수주기간 조회
	@Override
	public List<SalesVO> findCndateList(String startDt, String endDt) {
		return mapper.findCndateList(startDt, endDt);
	}
	//거래처모달 검색
	@Override
	public List<SalesVO> findCsList(String csname) {
		return mapper.findCsList(csname);
	}
	//제품모달 검색
	@Override
	public List<SalesVO> findGiList(String giname) {
		return mapper.findGiList(giname);
	}

	
	
		//생산의뢰관리
		
		
		//제품재고관리
		
		
		//출하관리
		
		
		//배송관리
}
