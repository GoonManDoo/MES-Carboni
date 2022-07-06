package co.caboni.prj.sales.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeliverController {

	@RequestMapping("/deliver.do")
	public String deliver() {
		return "sales/deliver";
		
	}
}
