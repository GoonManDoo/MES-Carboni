package co.carboni.prj.mat.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.carboni.prj.mat.vo.MatVO;

public interface MatMapper {

	// 생산에서 발주요청한 사항 조회
	public List<MatVO> findreq(MatVO vo);

	// 발주 메인에서 기업 검색 모달안의 내용 전체조회
	// 입고에서 기업 검색 모달안의 내용 조회
	public List<MatVO> findComList(MatVO vo);

	// 발주 메인에서 기업검색 모달안의 내용을 검색하여 조회
	public List<MatVO> findSearchComList(String csname);

	// 발주 메인에서 자재 검색 모달의 내용 조회
	public List<MatVO> findMat(MatVO vo);

	// 발주 메인에서 자재검색모달 안의 내용을 검색하여 조회
	public List<MatVO> findSearchMat(String miname);

	// 입고관리에서 발주일자로 검색시 모달안의 내용
	public List<MatVO> inModalSearch(@Param("startD") String startD, @Param("endD") String endD);

	// 발주관리의 발주일자 조회
	public List<MatVO> findReqDate(@Param("startD") String startD, @Param("endD") String endD,
			@Param("cusCode") String cusCode, @Param("matCode") String matCode);

	// 발주관리에서 자체발주할떄 자재코드,거래처명 검색해서 그리드에 출력
	public List<MatVO> findCode(@Param("cusCode") String cusCode, @Param("matCode") String matCode);

	// 발주에서 발주내용 등록할때 //수정할떄도
	public int addRequestList(MatVO vo); //인서트
	public List<MatVO> selectReqList(MatVO vo); //인서트값 다시불러옴
	public void updateReqStat(MatVO vo); //요청사항 상태변경
	
	//발주에서 발주내용 삭제할떄
	public void findDelreq(MatVO vo);
	
	//---------------------------------------------

	
	//입고관리에서 자재 입고 처리하면서 발주상태 업데이트
	public List<MatVO> addInputList(MatVO vo);
	public List<MatVO> selectInput(MatVO vo);
	

}
