package co.carboni.prj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import co.carboni.prj.people.mapper.UserMapper;
import co.carboni.prj.people.vo.LoginVO;

@Service
public class LoginVal implements UserDetailsService {
	
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Autowired
    private UserMapper mapper;
	

	@Override
	public UserDetails loadUserByUsername(String lid) throws UsernameNotFoundException {
		LoginVO user = mapper.getUser(lid);
        
		if (user == null) {
            return null;
        }
        String lpw = user.getLpw();
        String acode = user.getAcode();
        
		return User.builder()
				.username(lid).password(lpw).roles(acode)
				.build();
	}

}
