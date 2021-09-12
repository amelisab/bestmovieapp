package com.tct.bestMovieApp.services;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tct.bestMovieApp.domain.AppRole;
import com.tct.bestMovieApp.domain.AppUser;
import com.tct.bestMovieApp.repository.RoleRepository;
import com.tct.bestMovieApp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public AppUser saveOrUpdate(AppUser domain) {
		return userRepository.update(domain);
	}
	
	@Override
	public AppUser register(AppUser domain) {
		Set<AppRole> roles = new HashSet<>();
		roles.add(roleRepository.find(2L));
		domain.setRoles(roles);
		domain.setEncryptedPassword(bCryptPasswordEncoder.encode(domain.getEncryptedPassword()));
		
		return userRepository.update(domain);
	}

	@Override
	public void delete(Long id) {
		userRepository.delete(id);
	}

	@Override
	public AppUser find(Long id) {
		return userRepository.find(id);
	}

	@Override
	public List<AppUser> listAll() {
		return userRepository.listAll();
	}

	@Override
	public AppUser findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	

	
	
}
