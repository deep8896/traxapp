package com.marketingapp.security.cfg;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {
	@Bean
	public UserDetailsService userDetailsService() {
		
		var ud = new InMemoryUserDetailsManager();
		var user = User.withUsername("pradeep").password("123").authorities("123").build();
		
		ud.createUser(user);
		return ud;
	}
	   @Bean
        public PasswordEncoder passwordEncoder() {
			return NoOpPasswordEncoder.getInstance();
        	
        }
}

