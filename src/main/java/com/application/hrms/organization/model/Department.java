package com.application.hrms.organization.model;

import java.util.List;

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

import com.application.hrms.management.model.DepartmentTeamPlanManagment;
import com.application.hrms.management.model.TeamManagement;

@Entity
@Table( name = "department")
@Inheritance(strategy = InheritanceType.JOINED)
public class Department{

	@Id
	@GeneratedValue( strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
	
	@Column( name = "department_name" , nullable = false)
	private String departmentName;
	
	@Column( name = "extension_phone" , nullable = true)
	private String extensionPhone;
	
	@Column( name = "notes" , nullable = true)
	private String notes;
	
	@Column( name = "description" , nullable = true)
	private String description;

	@ManyToOne(cascade = javax.persistence.CascadeType.ALL)
	@JoinColumn(name = "branch_id" , nullable = false)
	private Branch branchs;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "department")
	private List<TeamManagement> department;
	
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "department")
	private List<DepartmentTeamPlanManagment> departmentTeamPlan;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Branch getBranchs() {
		return branchs;
	}

	public void setBranchs(Branch branchs) {
		this.branchs = branchs;
	}

	public List<TeamManagement> getDepartment() {
		return department;
	}

	public void setDepartment(List<TeamManagement> department) {
		this.department = department;
	}

	public List<DepartmentTeamPlanManagment> getDepartmentTeamPlan() {
		return departmentTeamPlan;
	}

	public void setDepartmentTeamPlan(List<DepartmentTeamPlanManagment> departmentTeamPlan) {
		this.departmentTeamPlan = departmentTeamPlan;
	}

	

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getExtensionPhone() {
		return extensionPhone;
	}

	public void setExtensionPhone(String extensionPhone) {
		this.extensionPhone = extensionPhone;
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
