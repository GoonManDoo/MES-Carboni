package co.carboni.prj.common.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.carboni.prj.common.service.Bomservice;
import co.carboni.prj.common.service.Ccodeservice;
import co.carboni.prj.common.service.Costomerservice;
import co.carboni.prj.common.service.Matinfoservice;
import co.carboni.prj.common.vo.BomVO;
import co.carboni.prj.common.vo.CcodeVO;
import co.carboni.prj.common.vo.CostomerVO;
import co.carboni.prj.common.vo.GoodsinfoVO;
import co.carboni.prj.common.vo.MatinfoVO;

@Controller
public class CommonController {
	
	@Autowired private Ccodeservice ccodeDAO;
	@Autowired private Costomerservice costomerDAO;
	@Autowired private Matinfoservice matinfoDAO;
	@Autowired private Bomservice bomDAO;
	
	@RequestMapping("/ccode.do")
	public String cCode(){
		return "common/ccode";
	}
	
	@RequestMapping("bigList")
	@ResponseBody
	public List<CcodeVO> bigList() {
		List<CcodeVO> bigList = ccodeDAO.selectCodeAll();
		return bigList;
	}
	
	@RequestMapping("smallList")
	@ResponseBody
	public List<CcodeVO> smallList(CcodeVO vo) {
		List<CcodeVO> smallList = ccodeDAO.selectCodeClass(vo);
		return smallList;
	}
	
	@RequestMapping("/ccodeinsertsmall.do")
	public String cCodeInsertSmall(CcodeVO vo) {
		ccodeDAO.codeInsertSmall(vo);
		return "redirect:ccode.do";
	}
	
	@RequestMapping("/ccodeupdate.do")
	public String cCodeUpdate(CcodeVO vo) {
		ccodeDAO.codeUpdate(vo);
		return "redirect:ccode.do";
	}
	
	@RequestMapping("/codeDelete.do")
	public String codeDelete(CcodeVO vo) {
		ccodeDAO.codeDelete(vo);
		return "redirect:ccode.do";
	}
	
	//
	
	@RequestMapping("/costomer.do")
	public String costomer(Model model) {
		model.addAttribute("costList", costomerDAO.selectCostAll());
		return "common/costomer";
	}
	
	@RequestMapping("costomerinsert.do")
	public String costomerinsert(CostomerVO vo) {
		costomerDAO.costInsert(vo);
		return "redirect:costomer.do";
	}
	
	@RequestMapping("costomerupdate.do")
	public String costomerupdate(CostomerVO vo) {
		costomerDAO.costUpdate(vo);
		return "redirect:costomer.do";
	}
	
	@RequestMapping("costomerdelete.do")
	public String costomerdelete(CostomerVO vo) {
		costomerDAO.costDelete(vo);
		return "redirect:costomer.do";
	}
	
	//
	
	@RequestMapping("/matinfo.do")
	public String matInfo(Model model){
		model.addAttribute("mat", matinfoDAO.selectMatinfo());
		return "common/matinfo";
	}
	
	@RequestMapping("/matinfoinsert.do")
	public String matinfoinsert(MatinfoVO vo) {
		matinfoDAO.matinfoInsert(vo);
		return "redirect:matinfo.do";
	}
	
	@RequestMapping("/matinfodelete.do")
	public String matinfodelete(MatinfoVO vo) {
		matinfoDAO.matinfoDelete(vo);
		return "redirect:matinfo.do";
	}
	
	@RequestMapping("/matinfoupdate.do")
	public String matinfoupdate(MatinfoVO vo) {
		matinfoDAO.matinfoUpdate(vo);
		return "redirect:matinfo.do";
	}
	
	//
	
	@RequestMapping("/bom.do")
	public String bom() {
		return "common/bom";
	}
	
	@RequestMapping("/selectGoods")
	@ResponseBody
	public List<GoodsinfoVO> selectGoods(GoodsinfoVO vo){
		List<GoodsinfoVO> selectGoods = bomDAO.selectGoods(vo);
		return selectGoods;
	}
	
	@RequestMapping("/selectBom")
	@ResponseBody
	public List<BomVO> selectBom(BomVO vo) {
		List<BomVO> selectBom = bomDAO.selectBom(vo);
		return selectBom;
	}
	
	
	//
	
	
	
	
	@RequestMapping("/procinfo.do")
	public String procInfo() {
		return "common/procinfo";
	}
	@RequestMapping("/errinfo.do")
	public String errInfo() {
		return "common/errinfo";
	}

}
