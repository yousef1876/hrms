package com.application.hrms.organization.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name = "assets")
public class Assets{

	@Id
	@GeneratedValue( strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
	
	@ManyToOne(cascade = javax.persistence.CascadeType.ALL)
	@JoinColumn(name = "department_id" , nullable = false)
	private Department departments;
	
	
	@Column( name = "asset_name" , nullable = false)
	private String assetName;
	
	@Column( name = "consuming_date" , nullable = false)
	private Date consumingDate;
	
	@Column( name = "amount" , nullable = true)
	private String amount;
	
	@Column( name = "quantity" , nullable = true)
	private String quantity;
	
	@Column( name = "total" , nullable = true)
	private String total;
	
	@Column( name = "currency" , nullable = true)
	private String currency;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Department getDepartments() {
		return departments;
	}

	public void setDepartments(Department departments) {
		this.departments = departments;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public Date getConsumingDate() {
		return consumingDate;
	}

	public void setConsumingDate(Date consumingDate) {
		this.consumingDate = consumingDate;
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

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
}
