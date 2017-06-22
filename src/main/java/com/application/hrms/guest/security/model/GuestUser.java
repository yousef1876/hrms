package com.application.hrms.guest.security.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.application.hrms.person.model.Person;

@Entity
@Table(name = "guest_users")
public class GuestUser {
	
	
	@Id
	@GeneratedValue( strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	@JoinColumn(name = "person_id" , nullable = false)
	private Person persons;
	
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

	@OneToMany(fetch = FetchType.LAZY , mappedBy = "guestUsers")
	private List<GuestAuth> auths;
	
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Person getPersons() {
		return persons;
	}

	public void setPersons(Person persons) {
		this.persons = persons;
	}

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
