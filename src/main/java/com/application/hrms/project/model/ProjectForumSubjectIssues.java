package com.application.hrms.project.model;

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

import com.application.hrms.employee.security.model.EmployeeUser;

@Entity
@Table(name = "project_forum_subject_issues")
public class ProjectForumSubjectIssues {
	
	@Id
	@GeneratedValue( strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
	

	@Column(name = "title" , nullable = false)
	private String title;
	
	@Column(name = "subject" , nullable = true)
	private String subject;
	
	@Column(name = "created_date" , nullable = true)
	private Date createdDate;
	
	@Column(name = "notes" , nullable = true)
	private String notes;
	
	@Column(name = "description" , nullable = true)
	private String description;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	private EmployeeUser createdBy;

	
	
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
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

	public EmployeeUser getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(EmployeeUser createdBy) {
		this.createdBy = createdBy;
	}

}
