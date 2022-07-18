package co.carboni.prj.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.carboni.prj.common.mapper.ErrinfoMapper;
import co.carboni.prj.common.vo.ErrinfoVO;

@Repository("errinfoDAO")
public class ErrinfoServiceImpl implements Errinfoservice {
	
	@Autowired
	public ErrinfoMapper map;

	@Override
	public List<ErrinfoVO> selectErrinfo() {
		return map.selectErrinfo();
	}

	@Override
	public int errinfoinsert(ErrinfoVO vo) {
		return map.errinfoinsert(vo);
	}

	@Override
	public int errinfodelete(ErrinfoVO vo) {
		return map.errinfodelete(vo);
	}

	@Override
	public int errinfoupdate(ErrinfoVO vo) {
		return map.errinfoupdate(vo);
	}

}
