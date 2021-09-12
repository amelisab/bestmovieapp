package com.tct.bestMovieApp.services;

import com.tct.bestMovieApp.domain.AppUser;

public interface UserService extends CRUDService<AppUser> {
	AppUser findByEmail(String email);
	
	AppUser register(AppUser domain);
	
}
