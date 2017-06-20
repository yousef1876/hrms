package com.application.hrms.guest.security.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table( name = "guest_auth")
public class GuestAuth {

	@Id
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "guest_id")
	private GuestUser employees;
	
	@Column( name = "role_name" , nullable = false , unique = true)
	private String roleName;

	public GuestUser getEmployees() {
		return employees;
	}

	public void setEmployees(GuestUser employees) {
		this.employees = employees;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}
