package co.carboni.prj.mat.vo;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/*
 * Program Name : 재고 관리 VO
 * Write by : 유해정
 * Date : 2022.07.11
 * Version : 1.0
*/

@Data
public class MatVO {

	// 자재lot
	private String mlnum; // 자재lot_no
	private int mlam; // lot 수량

	// 자재입출고관리
	private String msnum; // 입출고번호
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date msdate; // 입출고일자
	private int msam; // 입출고량
	private String msdiv; // 입출 구분
	private String msnote; // 비고



	// 자재발주 관리
	private String monum; // 발주번호
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date moodate; // 발주일자
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date mordate; // 입고일자
	private int mooam; // 발주량
	private int momatam; // 자재량
	private int moaskam; // 주문수량
	private String mostatus; // 발주상태
	private String moname; //자재명
	private String mocostomer; //거래처명

	// 자재재고
	private String matnum; // 재고관리번호
	private int mscoam; // 이월량
	private int msciam; // 현재고
	private String matnote; // 비고

}
