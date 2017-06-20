package com.application.hrms.person.model;

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

@Entity
@Table(name = "person_expereince")
public class PersonExpereince {

	
	@Id
	@GeneratedValue( strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	@JoinColumn(name = "person_id" , nullable = false)
	private Person persons;
	
	@Column(name = "title" , nullable = true)
	private String title;
	
	@Column(name = "subject" , nullable = true)
	private String subject;

	@Column(name = "position" , nullable = false)
    private String position;
    
	@Column(name = "notes" , nullable = true)
    private String notes;
    
	@Column(name = "description" , nullable = true)
    private String description;
    
	@Column(name = "from_date" , nullable = false)
    private Date fromDate;
    
	@Column(name = "to_date" , nullable = false)
    private Date toDate;
    
	@Column(name = "notice_period" , nullable = true)
    private String noticPeriod;
	
	@Column(name = "currently" , nullable = true)
    private boolean currently;
    
	@Column(name = "contract_type" , nullable = true)
    private String contractType;
    
	@Column(name = "full_time" , nullable = true)
    private String fullTime;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Person getPersons() {
		return persons;
	}

	public void setPersons(Person persons) {
		this.persons = persons;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
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

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getNoticPeriod() {
		return noticPeriod;
	}

	public void setNoticPeriod(String noticPeriod) {
		this.noticPeriod = noticPeriod;
	}

	public boolean isCurrently() {
		return currently;
	}

	public void setCurrently(boolean currently) {
		this.currently = currently;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getFullTime() {
		return fullTime;
	}

	public void setFullTime(String fullTime) {
		this.fullTime = fullTime;
	}
   
}
