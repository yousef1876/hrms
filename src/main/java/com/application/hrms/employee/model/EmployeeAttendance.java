package com.application.hrms.employee.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.application.hrms.employee.security.model.EmployeeUser;

@Entity
@Table(name = "employee_attendance")
public class EmployeeAttendance {

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
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "from_date" , nullable = false)
	private Date fromDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "to_date" , nullable = false)
	private Date toDate;
	
	@Column(name = "notes" , nullable = true)
	private String notes;
	
	@Column(name = "notes" , nullable = true)
	private String description;

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

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
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
