package com.tct.bestMovieApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tct.bestMovieApp.domain.AppRole;
import com.tct.bestMovieApp.repository.RoleRepository;


@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	
	@Override
	public AppRole saveOrUpdate(AppRole domain) {
		return roleRepository.update(domain);
	}

	@Override
	public void delete(Long id) {
		roleRepository.delete(id);
	}

	@Override
	public AppRole find(Long id) {
		return roleRepository.find(id);
	}

	@Override
	public List<AppRole> listAll() {
		return roleRepository.listAll();
	}

	

}
