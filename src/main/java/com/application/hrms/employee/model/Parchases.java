package com.application.hrms.employee.model;



import java.util.Date;
import java.util.List;

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
@Table(name = "parchases")
public class Parchases {
	
	@Id
	@GeneratedValue( strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;

	@Column( name = "name" , nullable = false)
	private String name;
	
	@Column( name = "amount" , nullable = false)
	private String amount;
	
	@Column( name = "quantity" , nullable = true)
	private String quantity;
	
	@Column( name = "serial_no" , nullable = true)
	private String serialNo;
	
	@Column( name = "model_no" , nullable = true)
	private String modelNo;
	
	@Column( name = "cost" , nullable = true)
	private String cost;
	
	@ManyToOne(cascade = javax.persistence.CascadeType.ALL)
	@JoinColumn(name = "employee_id" , nullable = false)
	private EmployeeUser createdBy;
	
	@Column( name = "created_date" , nullable = false)
    private Date createdDate;
    
	@Column( name = "issue_date" , nullable = false)
    private Date issueDate;
    
	@Column( name = "next_side_name" , nullable = true)
    private String nextSideName;
    
	@Column( name = "next_side_address" , nullable = true)
    private String nextSideAddress;
	
	@Column( name = "notes" , nullable = true)
    private String notes;

	@Column( name = "description" , nullable = true)
    private String description;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "parchases")
	private List<EmployeeInsuranceBills> parchases;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<EmployeeInsuranceBills> getParchases() {
		return parchases;
	}

	public void setParchases(List<EmployeeInsuranceBills> parchases) {
		this.parchases = parchases;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
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

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public String getNextSideName() {
		return nextSideName;
	}

	public void setNextSideName(String nextSideName) {
		this.nextSideName = nextSideName;
	}

	public String getNextSideAddress() {
		return nextSideAddress;
	}

	public void setNextSideAddress(String nextSideAddress) {
		this.nextSideAddress = nextSideAddress;
	}

}
