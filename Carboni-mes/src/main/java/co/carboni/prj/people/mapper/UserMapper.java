package co.carboni.prj.people.mapper;

import co.carboni.prj.people.vo.LoginVO;

public interface UserMapper {

	LoginVO getUser(String lid);

}
