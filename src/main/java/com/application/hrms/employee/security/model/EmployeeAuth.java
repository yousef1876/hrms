package com.application.hrms.employee.security.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table( name = "employee_auth")
public class EmployeeAuth {

	@Id
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id")
	private EmployeeUser employees;
	
	@Column( name = "role_name" , nullable = false , unique = true)
	private String roleName;

	public EmployeeUser getEmployees() {
		return employees;
	}

	public void setEmployees(EmployeeUser employees) {
		this.employees = employees;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}
