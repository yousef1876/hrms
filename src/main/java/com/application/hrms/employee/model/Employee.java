package com.application.hrms.employee.model;

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

import com.application.hrms.employee.security.model.EmployeeUser;

@Entity
@Table( name = "employees")
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {

	@Id
	@GeneratedValue( strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
	
	@Column(name = "first_name" , nullable=false)
	private String firstName;
	
	@Column(name = "last_name" , nullable=false)
	private String lastName;
	
	@Column(name = "mobile" , nullable=true)
	private String mobileNo;
	
	@Column(name = "phone" , nullable=true)
	private String phoneNo;
	
	@Column(name = "email" , nullable=true)
	private String email;
	
	@Column(name = "initial" , nullable=true)
	private String initial;
	
	@Column(name = "id_no" , nullable=true)
	private String idNo;
	
	@Column(name = "passport" , nullable=true)
	private String passportNo;
	
	@Column(name = "insurance_no" , nullable=true)
	private String insuranceNo;
	
	@Column(name = "insurance_company" , nullable=true)
	private String insuranceCompany;
	
	@Column(name = "insurance_date" , nullable=true)
	private Date insuranceDate;
	
	@Column(name = "expire_insurance_date" , nullable=true)
	private Date expireInsuranceDate;
	
	@Column(name = "notes" , nullable=true)
	private String notes;
	
	@Column(name = "description" , nullable=true)
	private String description;

	@OneToMany(fetch = FetchType.LAZY , mappedBy = "employees")
	private List<EmployeeUser> employees;
	
	
	
	
	public List<EmployeeUser> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeUser> employees) {
		this.employees = employees;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getInitial() {
		return initial;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getInsuranceNo() {
		return insuranceNo;
	}

	public void setInsuranceNo(String insuranceNo) {
		this.insuranceNo = insuranceNo;
	}

	public String getInsuranceCompany() {
		return insuranceCompany;
	}

	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}

	public java.util.Date getInsuranceDate() {
		return insuranceDate;
	}

	public void setInsuranceDate(Date insuranceDate) {
		this.insuranceDate = insuranceDate;
	}

	public Date getExpireInsuranceDate() {
		return expireInsuranceDate;
	}

	public void setExpireInsuranceDate(Date expireInsuranceDate) {
		this.expireInsuranceDate = expireInsuranceDate;
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
