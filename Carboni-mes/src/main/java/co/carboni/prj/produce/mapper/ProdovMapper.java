package co.carboni.prj.produce.mapper;

import java.util.List;

import co.carboni.prj.produce.vo.ProcMoniterVO;
import co.carboni.prj.produce.vo.PrododVO;
import co.carboni.prj.produce.vo.ProdovVO;

public interface ProdovMapper {
	List<ProdovVO> selectProdov();
	List<PrododVO> plancal();
	List<ProcMoniterVO> formon();
	
	public List<PrododVO> detailList(PrododVO vo);
}
