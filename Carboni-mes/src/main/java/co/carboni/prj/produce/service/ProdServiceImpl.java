package co.carboni.prj.produce.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.carboni.prj.mat.vo.MatVO;
import co.carboni.prj.produce.mapper.ProdMapper;
import co.carboni.prj.produce.vo.ProcMoniterVO;
import co.carboni.prj.produce.vo.ProdOrderVO;
import co.carboni.prj.produce.vo.ProdPlanVO;

@RestController
@Service
public class ProdServiceImpl implements ProdService {
	
	@Autowired
	ProdMapper mapper;
	
	// 생산계획관리

		// 생산계획검색
		@Override
		public List<ProdPlanVO> searchPlan(String pstartDt, String pendDt, String pstatus) {
			return mapper.searchPlan(pstartDt, pendDt, pstatus);
		}
		
		// 생산계획 로드
		@Override
		public ProdPlanVO prodPlan(String findNum) {
			return mapper.prodPlan(findNum);
		}
		
		// 생산계획상세 로드
		@Override
		public List<ProdPlanVO> prodPlanDetail(String findDNum) {
			return mapper.prodPlanDetail(findDNum);
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
			mapper.requestMat(vo);
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
				mapper.addPPlanDetail(vo); // 계획등록
				if(vo.getPrnum() != null) {
				mapper.updatePReqStat(vo); // 생산의뢰 상태 수정
				}
			}
		}

		// 생산계획수정
		@Override
		public void updateProdPlan(ProdPlanVO vo) {
			mapper.updateProdPlan(vo);
			mapper.delupPPdetail(vo); // 수정을 위한 삭제
		}
		
		/*
		 * // 생산계획상세수정
		 * 
		 * @Override public void upPPlanDetail(List<ProdPlanVO> plans) { for (ProdPlanVO
		 * vo : plans) { mapper.upPPlanDetail(vo); } }
		 */
		
		// 생산계획삭제
		@Override
		public void removeProdPlan(ProdPlanVO vo) {
			mapper.removeProdPlan(vo);
			//mapper.removePPlanDetail(vo);
		}

		
	// 생산계획관리
		
		// 미지시계획조회
		@Override
		public List<ProdOrderVO> unorderList(String startDt, String endDt) {
			return mapper.unorderList(startDt, endDt);
		}
		
		// 생산지시에 계획목록 추가
		@Override
		public List<ProdOrderVO> addPlan(ProdOrderVO vo) {
			return mapper.addPlan(vo);
		}

		// 생산계획그리드 클릭시 제품, 자재정보 조회
		@Override
		public List<ProdOrderVO> goodsInfo(String gic) {
			return mapper.goodsInfo(gic);
		}
		
		// 생산계획에 등록한 라인번호에 해당하는 공정정보
		@Override
		public List<ProdOrderVO> procInfo(String gic) {
			return mapper.procInfo(gic);
		}

		// 생산현장 담당자 등록을 위한 사원 조회
		@Override
		public List<ProdOrderVO> empList(String posit) {
			return mapper.empList(posit);
		}

		// 생산지시등록
		@Override
		public int addProdOrder(ProdOrderVO vo) {
			mapper.addProdOrder(vo);
			return 1;
		}
		
		// 생산지시상세등록 + 재등록
		@Override
		public void addPOrderDetail(List<ProdOrderVO> orders) {
			for (ProdOrderVO vo : orders) {
				mapper.addPOrderDetail(vo); // 지시상세등록(라인번호로 소요일수 검색, 지시상세등록, 해당 계획번호 찾아와서 상태 업데이트)
			}
		}
		
		// 재생산이 필요한 제품불량내역
		@Override
		public List<ProdOrderVO> reprodList(ProdOrderVO vo) {
			return mapper.reprodList(vo);
		}
		
		// 생산지시수정
		@Override
		public void updateOrder(ProdOrderVO vo) {
			mapper.updateOrder(vo);
		}
		
		// 생산지시상세수정
		@Override
		public void updateOrDetail(List<ProdOrderVO> orders) {
			for(ProdOrderVO vo : orders) {
				mapper.updateOrDetail(vo);
			}
		}
		
		// 생산지시조회모달 검색
		@Override
		public List<ProdOrderVO> searchOrder(String ostartDt, String oendDt, String ostatus) {
			return mapper.searchOrder(ostartDt, oendDt, ostatus);
		}

		// 생산지시 페이지로드
		@Override
		public ProdOrderVO prodOrder(String findNum) {
			return mapper.prodOrder(findNum);
		}

		// 생산지시상세 페이지로드
		@Override
		public List<ProdOrderVO> prodOrderDetail(String findDNum) {
			return mapper.prodOrderDetail(findDNum);
		}
		
		// 생산지시삭제
		@Override
		public void removeProdOrder(ProdOrderVO vo) {
			mapper.removeProdOrder(vo);
		}

		
	// 생산지시조회
		
		// 생산지시
		@Override
		public List<ProdOrderVO> orderView(String orderDtS, String orderDtE, String orderDiv) {
			return mapper.orderView(orderDtS, orderDtE, orderDiv);
		}
		
		// 생산지시상세
		@Override
		public List<ProdOrderVO> orderDView(ProdOrderVO vo) {
			return mapper.orderDView(vo);
		}
		
	// 공정모니터링
		
		// 공정진행관리
		
			// 생산지시목록 검색
			@Override
			public List<ProcMoniterVO> callOrder(String workDt) {
				return mapper.callOrder(workDt);
			}
			
			// 진행생산지시
			@Override
			public List<ProcMoniterVO> loadOrder(String findNum) {
				return mapper.loadOrder(findNum);
			}

			// 공정목록
			@Override
			public List<ProcMoniterVO> loadProdLine(ProcMoniterVO vo) {
				return mapper.loadProdLine(vo);
			}
			
			// 자재출고 insert, 자재재고 update
			@Override
			public void updateMat(ProcMoniterVO vo) {
				mapper.updateMat(vo);
			}

			// 더미테이블 지시번호, 설비번호 등록
			@Override
			public void insertSinum(ProcMoniterVO vo) {
				mapper.insertSinum(vo);
			}
			
			// 더미테이블 시작시간, 종료시간 조회
			@Override
			public ProcMoniterVO loadTime(ProcMoniterVO vo) {
				return mapper.loadTime(vo);
			}
			
			// 생산완료되면 공정진행에 insert, 수주상태와 영업재고 update
			@Override
			public int insertProcHead(ProcMoniterVO vo) {
				mapper.updateConStk(vo);
				mapper.insertProcHead(vo);
				return 1;
			}
			
			// 생산완료되면 공정진행상세에 insert
			@Override
			public void insertProcHeadD(List<ProcMoniterVO> heads) {
				for(ProcMoniterVO vo : heads) {
					mapper.insertProcHeadD(vo);
				}
			}

			// 스케줄링
			@Override
			public void schedule(String sinum1, String sinum2) {
				mapper.schedule(sinum1, sinum2);
			}

			// 긴급중지
			@Override
			public void emerStop() {
				mapper.emerStop();
			}
			@Override
			public List<ProcMoniterVO> selectEmer() {
				return mapper.selectEmer();
			}
			
			// 재시작
			@Override
			public void restart() {
				mapper.restart();
			}
			//@Override
			//public List<ProcMoniterVO> selectEmer2() {
			//	return mapper.selectEmer2();
			//}
			
			
		// 실적모니터링

			// 생산실적 클릭시 공정별 생산내역 확인
			@Override
			public List<ProcMoniterVO> searchHead(ProcMoniterVO vo) {
				return mapper.searchHead(vo);
			}

			// 라인번호 클릭시 생산실적
			@Override
			public List<ProcMoniterVO> lineProd(ProcMoniterVO vo) {
				return mapper.lineProd(vo);
			}
			
			// 생산일자로 생산실적 검색
			@Override
			public List<ProcMoniterVO> lineProdDt(String prodDtS, String prodDtE, String lineid) {
				return mapper.lineProdDt(prodDtS, prodDtE, lineid);
			}
			
			// 불량내역 등록
			@Override
			public void errorInsert(ProcMoniterVO vo) {
				mapper.errorInsert(vo);
			}
			
			
		// 불량내역 조회
			
			// 생산실적 엑셀
			@Override
			public List<Map<String, Object>> errorExcel(MatVO vo) {
				return mapper.errorExcel(vo);
			}



			

			

			

			
			
			
			

		


		

		

		
		

		


	

	

}
