package co.carboni.prj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
	
	@Autowired LoginVal loginval;
	
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
        .authorizeRequests()
        	.antMatchers("/assets/**/*").permitAll()
        	.antMatchers("/css/*").permitAll()
        	.antMatchers("/js/*").permitAll()
        	.anyRequest().authenticated()
        .and()
            .formLogin()
            	.loginPage("/login.do")
            	.defaultSuccessUrl("/")
            	.failureUrl("/loginfail.do")
            	.loginProcessingUrl("/loginproc")
                .usernameParameter("lid")
                .passwordParameter("lpw")
                .successForwardUrl("/")
            	.permitAll()
        .and()
        	.logout()
        		.logoutUrl("/logout")
        		.logoutSuccessUrl("/login.do")
        		.invalidateHttpSession(true);
        
        return http.build();
    }
    
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(loginval);
    }
}
