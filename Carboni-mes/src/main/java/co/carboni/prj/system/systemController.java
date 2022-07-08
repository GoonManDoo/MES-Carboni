package co.carboni.prj.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class systemController {
		
	@RequestMapping("/productSysMain")
	public String productSysMain() {
		return "system/productSysMain";
	}

}
