package com.application.hrms.project.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.application.hrms.employee.security.model.EmployeeUser;

@Entity
@Table(name = "project_forum")
@Inheritance(strategy = InheritanceType.JOINED)
public class ProjectForum extends Project{
	
	@Column(name = "title" , nullable = false)
	private String title;
	
	@Column(name = "subject" , nullable = false)
	private String subject;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	private EmployeeUser createdBy;
	
	@Column(name = "created_date" , nullable = false)
	private Date createdDate;
	
	@Column(name = "description" , nullable = true)
	private String description;
	
	@Column(name = "notes" , nullable = true)
	private String notes;

	@OneToMany(fetch = FetchType.LAZY , mappedBy = "forums")
	private List<ProjectForumSubjects> projectForumsSubject;
	
	
	
	public List<ProjectForumSubjects> getProjectForumsSubject() {
		return projectForumsSubject;
	}

	public void setProjectForumsSubject(List<ProjectForumSubjects> projectForumsSubject) {
		this.projectForumsSubject = projectForumsSubject;
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

	public EmployeeUser getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(EmployeeUser createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
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

}
