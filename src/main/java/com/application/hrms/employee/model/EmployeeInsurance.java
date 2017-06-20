package com.application.hrms.employee.model;



import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.application.hrms.employee.security.model.EmployeeUser;

@Entity
@Table( name = "employee_insurance" )
@Inheritance(strategy = InheritanceType.JOINED)
public class EmployeeInsurance{
	
	@Id
	@GeneratedValue( strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id" , nullable = false)
	private EmployeeUser employees;
	
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
	
	@Column(name = "insurance_type" , nullable=true)
	private String insuranceType;
	
	@Column(name = "amount" , nullable=true)
	private String amount;
	
	@Column(name = "currency" , nullable=true)
	private String currency;
	
	@Column(name = "insurance_class" , nullable=true)
	private String insuranceClass;

	@Column(name = "insurance_class_catogary" , nullable=true)
	private String insuranceClassCatogary;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EmployeeUser getEmployees() {
		return employees;
	}

	public void setEmployees(EmployeeUser employees) {
		this.employees = employees;
	}

	public Date getExpireInsuranceDate() {
		return expireInsuranceDate;
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

	

	

	public void setInsuranceDate(Date insuranceDate) {
		this.insuranceDate = insuranceDate;
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

	public String getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getInsuranceClass() {
		return insuranceClass;
	}

	public void setInsuranceClass(String insuranceClass) {
		this.insuranceClass = insuranceClass;
	}

	public String getInsuranceClassCatogary() {
		return insuranceClassCatogary;
	}

	public void setInsuranceClassCatogary(String insuranceClassCatogary) {
		this.insuranceClassCatogary = insuranceClassCatogary;
	}

	public Date getInsuranceDate() {
		return insuranceDate;
	}

	
	
	
}
