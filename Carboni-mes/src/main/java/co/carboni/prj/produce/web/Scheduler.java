package co.carboni.prj.produce.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.carboni.prj.produce.service.ProdService;

@Component
public class Scheduler extends Thread {

	
	@Autowired
	ProdService service;
	
	
   @Override
   public void run() {
      List<String> list = Arrays.asList(null, "SS-1","SS-5","SS-7");
      for(int i=1 ; i<list.size(); i++) {
         service.schedule(list.get(i-1), list.get(i));
         try {
            Thread.sleep(8000);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }

	
	/*
	 * @Scheduled(fixedRate = 5000) public void schedule() {
	 * 
	 * service.schedule(null, "SS-1"); service.schedule("SS-1", "SS-5");
	 * service.schedule("SS-5", "SS-7"); service.schedule(null, "SS-2");
	 * service.schedule("SS-2", "SS-6"); service.schedule("SS-6", "SS-7");
	 * 
	 * 
	 * }
	 */
	
	
	
}
