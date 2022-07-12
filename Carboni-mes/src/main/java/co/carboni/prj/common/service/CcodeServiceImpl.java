package co.carboni.prj.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.carboni.prj.common.mapper.CcodeMapper;
import co.carboni.prj.common.vo.CcodeVO;

@Repository("ccodeDAO")
public class CcodeServiceImpl implements Ccodeservice {

	@Autowired
	public CcodeMapper map;

	@Override
	public List<CcodeVO> selectCodeAll() {
		return map.selectCodeAll();
	}

	@Override
	public CcodeVO selectCodeClass(CcodeVO vo) {
		return map.selectCodeClass(vo);
	}

	@Override
	public int codeInsertBig(CcodeVO vo) {
		return map.codeInsertBig(vo);
	}

	@Override
	public int codeInsertSmall(CcodeVO vo) {
		return map.codeInsertSmall(vo);
	}

	@Override
	public int codeDelete(CcodeVO vo) {
		return map.codeDelete(vo);
	}

	@Override
	public int codeUpdate(CcodeVO vo) {
		return map.codeUpdate(vo);
	}

}
