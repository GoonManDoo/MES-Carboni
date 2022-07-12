package co.carboni.prj.mat.service;

import java.util.List;

import co.carboni.prj.mat.vo.MatVO;


public interface MatService {
	//전체조회
	List<MatVO> matordselect(MatVO vo);
	
	List<MatVO> matcostomer(MatVO vo);
	
	
	

}
