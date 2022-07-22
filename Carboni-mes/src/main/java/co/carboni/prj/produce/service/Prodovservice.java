package co.carboni.prj.produce.service;

import java.util.List;

import co.carboni.prj.produce.vo.PrododVO;
import co.carboni.prj.produce.vo.ProdovVO;

public interface Prodovservice {
	List<ProdovVO> selectProdov();
	List<PrododVO> plancal();
}
