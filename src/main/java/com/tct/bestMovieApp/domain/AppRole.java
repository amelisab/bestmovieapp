package com.tct.bestMovieApp.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "App_Role")
public class AppRole {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id", insertable = false, nullable = false)
	private Long roleId;
	
	@Column(name = "role_name", length = 30, nullable = false )
	private String roleName;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable
	private Set<AppUser> users = new HashSet<>();

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<AppUser> getUsers() {
		return users;
	}

	public void setUsers(Set<AppUser> users) {
		this.users = users;
	}

	public Long getRoleId() {
		return roleId;
	}
	
	
	
}
