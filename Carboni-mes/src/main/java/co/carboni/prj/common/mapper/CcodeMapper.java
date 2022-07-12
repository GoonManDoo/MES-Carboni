package co.carboni.prj.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import co.carboni.prj.common.vo.CcodeVO;

public interface CcodeMapper {

	List<CcodeVO> selectCodeAll();
	CcodeVO selectCodeClass(CcodeVO vo);
	int codeInsertBig(CcodeVO vo);
	int codeInsertSmall(CcodeVO vo);
	int codeDelete(CcodeVO vo);
	int codeUpdate(CcodeVO vo);

}
