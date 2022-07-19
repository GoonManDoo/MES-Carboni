package co.carboni.prj.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.carboni.prj.common.mapper.MatinfoMapper;
import co.carboni.prj.common.vo.MatinfoVO;

@Repository("matinfoDAO")
public class MatinfoServiceImpl implements Matinfoservice{
	
	@Autowired
	public MatinfoMapper map;

	@Override
	public List<MatinfoVO> selectMatinfo() {
		return map.selectMatinfo();
	}

	@Override
	public int matinfoInsert(MatinfoVO vo) {
		return map.matinfoInsert(vo);
	}

	@Override
	public int matinfoDelete(MatinfoVO vo) {
		return map.matinfoDelete(vo);
	}

	@Override
	public int matinfoUpdate(MatinfoVO vo) {
		return map.matinfoUpdate(vo);
	}


}
