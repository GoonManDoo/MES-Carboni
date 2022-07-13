package co.carboni.prj.system.vo;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/*
 * Program Name : 설비관리 VO
 * Write by : 김주환
 * Date : 2022.07.13
 * Version : 1.0.0
 * 
 */

@Data
public class SysmanVO {
	
	//설비정보
	private String sinum; //설비번호
	private String siname;//설비명
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date sidate;//설비 입고일
	private Date sidie;//설비 가동한계기간
	private Date simaint;//설비 점검주기
	
	//설비관리
	private String smnum;//설비관리번호
	private String smcons;//소모품명
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date smnextdat;//설비 다음 점검일
	private String smstatus;//설비 가동여부
	private int smobjam;//설비 제품생산량
	private String smspeed;//설비 공정속도
	private int smtmpman;//설비 온도관리
	
	
}
