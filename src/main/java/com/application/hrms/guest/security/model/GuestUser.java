package com.application.hrms.guest.security.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.application.hrms.employee.model.Employee;

@Entity
@Table(name = "guest_users")
public class GuestUser extends Employee {
	
	@Column(name = "username" , nullable = false)
	private String username;
	
	@Column(name = "password" , nullable = false)
	private String password;
	
	@Column(name = "enabled" , nullable = false)
	private boolean enabled;
	
	@Column(name = "notes" , nullable = false)
	private String notes;
	
	@Column(name = "description" , nullable = false)
	private String description;

	@OneToMany(fetch = FetchType.LAZY , mappedBy = "employees")
	private List<GuestAuth> auths;
	
	public List<GuestAuth> getAuths() {
		return auths;
	}

	public void setAuths(List<GuestAuth> auths) {
		this.auths = auths;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
