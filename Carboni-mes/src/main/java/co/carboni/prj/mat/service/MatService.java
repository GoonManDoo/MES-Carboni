package co.carboni.prj.mat.service;

import java.util.List;
import java.util.Map;

import co.carboni.prj.mat.vo.MatVO;

public interface MatService {

	// 생산에서 발주요청한 사항 조회
	public List<MatVO> findreq(MatVO vo);

	// 발주 메인에서 기업 검색 모달안의 내용 전체조회
	// 입고에서 기업 검색 모달안의 내용 조회
	public List<MatVO> findComList(MatVO vo);

	// 발주에서 기업 검색 모달안의 내용을 검색하여 조회
	// 입고에서 기업 검색 모달안의 내용을 검색하여 조회
	public List<MatVO> findSearchComList(String csname);

	// 발주 메인에서 자재 검색 모달의 내용 조회
	public List<MatVO> findMat(MatVO vo);

	// 발주 메인에서 자재검색모달 안의 내용을 검색하여 조회
	public List<MatVO> findSearchMat(String miname);


	// 발주관리의 발주일자 조회해서 메인 그리드에 표시
	public List<MatVO> findReqDate(String startD, String endD, String cusCode, String matCode);
	
	//발주관리에서 자체발주할떄 자재코드,거래처명 검색해서 그리드에 출력
	public List<MatVO> findCode(String cusCode, String matCode);
	
	// 발주에서 발주내용 등록할때 //수정할떄도 
	public List<MatVO>  addRequestList(List<MatVO> list);
	
	//발주에서 발주내용 삭제할떄
	public void findDelreq(List<MatVO> list);
	
	//---------------------------------------------------------

	// 입고관리에서 발주일자로 검색시 모달안의 내용
	public List<MatVO> inModalSearch(String startD, String endD);
	

	//입고관리에서 자재 입고 처리하면서 발주상태 업데이트
	public List<MatVO> addInputList(List<MatVO> list);
	
	//입고관리에서 입고일자들로 조회해서 메인그리드에 표시
	public List<MatVO> findInDate(String startD, String endD,String cusCode);
	
	//입고관리에서 입고된것들 삭제할때 
	public void inputDelreq(List<MatVO> list);
	
	////////////////////////////////////////////////////////////////////////
	//자재관리에서 모든 자재 리스트 그리드에 출력
	public List<MatVO> matListAll(MatVO vo);
	
	//자재관리에서 자재코드 검색해서 메인그리드에 출력
	public List<MatVO> matSerchList(String matCode);
	
	////////////////////////////////////////////////////////////////////////
	//출고에서 조회하는 기능 
	public List<MatVO> selectOutList(MatVO vo);
	//입고관리에서 입고일자들로 조회해서 메인그리드에 표시
	public List<MatVO> findOutList(String startD, String endD,String matCode);
	
	//엑셀 용 
	List<Map<String,Object>> listExel(MatVO vo);

}
