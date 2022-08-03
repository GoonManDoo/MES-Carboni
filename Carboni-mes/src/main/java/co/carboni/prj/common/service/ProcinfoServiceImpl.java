package co.carboni.prj.common.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.carboni.prj.common.mapper.ProcinfoMapper;
import co.carboni.prj.common.vo.ProcinfoVO;

@Repository("procinfoDAO")
public class ProcinfoServiceImpl implements Procinfoservice{
	
	@Autowired
	public ProcinfoMapper map;

	@Override
	public List<ProcinfoVO> selectProcinfo() {
		return map.selectProcinfo();
	}

	@Override
	public int procinfoinsert(ProcinfoVO vo) {
		return map.procinfoinsert(vo);
	}

	@Override
	public int procinfodelete(ProcinfoVO vo) {
		return map.procinfodelete(vo);
	}

	@Override
	public int procinfoupdate(ProcinfoVO vo) {
		return map.procinfoupdate(vo);
	}

	@Override
	public List<ProcinfoVO> selectLine(ProcinfoVO vo) {
		return map.selectLine(vo);
	}

	@Override
	public List<Map<String, Object>> procinfoEx(ProcinfoVO vo) {
		return map.procinfoEx(vo);
	}

}
