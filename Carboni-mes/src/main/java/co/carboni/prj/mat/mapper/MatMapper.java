package co.carboni.prj.mat.mapper;

import java.util.List;

import co.carboni.prj.mat.vo.MatVO;

public interface MatMapper {
	List<MatVO> noticeSelectList(int state, String key);
}
