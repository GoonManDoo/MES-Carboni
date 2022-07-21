package co.carboni.prj.mat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.carboni.prj.mat.mapper.MatMapper;
import co.carboni.prj.mat.vo.MatVO;

@Service
public class MatServiceImpl implements MatService {

	@Autowired
	MatMapper map;

	@Override
	public List<MatVO> findreq(MatVO vo) {
		return map.findreq(vo);
	}

	@Override
	public List<MatVO> findMat(MatVO vo) {
		return map.findMat(vo);
	}

	@Override
	public List<MatVO> inModalSearch(String startD, String endD) {
		return map.inModalSearch(startD, endD);
	}

	@Override
	public List<MatVO> findSearchComList(String csname) {
		return map.findSearchComList(csname);
	}

	@Override
	public List<MatVO> findSearchMat(String miname) {
		return map.findSearchMat(miname);
	}

	@Override
	public List<MatVO> findComList(MatVO vo) {
		return map.findComList(vo);
	}

	@Override
	public List<MatVO> findReqDate(String startD, String endD, String cusCode, String matCode) {
		return map.findReqDate(startD, endD, cusCode, matCode);
	}

	@Override
	public List<MatVO> findCode(String cusCode, String matCode) {
		return map.findCode(cusCode, matCode);
	}

	@Override
	public List<MatVO> addRequestList(List<MatVO> list) {
		List<MatVO> reqList = new ArrayList<MatVO>();
		System.out.println(list.size());
		for (MatVO vo : list) {
			map.addRequestList(vo);
			if(map.selectReqList(vo).get(0).getReqnum() !=null) {
				map.updateReqStat(vo);
				reqList.add((MatVO) map.selectReqList(vo).get(0));
			}else if(map.selectReqList(vo).get(0).getReqnum() ==null){
				reqList.add((MatVO) map.selectReqList(vo).get(0));
			}
		}
		return reqList;
	}

	@Override
	public void findDelreq(MatVO vo) {
		map.findDelreq(vo);
	}

	

	//-------------------------------------------------
	@Override
	public List<MatVO> addInputList(MatVO vo) {
		System.out.println(map.addInputList(vo));
		map.addInputList(vo);
		System.out.println(map.selectInput(vo));
		return map.selectInput(vo);
	}
	
	



}
