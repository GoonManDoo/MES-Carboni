package co.carboni.prj.mat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.carboni.prj.mat.mapper.MatMapper;
import co.carboni.prj.mat.vo.MatVO;

public class MatServiceImpl implements MatService {

	@Autowired
	private MatMapper map;

	@Override
	public List<MatVO> findreq(MatVO vo) {
		return map.findreq(vo);
	}

	@Override
	public List<MatVO> findgiup(MatVO vo) {
		return map.findgiup(vo);
	}

	@Override
	public List<MatVO> findMat(MatVO vo) {
		return map.findMat(vo);
	}

	@Override
	public List<MatVO> inputgiup(MatVO vo) {
		return map.inputgiup(vo);
	}

	@Override
	public List<MatVO> inModalSearch(String startD, String endD) {
		return map.inModalSearch(startD, endD);
	}



}
