package co.carboni.prj.produce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.carboni.prj.produce.mapper.ProdovMapper;
import co.carboni.prj.produce.vo.ProdovVO;

@Repository("prodovDAO")
public class ProdovServiceImpl implements Prodovservice{
	
	@Autowired
	public ProdovMapper m;

	@Override
	public List<ProdovVO> selectProdov() {
		return m.selectProdov();
	}

}
