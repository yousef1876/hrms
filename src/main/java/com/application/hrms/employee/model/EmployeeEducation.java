package com.application.hrms.employee.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.application.hrms.employee.security.model.EmployeeUser;

@Entity
@Table(name = "employee_education")
public class EmployeeEducation  {

	@Id
	@GeneratedValue( strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id" , nullable = false)
	private EmployeeUser createdby;
	
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id" , nullable = false)
	private EmployeeUser employee;
	
	@Column( name = "title" , nullable = false)
	private String title;

	@Column( name = "university_name" , nullable = false)
	private String universityName;

	@Column( name = "major" , nullable = true)
	private String major;

	@Column( name = "gpa" , nullable = true)
	private String gpa;

	@Column( name = "description" , nullable = true)
	private String description;


	@Column( name = "notes" , nullable = true)
	private String notes;

	@Lob
	@Column(name = "payload_cert", length = 100000 , nullable = true)
	private byte[] payload;
	
	@Column( name = "file_name" , nullable = false)
	private String fileName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EmployeeUser getCreatedby() {
		return createdby;
	}

	public void setCreatedby(EmployeeUser createdby) {
		this.createdby = createdby;
	}

	public EmployeeUser getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeUser employee) {
		this.employee = employee;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getGpa() {
		return gpa;
	}

	public void setGpa(String gpa) {
		this.gpa = gpa;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public byte[] getPayload() {
		return payload;
	}

	public void setPayload(byte[] payload) {
		this.payload = payload;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}
