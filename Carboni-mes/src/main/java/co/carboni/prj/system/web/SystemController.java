package co.carboni.prj.system.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//설비 메인화면
public class SystemController {
	@RequestMapping("/productSysMain")
		public String productSysMain() {
		return "system/productSysMain";
	}
	
	//설비 자세히 보기
	@RequestMapping("/detailShow.do")
	public String detailShow() {
		return "system/modal/detailShow";
	}
	
	//설비 폐기중
	@RequestMapping("/DisposalSysIng.do")
	public String DisposalSysIng() {
		return "system/modal/DisposalSysIng";
	}
	
	//설비 폐기
	@RequestMapping("/DisposalSYS.do")
	public String DisposalSYS() {
		return "system/modal/DisposalSYS";
	}
	
	//관리자 설정
	@RequestMapping("/empList.do")
	public String empList() {
		return "system/modal/empList";
	}
	
	//공정 등록
	@RequestMapping("/ProcessResist.do")
	public String ProcessResist() {
		return "system/modal/ProcessResist";
	}
	
	//설비 등록
	@RequestMapping("ProdResist/.do")
	public String ProdResist() {
		return "system/modal/ProdResist";
	}
	
	
	//설비 점검 확인중
	@RequestMapping("/SYSCheckConfirmIng.do")
	public String SYSCheckConfirmIng() {
		return "system/modal/SYSCheckConfirmIng";
	}
	
	//설비 점검 결재
	@RequestMapping("/SYSCheckConfirm.do")
	public String SYSCheckConfirm() {
		return "system/modal/SYSCheckConfirm";
	}
	
	//설비 점검 확인
	@RequestMapping("/SYSCheckMaining.do")
	public String SYSCheckMaining() {
		return "system/modal/SYSCheckMaining";
	}
	
	//설비 점검중
	@RequestMapping("/SYSCheckRunning.do")
	public String SYSCheckRunning() {
		return "system/modal/SYSCheckRunning";
	}
	
	//설비 폐기 확인
	@RequestMapping("/DisposalSysChe.do")
	public String DisposalSysChe() {
		return "system/modal/DisposalSYS_Che";
	}
	
	
	
}
