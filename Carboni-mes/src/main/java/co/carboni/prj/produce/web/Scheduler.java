package co.carboni.prj.produce.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import co.carboni.prj.produce.service.ProdService;

@EnableScheduling
@Component
public class Scheduler {

	
	@Autowired
	ProdService service;
	
	@Scheduled(fixedRate = 15000)
	public void schedule() {
		
		 service.schedule(null, "SS-1");
		 service.schedule("SS-1", "SS-5");
		 service.schedule("SS-5", "SS-7");
		 service.schedule(null, "SS-2");
		 service.schedule("SS-2", "SS-6");
		 service.schedule("SS-6", "SS-7");
		 
		
	}
	
}
