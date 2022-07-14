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

	// 발주관리에서 요청 내용이 메인 그리드에 표시
	public List<MatVO> showFindReq(MatVO vo);
}
