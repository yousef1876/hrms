package com.application.hrms.guest.security.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table( name = "guest_auth")
public class GuestAuth {

	@Id
	@GeneratedValue( strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "guest_id")
	private GuestUser guestUsers;
	
	
	@Column( name = "role_name" , nullable = false )
	private String roleName;

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public GuestUser getGuestUsers() {
		return guestUsers;
	}

	public void setGuestUsers(GuestUser guestUsers) {
		this.guestUsers = guestUsers;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}
