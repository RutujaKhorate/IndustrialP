package com.expense.mvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class UserSecurityConfiguration extends WebSecurityConfigurerAdapter{
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(requests -> requests
                        .antMatchers("/**").permitAll())
                .csrf(csrf -> csrf.disable());               // Disable CSRF (if necessary)
    }

	// @Autowired
	// DataSource dataSource;
	
	
	// @Bean
	// public PasswordEncoder passwordEncoder() {
	// 	return new BCryptPasswordEncoder();
	// }
	

	// @Autowired
	// private UserAuthenticationSuccessHandler successHandler;

	// Enable jdbc authentication
	// @Autowired
	// public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
	// 	auth.jdbcAuthentication().dataSource(dataSource);
	// }

//	@Bean
//	public JdbcUserDetailsManager jdbcUserDetailsManager() throws Exception {
//		JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager();
//		jdbcUserDetailsManager.setDataSource(dataSource);
//		return jdbcUserDetailsManager;
//	}

	//Check theeseeeeee!!!!!!!!!!!!!!!!!!!!!!!!!!
	// @Override
	// public void configure(WebSecurity web) throws Exception {
	// 	web.ignoring().antMatchers("/app/**");
	// }

	// @Override
	// protected void configure(HttpSecurity http) throws Exception {
	// 	http.authorizeRequests().antMatchers("/expenses").permitAll().antMatchers("/categories").hasAnyRole("USER", "ADMIN")
	// 			.antMatchers("/getEmployees").hasAnyRole("USER", "ADMIN").antMatchers("/addNewEmployee")
	// 			.hasAnyRole("ADMIN").anyRequest().authenticated()
	// 			.and().formLogin().successHandler(successHandler)
	// 			.loginPage("/login").permitAll().and().logout().permitAll();

	// 	http.csrf().disable();
	// }
	
	// @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
//    }

	// @Autowired
	// public void configureGlobal(AuthenticationManagerBuilder authenticationMgr)
	// throws Exception {
	// authenticationMgr.inMemoryAuthentication().withUser("admin").password("admin").authorities("ROLE_USER").and()
	// .withUser("javainuse").password("javainuse").authorities("ROLE_USER",
	// "ROLE_ADMIN");
	// }
	

}
