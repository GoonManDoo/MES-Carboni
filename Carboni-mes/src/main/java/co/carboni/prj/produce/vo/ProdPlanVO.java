package co.carboni.prj.produce.vo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class ProdPlanVO {
	
	// 생산계획
		public String ppnum; // 생산계획번호
		@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
		public Date ppdate; // 생산계획일자
		public String ppname; // 생산계획명
		public String ppstatus; // 계획상태
		public String ppnote; // 비고
	
	// 생산계획상세
		public String ppdnum; // 생산계획상세번호
	
	// 미생산주문조회 모달
		public String prnum; // 의뢰번호
		@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
		public Date cndate; // 수주일자
		public String csname; // 거래처이름
		@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
		public Date prclose; // 마감일자
	
	// 전체제품
		public List<String> orderNum; // 미생산주문조회에서 가져온 의뢰번호 배열
		
		public String gicode; // 제품코드
		public String giname;// 제품명
		public String giunit;// 제품단위
		public String cexplain; // 단위코드명
		// 의뢰번호
		// 마감일자
		public int cnam; // 수주수량
		public int ppdam;// 기계획량
		public int uplam;// 미계획량
		public Date ppddate;// 작업일자
	
	
}
