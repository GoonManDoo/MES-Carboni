package co.carboni.prj.produce.vo;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class ProdPlanVO {
	
	// 생산계획조회
		public String ppnum; // 생산계획번호
		@DateTimeFormat(pattern="yyyy-MM-dd")
		@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
		public Date ppdate; // 생산계획일자
		public String ppname; // 생산계획명
		public String ppstatus; // 계획상태
		public String ppnote; // 비고
	
	// 생산계획등록
		// 생산계획번호
		// 생산계획일자
		// 생산계획명
		// 계획상태
		// 비고
		
	// 생산계획상세등록
		public String[] allData; // 등록시 넘어온 배열객체
		public String ppdnum; // 생산계획상세번호
		// 생산계획번호
		// 의뢰번호
		// 제품코드
		// 기계획량
		// 미계획량
		// 작업일자
		
	// 생산계획수정
		
	// 생산계획삭제
	
	// 미생산주문조회 모달
		public String prnum; // 의뢰번호
		@DateTimeFormat(pattern="yyyy-MM-dd")
		@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
		public Date cndate; // 수주일자
		public String csname; // 거래처이름
		@DateTimeFormat(pattern="yyyy-MM-dd")
		@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
		public Date prclose; // 마감일자
	
	// 전체제품
		public List<String> rqNum; // 미생산주문조회에서 가져온 의뢰번호 배열
		
		public String gicode; // 제품코드
		public String giname;// 제품명
		public String giunit;// 제품단위
		public String cexplain; // 단위코드명
		// 의뢰번호
		// 마감일자
		public int cnrest; // 수주잔량
		public int ppdam; // 기계획량
		public int uplam; // 미계획량
		@DateTimeFormat(pattern="yyyy-MM-dd")
		@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
		public Date ppddate; // 작업일자
		
	// 선택한 제품의 자재목록
		// 수주잔량
		public String micode; // 자재코드
		public String miname; // 자재명
		public int bam; // 소요량(사용량)
		public int msciam; // 재고량
		
	// 부족한 자재 요청
		// 자재코드
		public int orderAmount; // 발주요청량
	
	
}
