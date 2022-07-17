package co.carboni.prj.produce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.carboni.prj.produce.mapper.ProdMapper;
import co.carboni.prj.produce.vo.ProdPlanVO;

@RestController
public class ProdServiceImpl implements ProdService {
	
	@Autowired
	ProdMapper mapper;
	
	// 생산계획관리

		// 생산계획조회
		@Override
		public List<ProdPlanVO> searchPlan(String pstartDt, String pendDt, String pstatus) {
			return mapper.searchPlan(pstartDt, pendDt, pstatus);
		}
		
		// 미생산주문조회
		@Override
		public List<ProdPlanVO> findUnprod(String startDt, String endDt) {
			return mapper.findUnprod(startDt, endDt);
		}
	
		// 생산계획에 추가할 제품 목록
		@Override
		public List<ProdPlanVO> planProduct(ProdPlanVO vo) {
			return mapper.planProduct(vo);
		}
		
		// 생산계획에서 선택한 제품의 자재목록
		@Override
		public List<ProdPlanVO> matList(String prnum) {
			return mapper.matList(prnum);
		}
		
		// 생산계획에서 부족한 자재 발주요청
		@Override
		public void requestMat(ProdPlanVO vo) {
		}
	
		// 생산계획등록
		@Override
		public int addProdPlan(ProdPlanVO vo) {
			mapper.addProdPlan(vo);
			return 1;
		}
		
		// 생산계획상세등록 + 수정 시 재등록
		@Override
		public void addPPlanDetail(List<ProdPlanVO> plans) {
			for (ProdPlanVO vo : plans) {
				mapper.addPPlanDetail(vo);
			}
		}

		// 생산계획수정
		@Override
		public void updateProdPlan(ProdPlanVO vo) {
			mapper.updateProdPlan(vo);
			mapper.delupPPdetail(vo); // 수정을 위한 삭제
		}
		
		// 생산계획삭제
		@Override
		public void removeProdPlan(ProdPlanVO vo) {
			mapper.removeProdPlan(vo);
			mapper.removePPlanDetail(vo);
		}
		
		

		


	

	

}
