/**
 * 
 */
package com.mm.musec.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author USER
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfigurer extends WebSecurityConfigurerAdapter {

	// @Autowired
	// private PasswordEncoder passwordEncoder;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
				// .withUser("hari").password("{noop}abcd").roles("ADMIN")
				.withUser("hari").password("{bcrypt}$2a$10$u9MHRDinxYsmczocQbrYkeiCy6ZhopcYjEqqSp5MlQB5jYtljd7q.")
				.roles("ADMIN").and()
				// .withUser("ravi").password("{noop}1234").roles("USER")
				.withUser("ravi")
				.password("{pbkdf2}f28545654e99073245469870a563e41a3dceaa5e4822d48abfee5d3e1888d356eeb75c6a5277bf61")
				.roles("USER").and()
				// .withUser("ramu").password("{noop}ab34").roles("USER");
				.withUser("ramu")
				.password("{sha256}73bdb454efd868018dee874d866f375ad1ca2a45f44016af5a8f29e184277926de6ec9ea55e4cba8")
				.roles("USER", "ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/adminhome").hasRole("ADMIN")
		.antMatchers("/userhome").hasAnyRole("USER", "ADMIN", "SUPERVISOR")
		.antMatchers("/home").permitAll()
		.and().formLogin();
	}
	
	

	/*
	 * @Bean public PasswordEncoder getPasswordEncoder() { return
	 * NoOpPasswordEncoder.getInstance(); }
	 */

}
