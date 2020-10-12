package com.application.hrms.person.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.application.hrms.guest.security.model.GuestUser;

@Entity
@Table(name = "person")
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
	
	@Id
	@GeneratedValue( strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
	
	@Column(name = "first_name" , nullable = false)
	private String firstName;
	
	@Column(name = "second_name" , nullable = true)
	private String secondName;
	
	@Column(name = "last_name" , nullable = false)
	private String lastName;
	
	@Column(name = "id_no" , nullable = false)
	private String idNo;
	
	@Column(name = "passport" , nullable = true)
	private String passport;
	
	@Column(name = "id_issue_country" , nullable = true)
	private String idIssueCountry;
	
	@Column(name = "passport_issue_country" , nullable = true)
	private String passportIssueCountry;
	
	@Column(name = "gender_id" , nullable = false)
	private Gender gender;
	
	@Column(name = "id_issue_date" , nullable = true)
	private Date   idIssueDate;
	
	@Column(name = "passport_issue_date" , nullable = true)
	private Date   passportIssueDate;
	
	@Column(name = "passport_expire_date" , nullable = true)
	private Date   passportExpireDate;
	
	/*
	One to Many relatiom with Person Entity
	1.Education
	2.Experience
	3.Attachment
	4.Profile
	5.Users
	*/

	@OneToMany(fetch = FetchType.LAZY , mappedBy = "persons")
	private List<PersonEducation> personEducation;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "persons")
	private List<PersonExpereince> personExpereince;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "persons")
	private List<PersonAttachment> personAttachment;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "persons")
	private List<PersonProfile> personProfile;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "persons")
	private List<GuestUser> personUsers;
	
	
	public List<GuestUser> getPersonUsers() {
		return personUsers;
	}

	public void setPersonUsers(List<GuestUser> personUsers) {
		this.personUsers = personUsers;
	}

	public List<PersonEducation> getPersonEducation() {
		return personEducation;
	}

	public void setPersonEducation(List<PersonEducation> personEducation) {
		this.personEducation = personEducation;
	}

	public List<PersonExpereince> getPersonExpereince() {
		return personExpereince;
	}

	public void setPersonExpereince(List<PersonExpereince> personExpereince) {
		this.personExpereince = personExpereince;
	}

	public List<PersonAttachment> getPersonAttachment() {
		return personAttachment;
	}

	public void setPersonAttachment(List<PersonAttachment> personAttachment) {
		this.personAttachment = personAttachment;
	}

	public List<PersonProfile> getPersonProfile() {
		return personProfile;
	}

	public void setPersonProfile(List<PersonProfile> personProfile) {
		this.personProfile = personProfile;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getIdIssueCountry() {
		return idIssueCountry;
	}

	public void setIdIssueCountry(String idIssueCountry) {
		this.idIssueCountry = idIssueCountry;
	}

	public String getPassportIssueCountry() {
		return passportIssueCountry;
	}

	public void setPassportIssueCountry(String passportIssueCountry) {
		this.passportIssueCountry = passportIssueCountry;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getIdIssueDate() {
		return idIssueDate;
	}

	public void setIdIssueDate(Date idIssueDate) {
		this.idIssueDate = idIssueDate;
	}

	public Date getPassportIssueDate() {
		return passportIssueDate;
	}

	public void setPassportIssueDate(Date passportIssueDate) {
		this.passportIssueDate = passportIssueDate;
	}

	public Date getPassportExpireDate() {
		return passportExpireDate;
	}

	public void setPassportExpireDate(Date passportExpireDate) {
		this.passportExpireDate = passportExpireDate;
	}

}
