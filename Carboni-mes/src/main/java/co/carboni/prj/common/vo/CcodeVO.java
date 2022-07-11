package co.carboni.prj.common.vo;

import lombok.Data;

@Data
public class CcodeVO {  //Common이지만 패키지명과 겹쳐서 Ccode로 함
	private String ccodeid;
	private String cclass;
	private String cclassd;
	private String cexplain;
	private String cexplaind;
	private String cnote;
}
