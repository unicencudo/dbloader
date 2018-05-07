package com.smu.unicen.ul.cudo.entities.common;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class BaseEntity {
	
	@Column(name="CREATED_DATE")
	@Temporal (TemporalType.TIMESTAMP)
    private Date createdDate;
	
	@Column(name="LAST_MODIFIED_DATE")
	@Temporal (TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
	
	@Column(name="CREATED_BY")
    private int createdBy;
	
	@Column(name="LAST_MODIFIED_BY")
    private int lastModifiedBy;

	@Column(name="DELETE_IND")
    private String deleteInd;
	
	public BaseEntity(){}
	public BaseEntity(int userId){
		createdDate= new Date();
		lastModifiedDate= new Date();
		createdBy= userId;
		lastModifiedBy= userId;
		deleteInd="N";
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public int getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(int lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	
	public String getDeleteInd() {
		return deleteInd;
	}
	public void setDeleteInd(String deleteInd) {
		this.deleteInd = deleteInd;
	}
	
}	

