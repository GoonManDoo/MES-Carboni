package co.carboni.prj.mat.vo;

import java.sql.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Program Name : 재고 관리 VO
 * Write by : 유해정
 * Date : 2022.07.11
 * Version : 1.0
*/

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MatVO {
	
	// 생산에서 넘어오는 발주 
	private String reqnum; //요청번호
	private String micode; //자재코드
	private int mrreqam; //발주요청량
	private String miname; //자재명
	private String mrstatus; //처리상태
	
	//발주 에서 기업 검색시 조회 입고일자에서 조회할떄도 사용
	private String cscode; //기업코드
	private String csname; //기업명
	private String csnum; //사업자번호
	private String cstel; //전화번호
	
	//발주에서 자재 검색시 조회
	private String mistand; //규격
	private int miunit; //자재단위
	
	//발주일자로 검색 시 조회
	private String monum; //발주코드
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date moodate; //발주일자
	private int moaskam;//주문수량
	private String mostatus;//발주상태
	private int msciam;//자재량
	
	//전체 조회할때
	private int misafe; //자재안전재고량
	private int mscoam; //이월량
	private int msinam; //입고량
	private int msoutam; //출고량
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date msoutdate; //출고일자
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date msindate; //입고일자
	private String pcdnum; //생산지시번호
	
	private String monote; //발주비고
	private String msnum; //입출고 번호 (앞에 붙는 문제에따라 다름)
	private String mlnum; //lot번호
	private String msnote; //입고의 비고
	
	private String matnum; //자재관리번호
	private int msunam; //미달량(총자재량-안전재고)
	


}
