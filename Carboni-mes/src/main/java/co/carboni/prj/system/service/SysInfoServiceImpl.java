package co.carboni.prj.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.carboni.prj.system.mapper.SysinfoMapper;
import co.carboni.prj.system.vo.SysmanVO;

public class SysInfoServiceImpl implements SysinfoService{

	@Autowired
	public SysinfoMapper map;

	@Override
	public List<SysmanVO> selectSysAll() {
		return map.selectSysAll();
	}

	@Override
	public int systemInsert(SysmanVO vo) {
		return map.systemInsert(vo);
	}

	@Override
	public int systemDelete(SysmanVO vo) {
		return map.systemDelete(vo);
	}

	@Override
	public int systemUpdate(SysmanVO vo) {
		return map.systemUpdate(vo);
	}
	
	
	

}
