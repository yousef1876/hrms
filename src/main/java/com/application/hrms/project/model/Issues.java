package com.application.hrms.project.model;

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
@Table(name = "issues")
@Inheritance(strategy = InheritanceType.JOINED)
public class Issues{
	
	@Id
	@GeneratedValue( strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	@JoinColumn(name = "phased_id")
	private ProjectPhases phases;
	
	@Column(name = "issue_name" , nullable = false)
	private String issueName;
	
	@Column(name = "created_date" , nullable = false)
	private Date createdDate;
	
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	private EmployeeUser employees;
	
	@Column(name = "notes" , nullable = true)
	private String notes;
	
	@Column(name = "description" , nullable = true)
	private String description;
	
	@Column(name = "subject" , nullable = false)
	private String subject;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProjectPhases getPhases() {
		return phases;
	}

	public void setPhases(ProjectPhases phases) {
		this.phases = phases;
	}

	public String getIssueName() {
		return issueName;
	}

	public void setIssueName(String issueName) {
		this.issueName = issueName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public EmployeeUser getEmployees() {
		return employees;
	}

	public void setEmployees(EmployeeUser employees) {
		this.employees = employees;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
