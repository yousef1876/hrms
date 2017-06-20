package com.application.hrms.organization.model;

import java.sql.Date;
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

import com.application.hrms.management.model.OrganizationDepartmentManagment;
import com.application.hrms.management.model.OrganizationManagment;


@Entity
@Table( name = "organization")
@Inheritance(strategy = InheritanceType.JOINED)
public class Organization {
	
	@Id
	@GeneratedValue( strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
	
	
	
	@Column( name = "organization_name" , nullable = false)
	private String organizationName;
	
	@Column( name = "organization_establish_date" , nullable = false)
	private Date organizationEstablishDate;
	
	@Column( name = "location" , nullable = false)
	private String location;
	
	@Column( name = "address" , nullable = false)
	private String address;
	
	@Column( name = "postcode" , nullable = false)
	private String postCode;
	
	@Column( name = "first_mobile" , nullable = true)
	private String mobileNo;
	
	@Column( name = "first_phone" , nullable = true)
	private String phoneNo;
	
	@Column( name = "first_email" , nullable = true)
	private String email;
	
	@Column( name = "second_mobile" , nullable = true)
	private String secondMobile;
	
	@Column( name = "second_email" , nullable = true)
	private String secondEmail;
	
	@Column( name = "second_phone" , nullable = true)
	private String secondPhone;
	
	@Column( name = "notes" , nullable = true)
	private String notes;
	
	@Column( name = "description" , nullable = true)
	private String description;

	@OneToMany(fetch = FetchType.LAZY , mappedBy = "organizations")
	private List<Branch> branches;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "organization")
	private List<OrganizationManagment> organization;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "organization")
	private List<OrganizationDepartmentManagment> organizationDeptManagement;
	

	public List<OrganizationDepartmentManagment> getOrganizationDeptManagement() {
		return organizationDeptManagement;
	}

	public void setOrganizationDeptManagement(List<OrganizationDepartmentManagment> organizationDeptManagement) {
		this.organizationDeptManagement = organizationDeptManagement;
	}

	public List<Branch> getBranches() {
		return branches;
	}

	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}

	public List<OrganizationManagment> getOrganization() {
		return organization;
	}

	public void setOrganization(List<OrganizationManagment> organization) {
		this.organization = organization;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public Date getOrganizationEstablishDate() {
		return organizationEstablishDate;
	}

	public void setOrganizationEstablishDate(Date organizationEstablishDate) {
		this.organizationEstablishDate = organizationEstablishDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSecondMobile() {
		return secondMobile;
	}

	public void setSecondMobile(String secondMobile) {
		this.secondMobile = secondMobile;
	}

	public String getSecondEmail() {
		return secondEmail;
	}

	public void setSecondEmail(String secondEmail) {
		this.secondEmail = secondEmail;
	}

	public String getSecondPhone() {
		return secondPhone;
	}

	public void setSecondPhone(String secondPhone) {
		this.secondPhone = secondPhone;
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
