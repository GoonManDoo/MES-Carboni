package co.carboni.prj;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.carboni.prj.system.mapper.SysinfoMapper;

@SpringBootTest
public class Systest {
	@Autowired SysinfoMapper mapper;
	
	@Test
	void list() {
		mapper.selectSysAll();
	}

}
