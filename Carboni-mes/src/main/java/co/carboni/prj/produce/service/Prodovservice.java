package co.carboni.prj.produce.service;

import java.util.List;

import co.carboni.prj.produce.vo.ProcMoniterVO;
import co.carboni.prj.produce.vo.PrododVO;
import co.carboni.prj.produce.vo.ProdovVO;

public interface Prodovservice {
	List<ProdovVO> selectProdov();
	List<PrododVO> plancal();
	List<ProcMoniterVO> formon();
	//이벤트 클릭시 상세 보기
	public List<PrododVO> detailList(PrododVO vo);
	
}
