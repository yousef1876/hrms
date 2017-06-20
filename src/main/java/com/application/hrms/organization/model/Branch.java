package com.application.hrms.organization.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "branche")
public class Branch{
	
	@Id
	@GeneratedValue( strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
	
	@ManyToOne(cascade = javax.persistence.CascadeType.ALL)
	@JoinColumn(name = "organization_id" , nullable = false)
	private Organization organizations;
	
	@Column( name = "branche_name" , nullable = false)
	private String brancheName;

	@Column( name = "post_code" , nullable = true)
	private String postCode;
	
	@Column( name = "mobile" , nullable = true)
	private String mobileNo;
	
	@Column( name = "phone" , nullable = true)
	private String phoneNo;
	
	@Column( name = "email" , nullable = true)
	private String email;
	
	@Column( name = "address" , nullable = true)
	private String address;
	
	@Column( name = "notes" , nullable = true)
	private String notes;
	
	@Column( name = "description" , nullable = true)
	private String description;
	
	@Column( name = "head_qaurter" , nullable = false)
	private boolean headqaurter;

	@OneToMany(fetch = FetchType.LAZY , mappedBy = "branchs")
	private List<Department> depts;

	
	
	public List<Department> getDepts() {
		return depts;
	}

	public void setDepts(List<Department> depts) {
		this.depts = depts;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Organization getOrganizations() {
		return organizations;
	}

	public void setOrganizations(Organization organizations) {
		this.organizations = organizations;
	}

	public String getBrancheName() {
		return brancheName;
	}

	public void setBrancheName(String brancheName) {
		this.brancheName = brancheName;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public boolean isHeadqaurter() {
		return headqaurter;
	}

	public void setHeadqaurter(boolean headqaurter) {
		this.headqaurter = headqaurter;
	}
	
}
