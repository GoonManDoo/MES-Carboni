package co.caboni.prj.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MatController {

	//발주관리
	@RequestMapping("/matOrder.do")
	public String matOrder(Model model) {
	 return "mat/matOrder";
	}
	//발주 모달 내용 반환 
	@RequestMapping("/matAdd.do")
	public String matAdd() {
		return "modal/matAdd";
	}
	
	//입고관리
	@RequestMapping("/matInsert.do")
	public String matInsert(Model model) {
		return "mat/matInsert";
	}
	
	//입출고 모달
	@RequestMapping("/matInsertAdd.do")
	public String matInsertAdd() {
		return "modal/matInsertAdd";
	}
	
	//lot 관리
	@RequestMapping("/matLot.do")
	public String matLot() {
		return "mat/matLot";
	}
	
	//출고관리
	@RequestMapping("/matoutput.do")
	public String matoutput() {
		return "mat/matoutput";
	}
	
	//안전재고 및 재고 조회
	@RequestMapping("/matList.do")
	public String matList() {
		return "mat/matList";
	}
}
