package co.carboni.prj.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.carboni.prj.common.mapper.BomMapper;
import co.carboni.prj.common.vo.BomVO;
import co.carboni.prj.common.vo.GoodsinfoVO;

@Repository("bomDAO")
public class BomServiceImpl implements Bomservice{
	
	@Autowired
	public BomMapper map;

	@Override
	public List<BomVO> selectBom(BomVO vo) {
		return map.selectBom(vo);
	}

	@Override
	public int bominsert(BomVO vo) {
		return map.bominsert(vo);
	}

	@Override
	public int bomdelete(BomVO vo) {
		return map.bomdelete(vo);
	}

	@Override
	public List<GoodsinfoVO> selectGoods(GoodsinfoVO vo) {
		return map.selectGoods(vo);
	}

}
