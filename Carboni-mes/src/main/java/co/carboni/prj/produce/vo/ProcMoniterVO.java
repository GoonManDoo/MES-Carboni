package co.carboni.prj.produce.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class ProcMoniterVO {

	// 공정진행관리
		
		// 생산지시목록
		public String pcnum; // 생산지시번호
		public String pcdnum; // 생산지시상세번호
		@DateTimeFormat(pattern="yyyy-MM-dd")
		@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
		public Date pcdate; // 지시일자
		public String pcname; // 생산지시명
		public String pcnote; // 생산지시비고
		public String pcstatus; // 생산지시상태
		public String gicode; // 제품코드
		public String giname; // 제품명
		public int pcdam; // 지시량
		
		// 진행생산지시
		public String pcdkeeper; // 생산관리자
		public String lineid; // 라인번호
		
		// 공정목록
		public String phnum; // 작업번호
		public String phdnum; // 작업상세번호
		@DateTimeFormat(pattern="yyyy-MM-dd")
		@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
		public Date phdate; // 작업일자
		public String picodeid; // 공정코드
		public String piname; // 공정명
		public String sinum; // 설비번호
		public String phdstime; // 시작시간
		public String phdetime; // 종료시간
		public int phdmkam; // 공정생산량
		public int phderram; // 공정불량량
		public String phdstat; // 가동상태
		public int phmkam; // 최종 생산량
		public int pherram; // 총 불량량
		
		// 더미데이터
		public int linenum; // 라인에 사용되는 공정 순서
		
	
	// 실적모니터링
		
		
}
