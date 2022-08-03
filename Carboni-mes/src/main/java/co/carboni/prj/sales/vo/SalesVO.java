package co.carboni.prj.sales.vo;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class SalesVO {

	//제품불량내역
	public String genum;     //불량내역번호
	public String phdnum;    //작업상세번호
	public String ccodeid;   //코드ID
	@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
	public Date gedate;      //불량일자
	public String gedetail;  //불량내역
	public int gegdam;       //불량량
	public String gestatus;  //여부
	public String picodeid;  //공정코드
	public String cexplaind; //불량명
	public String phnum;     //작업번호
	//public String gicode;    //제품코드
	//public String giname;    //제품명
	
	//수주관리
	public String cnnum;    //수주번호
	public int cnam;        //수주수량
	public int cnrest; 	    //수주잔량
	@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
	public Date cndate;     //수주일자
	@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
	public Date cnperiod;   //납기일자
	
	public String gicode;   //제품코드(fk) 
	public String giname;   //제품명
	public String giunit;   //제품단위
	
	public String cscode;   //거래처코드(fk)
	public String csname;   //거래처이름
	public String csnum;    //사업자번호
	public String cstel;    //거래처전화번호
	public String cnstatus; //출하진행상태
	
	public List<String> cnList;  //삭제할 수주번호 목록
	public List<String> prList;  //삭제할 생산의뢰번호 목록
	public List<String> shList;  //삭제할 출하번호목록
	public List<String> gsmList; //삭제할 제품재고목록
	public List<String> dList;	 //삭제할 배송목록
	
	
	//생산의뢰관리
	public String prnum;    //의뢰번호
	@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public Date prclose;    //마감일자
	public String prstatus; //마감여부
	
	
	//출하관리 => 거래처코드, 제품코드는 DB에서 변수에 담아서 사용하기!
	public String shnum;    //출하번호
	public int sham;        //출하수량
	@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
	public Date shdate;     //출고일자
	public String shstatus; //진행상태
	public int shdam;       //금번출하수량
	
	
	//배송관리
	public String dnum;     //배송번호
	public String dcode;    //거래처코드(배송용)
	
	//제품재고관리
	public String gsmnum; 	//제품재고관리번호
	public int gsam;        //제품재고량
	public int gisafe; 		//제품안전재고
	
}
