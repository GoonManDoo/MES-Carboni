package co.carboni.prj.produce.web;

import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.carboni.prj.produce.service.Prodovservice;
import co.carboni.prj.produce.vo.PrododVO;

@Controller
public class CalController {
	
	@Autowired Prodovservice prodovDAO;
	
	@SuppressWarnings("unchecked")
	@ResponseBody
	@RequestMapping("/plancal")
	List<PrododVO> plancal(){
		List<PrododVO> list = prodovDAO.plancal();
		JSONObject jsonObj = new JSONObject();
		JSONArray jsonArr = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>();
		for(int i=0; i<list.size(); i++) {
			hash.put("title", list.get(i).getPcdnum());
			hash.put("start", list.get(i).getPcdsdate());
			hash.put("end", list.get(i).getPcdedate());
			
			jsonObj = new JSONObject(hash);
			jsonArr.add(jsonObj);
		}
		return jsonArr;
	}

}
