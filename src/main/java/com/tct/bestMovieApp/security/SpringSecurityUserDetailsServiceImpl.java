package com.tct.bestMovieApp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.tct.bestMovieApp.domain.AppUser;

import com.tct.bestMovieApp.services.UserService;

@Service("userDetailsService")
public class SpringSecurityUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserService userService;
	
	
	private Converter<AppUser, UserDetails> userUserDetailsConverter;
	
	@Autowired
	@Qualifier(value = "userToUserDetails")
	public void setUserUserDetailsConverter(Converter<AppUser, UserDetails> userUserDetailsConverter) {	
		this.userUserDetailsConverter = userUserDetailsConverter;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userUserDetailsConverter.convert(userService.findByEmail(username));
	}

}
