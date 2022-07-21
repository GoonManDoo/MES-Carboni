package co.carboni.prj.produce.vo;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ProdOrderVO {
	
	// 생산지시조회
	
	
	// 생산지시등록
		public String pcnum; // 생산지시번호
		@DateTimeFormat(pattern="yyyy-MM-dd")
		@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
		public Date pcdate; // 지시일자
		public String pcname; // 생산지시명
		public String pcnote; // 생산지시비고
		public String pcdkeeper; // 생산관리자
		public String pcstatus; // 생산지시상태
	
	
	// 생산지시상세등록
		public String pcdnum; // 생산지시상세번호
	
	// 생산지시수정
	
	
	// 생산지시삭제
	
	
	// 미지시계획조회 모달
		public String ppnum; // 계획번호
		@DateTimeFormat(pattern="yyyy-MM-dd")
		@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
		public Date ppdate; // 계획일자
		public String ppname; // 계획명
		public String ppnote; // 비고
	
	
	// 전체계획 + 생산지시상세
		public List<String> planNums; // 미지시계획조회에서 가져온 계획번호 배열
	
		public String ppdnum; // 계획상세번호
		public String giname; // 제품명
		public String gicode; // 제품코드
		@DateTimeFormat(pattern="yyyy-MM-dd")
		@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
		public Date prclose; // 마감일자
		public String lineid; // 라인번호
		public int ppadam; // 계획량
		public int pcdam; // 지시량
		public String pcddiv; // 생산구분
		@DateTimeFormat(pattern="yyyy-MM-dd")
		@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
		public Date pcdsdate; // 작업시작일
		@DateTimeFormat(pattern="yyyy-MM-dd")
		@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
		public Date pcdedate; // 작업마감일
	
		
	// 제품정보, 자재정보
		public String micode; // 자재코드
		public String miname; // 자재명
		public int bam; // 소요량(사용량)
		public int msciam; // 재고량
		
	// 부족한 자재 요청
		// 자재코드
		public int orderAmount; // 발주요청량
		
		
	// 생산공정
		public String picodeid; // 공정코드
		public String piname; // 공정명
		public String pione; // 1차공정
		public String pitwo; // 2차공정
		public String pithree; // 3차공정
		public String pifour; // 4차공정
		public int pidate; // 공정일수
		
		
	// 현장담당자(사원)
		public String ecode; // 사원코드
		public String ename; // 사원명
		public String eposition; // 직책
	
	// 재생산이 필요한 불량내역
		public String genum; // 불량내역번호
		public Date gedate; // 불량일자
		public String phnum; // 작업번호
		// 제품코드
		public String phdnum; // 작업상세번호
		public String ccodeid; // 공통코드id
		public String cexplaind; // 공통상세분류
		public String gedetail; // 불량내역
		public int gegdan; // 불량량
		public String gestatus; // 재생산상태
		
	// 선택한 계획의 제품정보
	
	
	// 해당 제품의 자재정보
	
	
	// 해당제품의 공정
	
	
}
