package com.application.hrms.employee.security.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.application.hrms.employee.model.Employee;
import com.application.hrms.employee.model.EmployeeAttendance;
import com.application.hrms.employee.model.EmployeeEducation;
import com.application.hrms.employee.model.EmployeeExpereince;
import com.application.hrms.employee.model.EmployeeInsurance;
import com.application.hrms.employee.model.EmployeeInsuranceBills;
import com.application.hrms.employee.model.EmployeeLeave;
import com.application.hrms.employee.model.Parchases;
import com.application.hrms.employee.model.Sales;
import com.application.hrms.management.model.OrganizationDepartmentManagment;
import com.application.hrms.management.model.OrganizationManagment;
import com.application.hrms.management.model.TeamManagement;
import com.application.hrms.project.model.ProjectForum;
import com.application.hrms.project.model.ProjectForumSubjectIssues;
import com.application.hrms.project.model.ProjectPhases;
import com.application.hrms.project.model.ProjectTasks;

@Entity
@Table(name = "employee_users")
public class EmployeeUser extends Employee {
	
	@Column(name = "username" , nullable = false)
	private String username;
	
	@Column(name = "password" , nullable = false)
	private String password;
	
	@Column(name = "enabled" , nullable = false)
	private boolean enabled;
	
	@Column(name = "notes" , nullable = false)
	private String notes;
	
	@Column(name = "description" , nullable = false)
	private String description;

