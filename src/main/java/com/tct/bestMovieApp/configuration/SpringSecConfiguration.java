package com.tct.bestMovieApp.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.tct.bestMovieApp.security.SpringSecurityUserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class SpringSecConfiguration extends WebSecurityConfigurerAdapter {

		@Autowired
		SpringSecurityUserDetailsServiceImpl springSecUserDetailsServiceImpl;

		@Bean
		public BCryptPasswordEncoder passwordEncoder() {
			BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
			return bCryptPasswordEncoder;
		}

		@Autowired
		public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
			auth.userDetailsService(springSecUserDetailsServiceImpl).passwordEncoder(passwordEncoder());

		}
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			
			http.authorizeRequests().antMatchers("/resources/**").permitAll();
			http.authorizeRequests().and().formLogin().loginPage("/signin").defaultSuccessUrl("/catalog2")
					.failureUrl("/404").permitAll().and().logout().logoutUrl("/logout").logoutSuccessUrl("/index")
					.invalidateHttpSession(true)
		            .permitAll().and().exceptionHandling().accessDeniedPage("/404").and()
					.csrf().disable();
		}

}
