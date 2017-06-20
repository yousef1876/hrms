package com.application.hrms.project.model;



import java.util.Date;
import java.util.List;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.application.hrms.employee.model.Employee;
import com.application.hrms.employee.security.model.EmployeeUser;
import com.application.hrms.organization.model.Department;

@Entity
@Table( name = "project")
@Inheritance(strategy = InheritanceType.JOINED)
public class Project {
	
	@Id
	@GeneratedValue( strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
	
	@Column(name = "project_name" , nullable = false)
	private String projectName;
	
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id" , nullable = false)
	private Department departments;
	
	@Column(name = "created_date" , nullable = false) 
	private Date createdDate;
	
	@Column(name = "created_by" , nullable = false)
	private EmployeeUser user;
	
	@ManyToOne(cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
	@JoinColumn(name = "manager_id" , nullable = false)
	private EmployeeUser managers;
	
	@Column(name = "phases_no" , nullable = true)
	private String pahesesNo;
	
	@Column(name = "description" , nullable = true)
	private String description;
	
	@Column(name = "notes" , nullable = true)
	private String notes;

	@OneToMany(fetch = FetchType.LAZY , mappedBy = "projects")
	private List<ProjectPhases> projects;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "projects")
	private List<ProjectRequirmentGathering> projectReqs;
	
	
	public List<ProjectPhases> getProjects() {
		return projects;
	}

	public void setProjects(List<ProjectPhases> projects) {
		this.projects = projects;
	}

	public List<ProjectRequirmentGathering> getProjectReqs() {
		return projectReqs;
	}

	public void setProjectReqs(List<ProjectRequirmentGathering> projectReqs) {
		this.projectReqs = projectReqs;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Department getDepartments() {
		return departments;
	}

	public void setDepartments(Department departments) {
		this.departments = departments;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public EmployeeUser getUser() {
		return user;
	}

	public void setUser(EmployeeUser user) {
		this.user = user;
	}

	public Employee getManagers() {
		return managers;
	}

	

	public void setManagers(EmployeeUser managers) {
		this.managers = managers;
	}

	public String getPahesesNo() {
		return pahesesNo;
	}

	public void setPahesesNo(String pahesesNo) {
		this.pahesesNo = pahesesNo;
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