	@OneToMany(fetch = FetchType.LAZY , mappedBy = "createdby")
	private List<EmployeeAttendance> attendancesCreatedBy;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "employee")
	private List<EmployeeAttendance> employeesAssgin;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "createdby")
	private List<EmployeeEducation> educationsCreatedBy;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "employee")
	private List<EmployeeEducation> empsAssgin;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "employees")
	private List<EmployeeExpereince> expereincesCreatedBy;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "employees")
	private List<EmployeeInsurance> employeeInssurance;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "employees")
	private List<EmployeeInsuranceBills> employeeInssuranceBill;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "createdBy")
	private List<EmployeeInsuranceBills> billsCreatedBy;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "createdBy")
	private List<Sales> salesCreatedBy;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "createdBy")
	private List<Parchases> parchasesCreatedBy;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "createdby")
	private List<EmployeeLeave> leavesCreatedBy;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "employee")
	private List<EmployeeLeave> employeeAssgin;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "employees")
	private List<EmployeeAuth> auths;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "createdBy")
	private List<OrganizationManagment> organizationManagement;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "createdBy")
	private List<OrganizationDepartmentManagment> deptManagement;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "createdBy")
	private List<TeamManagement> teamManagement;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "members")
	private List<TeamManagement> teamMembers;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "createdBy")
	private List<ProjectPhases> projectPhasedCreatedBy;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "managers")
	private List<ProjectPhases> projectPhasedManager;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "createdBy")
	private List<ProjectForum> projectForums;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "createdBy")
	private List<ProjectForumSubjectIssues> projectForumsIssues;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "employees")
	private List<ProjectTasks> employeeTasks;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "employees")
	private List<ProjectTasks> employeeTimeScheduling;
	
	
	
	
	public List<EmployeeAttendance> getAttendancesCreatedBy() {
		return attendancesCreatedBy;
	}

	public void setAttendancesCreatedBy(List<EmployeeAttendance> attendancesCreatedBy) {
		this.attendancesCreatedBy = attendancesCreatedBy;
	}

	public List<EmployeeAttendance> getEmployeesAssgin() {
		return employeesAssgin;
	}

	public void setEmployeesAssgin(List<EmployeeAttendance> employeesAssgin) {
		this.employeesAssgin = employeesAssgin;
	}

	public List<EmployeeEducation> getEducationsCreatedBy() {
		return educationsCreatedBy;
	}

	public void setEducationsCreatedBy(List<EmployeeEducation> educationsCreatedBy) {
		this.educationsCreatedBy = educationsCreatedBy;
	}

	public List<EmployeeEducation> getEmpsAssgin() {
		return empsAssgin;
	}

	public void setEmpsAssgin(List<EmployeeEducation> empsAssgin) {
		this.empsAssgin = empsAssgin;
	}

	public List<EmployeeExpereince> getExpereincesCreatedBy() {
		return expereincesCreatedBy;
	}

	public void setExpereincesCreatedBy(List<EmployeeExpereince> expereincesCreatedBy) {
		this.expereincesCreatedBy = expereincesCreatedBy;
	}

	public List<EmployeeInsurance> getEmployeeInssurance() {
		return employeeInssurance;
	}

	public void setEmployeeInssurance(List<EmployeeInsurance> employeeInssurance) {
		this.employeeInssurance = employeeInssurance;
	}

	public List<EmployeeInsuranceBills> getEmployeeInssuranceBill() {
		return employeeInssuranceBill;
	}

	public void setEmployeeInssuranceBill(List<EmployeeInsuranceBills> employeeInssuranceBill) {
		this.employeeInssuranceBill = employeeInssuranceBill;
	}

	public List<EmployeeInsuranceBills> getBillsCreatedBy() {
		return billsCreatedBy;
	}

	public void setBillsCreatedBy(List<EmployeeInsuranceBills> billsCreatedBy) {
		this.billsCreatedBy = billsCreatedBy;
	}

	public List<Sales> getSalesCreatedBy() {
		return salesCreatedBy;
	}

	public void setSalesCreatedBy(List<Sales> salesCreatedBy) {
		this.salesCreatedBy = salesCreatedBy;
	}

	public List<Parchases> getParchasesCreatedBy() {
		return parchasesCreatedBy;
	}

	public void setParchasesCreatedBy(List<Parchases> parchasesCreatedBy) {
		this.parchasesCreatedBy = parchasesCreatedBy;
	}

	public List<EmployeeLeave> getLeavesCreatedBy() {
		return leavesCreatedBy;
	}

	public void setLeavesCreatedBy(List<EmployeeLeave> leavesCreatedBy) {
		this.leavesCreatedBy = leavesCreatedBy;
	}

	public List<EmployeeLeave> getEmployeeAssgin() {
		return employeeAssgin;
	}

	public void setEmployeeAssgin(List<EmployeeLeave> employeeAssgin) {
		this.employeeAssgin = employeeAssgin;
	}

	public List<EmployeeAuth> getAuths() {
		return auths;
	}

	public void setAuths(List<EmployeeAuth> auths) {
		this.auths = auths;
	}

	public List<OrganizationManagment> getOrganizationManagement() {
		return organizationManagement;
	}

	public void setOrganizationManagement(List<OrganizationManagment> organizationManagement) {
		this.organizationManagement = organizationManagement;
	}

	public List<OrganizationDepartmentManagment> getDeptManagement() {
		return deptManagement;
	}

	public void setDeptManagement(List<OrganizationDepartmentManagment> deptManagement) {
		this.deptManagement = deptManagement;
	}

	public List<TeamManagement> getTeamManagement() {
		return teamManagement;
	}

	public void setTeamManagement(List<TeamManagement> teamManagement) {
		this.teamManagement = teamManagement;
	}

	public List<TeamManagement> getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(List<TeamManagement> teamMembers) {
		this.teamMembers = teamMembers;
	}

	public List<ProjectPhases> getProjectPhasedCreatedBy() {
		return projectPhasedCreatedBy;
	}

	public void setProjectPhasedCreatedBy(List<ProjectPhases> projectPhasedCreatedBy) {
		this.projectPhasedCreatedBy = projectPhasedCreatedBy;
	}

	public List<ProjectPhases> getProjectPhasedManager() {
		return projectPhasedManager;
	}

	public void setProjectPhasedManager(List<ProjectPhases> projectPhasedManager) {
		this.projectPhasedManager = projectPhasedManager;
	}

	public List<ProjectForum> getProjectForums() {
		return projectForums;
	}

	public void setProjectForums(List<ProjectForum> projectForums) {
		this.projectForums = projectForums;
	}

	public List<ProjectForumSubjectIssues> getProjectForumsIssues() {
		return projectForumsIssues;
	}

	public void setProjectForumsIssues(List<ProjectForumSubjectIssues> projectForumsIssues) {
		this.projectForumsIssues = projectForumsIssues;
	}

	public List<ProjectTasks> getEmployeeTasks() {
		return employeeTasks;
	}

	public void setEmployeeTasks(List<ProjectTasks> employeeTasks) {
		this.employeeTasks = employeeTasks;
	}

	public List<ProjectTasks> getEmployeeTimeScheduling() {
		return employeeTimeScheduling;
	}

	public void setEmployeeTimeScheduling(List<ProjectTasks> employeeTimeScheduling) {
		this.employeeTimeScheduling = employeeTimeScheduling;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
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
