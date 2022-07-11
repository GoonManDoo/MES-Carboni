package co.carboni.prj.mat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.carboni.prj.mat.mapper.MatMapper;
import co.carboni.prj.mat.vo.MatVO;

public class MatServiceImpl implements MatService {

	@Autowired
	private MatMapper map;

	@Override
	public List<MatVO> noticeSelectList(MatVO vo) {
		return null;
	}



}
