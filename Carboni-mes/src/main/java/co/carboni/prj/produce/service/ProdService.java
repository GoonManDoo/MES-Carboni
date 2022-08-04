package co.carboni.prj.produce.service;

import java.util.List;
import java.util.Map;

import co.carboni.prj.mat.vo.MatVO;
import co.carboni.prj.produce.vo.ProcMoniterVO;
import co.carboni.prj.produce.vo.ProdOrderVO;
import co.carboni.prj.produce.vo.ProdPlanVO;

public interface ProdService {
	
	// 생산계획관리
	
		// 생산계획검색
		public List<ProdPlanVO> searchPlan(String pstartDt, String pendDt, String pstatus);
		
		// 생산계획 페이지로드
		public ProdPlanVO prodPlan(String findNum);
		
		// 생산계획상세 로드
		public List<ProdPlanVO> prodPlanDetail(String findDNum);
	
		// 미생산주문조회 - 기간검색
		public List<ProdPlanVO> findUnprod(String startDt, String endDt);
		
		// 생산계획에 추가할 제품 목록
		public List<ProdPlanVO> planProduct(ProdPlanVO vo);
		
		// 생산계획에서 선택한 제품의 자재목록
		public List<ProdPlanVO> matList(String prnum);
		
		// 생산계획에서 부족한 자재 발주요청
		public void requestMat(ProdPlanVO vo);
			
		// 생산계획등록
		public int addProdPlan(ProdPlanVO vo);
			
		// 생산계획상세등록 + 수정 시 재등록
		public void addPPlanDetail(List<ProdPlanVO> plans);

		// 생산계획수정
		public void updateProdPlan(ProdPlanVO vo);
		
		// 생산계획삭제
		public void removeProdPlan(ProdPlanVO vo);

		
		
	// 생산지시관리
		
		// 미지시계획조회 - 기간검색
		public List<ProdOrderVO> unorderList(String startDt, String endDt);
		
		// 생산지시에 계획 추가
		public List<ProdOrderVO> addPlan(ProdOrderVO vo);
		
		// 생산계획에서 선택한 제품의 제품, 자재정보
		public List<ProdOrderVO> goodsInfo(String gic);

		// 생산계획에 등록한 라인번호에 해당하는 공정번호
		public List<ProdOrderVO> procInfo(String gic);

		// 생산현장담당자 등록을 위한 사원 조회
		public List<ProdOrderVO> empList(String posit);

		// 생산지시등록
		public int addProdOrder(ProdOrderVO vo);
		
		// 생산지시상세등록 + 수정 시 재등록
		public void addPOrderDetail(List<ProdOrderVO> orders);

		// 재생산이 필요한 제품불량내역
		public List<ProdOrderVO> reprodList(ProdOrderVO vo);
		
		// 생산지시수정
		public void updateOrder(ProdOrderVO vo);
		
		// 생산지시상세수정
		public void updateOrDetail(List<ProdOrderVO> orders);

		// 생산지시조회모달 검색
		public List<ProdOrderVO> searchOrder(String ostartDt, String oendDt, String ostatus);

		// 생산지시 페이지로드
		public ProdOrderVO prodOrder(String findNum);

		// 생산지시상세 페이지로드
		public List<ProdOrderVO> prodOrderDetail(String findDNum);

		// 생산지시삭제
		public void removeProdOrder(ProdOrderVO vo);

	
	// 생산지시조회
		
		// 생산지시
		public List<ProdOrderVO> orderView(String orderDtS, String orderDtE, String orderDiv);
		
		// 생산지시상세
		public List<ProdOrderVO> orderDView(ProdOrderVO vo);
		
	// 공정모니터링
		
		// 공정진행관리
		
			// 생산지시목록 검색
			public List<ProcMoniterVO> callOrder(String workDt);
			
			// 진행생산지시
			public List<ProcMoniterVO> loadOrder(String findNum);

			// 공정목록
			public List<ProcMoniterVO> loadProdLine(ProcMoniterVO vo);
			
			// 자재출고 insert, 자재재고 update
			public void updateMat(ProcMoniterVO vo);
			
			// 더미테이블 지시번호, 설비번호 입력
			public void insertSinum(ProcMoniterVO vo);
			
			// 더미테이블 시작시간, 종료시간 조회
			public ProcMoniterVO loadTime(ProcMoniterVO vo);
			
			// 생산완료되면 공정진행에 insert, 수주상태와 영업재고 update
			public int insertProcHead(ProcMoniterVO vo);

			// 생산완료되면 공정진행상세에 insert
			public void insertProcHeadD(List<ProcMoniterVO> heads);
			
			// 스케줄링
			public void schedule(String sinum1, String sinum2); // 두번째 공정
			
			// 긴급중지
			public void emerStop();
			public List<ProcMoniterVO> selectEmer();

			// 재시작
			public void restart();
			//public List<ProcMoniterVO> selectEmer2();
			
		// 실적모니터링

			// 생산실적 클릭시 공정별 생산내역 확인
			public List<ProcMoniterVO> searchHead(ProcMoniterVO vo);
			
			// 라인번호 클릭시 생산실적
			public List<ProcMoniterVO> lineProd(ProcMoniterVO vo);
			
			// 생산일자로 생산실적 검색
			public List<ProcMoniterVO> lineProdDt(String prodDtS, String prodDtE, String lineid);
			
			// 불량내역 등록
			public void errorInsert(ProcMoniterVO vo);

			
		// 불량내역조회
			
			// 불량내역 엑셀
			public List<Map<String, Object>> errorExcel(MatVO vo);



			



			





		

		

		

			
			

}
