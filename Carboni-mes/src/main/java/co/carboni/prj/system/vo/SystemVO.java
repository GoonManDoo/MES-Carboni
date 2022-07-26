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
public class SystemVO {
	
	//설비정보
	private String sinum; //설비번호
	private String siname;//설비명
	
	//공정정보
	private String picodeid;//공정번호
	private String piname; //공정이름
	private String pione; //1번공정
	private String pitwo; //2번공정
	private String pithree; //3번공정
	private String pifour; //4번공정
	private String pidate; //공정 소요일수
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date sidate;//설비 입고
	private Date sidie;//설비 가동한계기간
	private int simaint;//설비 점검주기
	private String NEXTDAT;//다음 점검일
	
	//설비관리
	private String smnum;//설비관리번호
	private String smcons;//소모품명
	
	
	private String smstatus;//설비 가동여부
	private String sisaftem;//설비 온도관리
	
	
	private int phdmkam; //생산량
	private int phderram; //불량량
}
