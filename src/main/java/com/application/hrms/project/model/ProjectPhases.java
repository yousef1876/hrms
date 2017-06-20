package com.application.hrms.project.model;

import java.util.Date;
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

import com.application.hrms.employee.security.model.EmployeeUser;

@Entity
@Table(name = "project_phases")
public class ProjectPhases{

	
	@Id
	@GeneratedValue( strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
	
	@ManyToOne(cascade = javax.persistence.CascadeType.ALL)
	@JoinColumn(name = "project_id" , nullable = false)
	private Project projects;
	
	@Column(name = "title" , nullable = false)
	private String title;
	
	@Column(name = "subject" , nullable = false)
	private String subject;
	
	@Column(name = "notes" , nullable = false)
	private String notes;
	
	@Column(name = "description" , nullable = false)
	private String description;
	
	@Column(name = "created_date" , nullable = false)
	private Date createdDate;
	
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	private EmployeeUser createdBy;
	
	
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	@JoinColumn(name = "manager_id")
	private EmployeeUser managers;

	@OneToMany(fetch = FetchType.LAZY , mappedBy = "phases")
	private List<Issues> issues;
	

	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Project getProjects() {
		return projects;
	}


	public void setProjects(Project projects) {
		this.projects = projects;
	}


	public List<Issues> getIssues() {
		return issues;
	}


	public void setIssues(List<Issues> issues) {
		this.issues = issues;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
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


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public EmployeeUser getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(EmployeeUser createdBy) {
		this.createdBy = createdBy;
	}


	public EmployeeUser getManagers() {
		return managers;
	}


	public void setManagers(EmployeeUser managers) {
		this.managers = managers;
	}

}
