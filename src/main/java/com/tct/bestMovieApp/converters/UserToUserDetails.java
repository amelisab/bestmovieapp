package com.tct.bestMovieApp.converters;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.core.convert.converter.Converter;

import com.tct.bestMovieApp.domain.AppUser;
import com.tct.bestMovieApp.security.UserDetailsImpl;

@Component
public class UserToUserDetails implements Converter<AppUser, UserDetails>{

	@Override
	public UserDetails convert(AppUser user) {
		UserDetailsImpl userDetails = new UserDetailsImpl();
		userDetails.setUsername(user.getUsername());
		userDetails.setEnabled(true);
		userDetails.setPassword(user.getEncryptedPassword());
		
		Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
		
		user.getRoles().forEach(role -> {
			authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
		});
		
		userDetails.setAuthorities(authorities);
		
		return userDetails;
	}

	
	
}
