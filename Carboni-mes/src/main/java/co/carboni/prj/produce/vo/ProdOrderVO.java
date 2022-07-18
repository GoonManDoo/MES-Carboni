package co.carboni.prj.produce.vo;

import java.util.Date;
import java.util.List;

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
	
	
	// 생산지시상세등록
	
	
	// 생산지시수정
	
	
	// 생산지시삭제
	
	
	// 미지시계획조회 모달
		public String ppnum; // 계획번호
		@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
		public Date ppdate; // 계획일자
		public String ppname; // 계획명
		public String ppnote; // 비고
	
	
	// 전체계획
		public List<String> planNums; // 미지시계획조회에서 가져온 계획번호 배열
	
	
	// 선택한 계획의 제품정보
	
	
	// 해당 제품의 자재정보
	
	
	// 부족한 자재 요청
	
	
	// 해당제품의 공정
	
	
}
