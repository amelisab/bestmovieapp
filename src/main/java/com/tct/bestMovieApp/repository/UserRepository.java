package com.tct.bestMovieApp.repository;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tct.bestMovieApp.domain.AppUser;

@Repository
public class UserRepository extends GenericDaoImpl<AppUser> {

	public AppUser findByEmail(String email) {
		
		TypedQuery<AppUser> query = super.entityManager.createQuery("from AppUser where email = ?1", AppUser.class);
		query.setParameter(1, email);
		AppUser user = query.getSingleResult();
		return user;
		
	}
	
}
