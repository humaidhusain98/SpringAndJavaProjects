package com.humaid.aws.security;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.thymeleaf.standard.expression.AndExpression;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter
{
	private final PasswordEncoder passwordEncoder;
	
	@Autowired
	public ApplicationSecurityConfig(PasswordEncoder passwordEncoder) {
		this.passwordEncoder=passwordEncoder;
	} 

	
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http
//			.csrf().disable()  //CSRF TOKEN TO BE GIVEN TO FRONTEND WHICH WILL BE USED TO PUT,POST,DELETE
//			.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
//			.and()
			.csrf().disable()
			.authorizeRequests()
			//The order in which antmatchers are added is important
			.antMatchers("/","index","/css/*","/js/*").permitAll()
			.antMatchers("/api/**").hasRole(ApplicationUserRole.STUDENT.name())
//			.antMatchers(HttpMethod.DELETE, "/management/api/**").hasAuthority(ApplicationUserPermission.COURSE_WRITE.getPermission())
//			.antMatchers(HttpMethod.POST, "/management/api/**").hasAuthority(ApplicationUserPermission.COURSE_WRITE.getPermission())
//			.antMatchers(HttpMethod.PUT, "/management/api/**").hasAuthority(ApplicationUserPermission.COURSE_WRITE.getPermission())
//			.antMatchers(HttpMethod.GET,"/management/api/**").hasAnyRole(ApplicationUserRole.ADMIN.name()
//					,ApplicationUserRole.ADMINTRAINEE.name())
			.anyRequest()
			.authenticated()
			.and()
			.formLogin()// FORM BASED AUTHENTICATION with SESSIONID which expires in 30 minutes
			.loginPage("/login").permitAll()
//			.httpBasic();//In Basic Authentication username & password to be sent everytime and cannot logout
			.defaultSuccessUrl("/courses",true)
			.and()
			.rememberMe()
				.tokenValiditySeconds((int) TimeUnit.DAYS.toSeconds(21)) //Defaults to 2 weeks
				.key("somethingverysecured")
			.and()
			.logout()
				.logoutUrl("/logout")
				.clearAuthentication(true)
				.invalidateHttpSession(true)
				.deleteCookies("JSESSIONID","remember-me")
				.logoutSuccessUrl("/login");
	}
	
	@Override
	@Bean
	protected UserDetailsService userDetailsService() 
	{
		 
		
	UserDetails tubaUser	= User.builder()
				.username("Tuba")
				.password(passwordEncoder.encode("password"))
				.authorities(ApplicationUserRole.STUDENT.getGrantedAuthorities())
				//.roles(ApplicationUserRole.STUDENT.name()) //ROLE_STUDENT
				.build();
	
	UserDetails humaidUser	= User.builder()
			.username("Humaid")
			.password(passwordEncoder.encode("password"))
			.authorities(ApplicationUserRole.ADMIN.getGrantedAuthorities())
			//.roles(ApplicationUserRole.ADMIN.name()) //ROLE_STUDENT
			.build();
	
	UserDetails atibaUser = User.builder()
			.username("Atiba")
			.password(passwordEncoder.encode("password"))
			//.roles(ApplicationUserRole.ADMINTRAINEE.name()) //ROLE_ADMINTRAINEE
			.authorities(ApplicationUserRole.ADMINTRAINEE.getGrantedAuthorities())
			.build();
	
		
	return new InMemoryUserDetailsManager(
			humaidUser,tubaUser,atibaUser
			);
	
	}

}
