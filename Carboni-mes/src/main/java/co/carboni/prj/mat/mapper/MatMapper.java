package co.carboni.prj.mat.mapper;

import java.util.List;

import co.carboni.prj.mat.vo.MatVO;

public interface MatMapper {
	List<MatVO> matordselect(MatVO vo);
	List<MatVO> matcostomer(MatVO vo);
}
