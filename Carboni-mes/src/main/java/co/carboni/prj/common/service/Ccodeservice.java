package co.carboni.prj.common.service;

import java.util.List;

import co.carboni.prj.common.vo.CcodeVO;

public interface Ccodeservice {
	
	List<CcodeVO> selectCodeAll();
	CcodeVO selectCodeClass(CcodeVO vo);
	int codeInsertBig(CcodeVO vo);
	int codeInsertSmall(CcodeVO vo);
	int codeDelete(CcodeVO vo);
	int codeUpdate(CcodeVO vo);

}
