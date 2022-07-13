package co.carboni.prj.sales.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.carboni.prj.sales.vo.SalesVO;

public interface SalesMapper {

	//수주관리
	public List<SalesVO> findCndateList(@Param("startDt") String startDt, @Param("endDt") String endDt);

	public List<SalesVO> findCsList(@Param("csname") String csname);
	
	public List<SalesVO> findGiList(@Param("giname") String giname);
	
	
	//생산의뢰관리
	
	
	//제품재고관리
	
	
	//출하관리
	
	
	//배송관리
	
}
