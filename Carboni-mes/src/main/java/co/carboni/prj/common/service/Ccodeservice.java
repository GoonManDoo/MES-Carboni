package co.carboni.prj.common.service;

import java.util.List;
import java.util.Map;

import co.carboni.prj.common.vo.CcodeVO;

public interface Ccodeservice {
	
	List<CcodeVO> selectCodeAll();
	List<CcodeVO> selectCodeClass(CcodeVO vo);
	int codeInsertBig(CcodeVO vo);
	int codeInsertSmall(CcodeVO vo);
	int codeDelete(CcodeVO vo);
	int codeUpdate(CcodeVO vo);
	List<Map<String,Object>> codeEx(CcodeVO vo);

}
