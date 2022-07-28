package co.carboni.prj.produce.vo;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class PrododVO {
	private String pcnum;//지시번호
	private String pcname;//지시이름 
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
	private String pcdsdate; //시작일 
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
	private String pcdedate; //마감일
	
	private String pcstatus; //공정상태
	private String pcnote; //비고
	private String lineid; //라인번호
	private int pcdaml; //지시량
	private String giname; //제품명
	
	
	

}
