/**
 * 
 */
package com.coso.emeter.apiapp.entity;

import javax.persistence.*;


import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "raspbase", schema  = "elecmet")
@Getter 
@Setter
@NoArgsConstructor
public class RaspBase { // implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="rb_id")
	public Long rbId;

	@Column(name = "rb_macid", columnDefinition = "TEXT")
	private String rbMacid;
	
	@Column(name = "rb_manu_name", columnDefinition = "TEXT")
	private String rbManuName;
	
	@Column(name = "rb_model", columnDefinition = "TEXT")
	private String rbModel;
	
	@Column(name="rb_connection_strut", columnDefinition = "TEXT")
	private String rbConnectionStrut;
	
	@Column(name = "rb_os_ver", columnDefinition = "TEXT")
	private String rbOSVer;
	
	@Column(name = "rb_desc", columnDefinition = "TEXT")
	private String rbDesc;
	
	@Column(name="rb_active_status", columnDefinition = "TEXT")
	private String rbActiveStatus;
	
	@Column(name = "rb_active_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime rbActiveDate;
	
	@Column(name = "rb_inactive_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime rbInactiveDate;
	
	@Column(name = "created_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime createdDate;
	
	@Column(name = "last_updated_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime lastUpdatedDate;
	
	@Column(name="created_user")
	private String createdUser;
	
	@Column(name="updated_user")
	private String updatedUser;
	
	@Column(name = "rb_flag", columnDefinition = "integer")
	private int rbFlag;
	
	@Column(name = "rb_status", columnDefinition = "integer")
	private int rbStatus;

	public RaspBase(Long rbId, String rbMacid, String rbManuName, String rbModel, String rbConnectionStrut,
			String rbOSVer, String rbDesc, String rbActiveStatus, LocalDateTime rbActiveDate,
			LocalDateTime rbInactiveDate, LocalDateTime createdDate, LocalDateTime lastUpdatedDate, String createdUser,
			String updatedUser, int rbFlag, int rbStatus) {
		this.rbId = rbId;
		this.rbMacid = rbMacid;
		this.rbManuName = rbManuName;
		this.rbModel = rbModel;
		this.rbConnectionStrut = rbConnectionStrut;
		this.rbOSVer = rbOSVer;
		this.rbDesc = rbDesc;
		this.rbActiveStatus = rbActiveStatus;
		this.rbActiveDate = rbActiveDate;
		this.rbInactiveDate = rbInactiveDate;
		this.createdDate = createdDate;
		this.lastUpdatedDate = lastUpdatedDate;
		this.createdUser = createdUser;
		this.updatedUser = updatedUser;
		this.rbFlag = rbFlag;
		this.rbStatus = rbStatus;
	}

	/**
	 * @return the rbId
	 */
	public Long getRbId() {
		return rbId;
	}

	/**
	 * @param rbId the rbId to set
	 */
	public void setRbId(Long rbId) {
		this.rbId = rbId;
	}

	/**
	 * @return the rbMacid
	 */
	public String getRbMacid() {
		return rbMacid;
	}

	/**
	 * @param rbMacid the rbMacid to set
	 */
	public void setRbMacid(String rbMacid) {
		this.rbMacid = rbMacid;
	}

	/**
	 * @return the rbManuName
	 */
	public String getRbManuName() {
		return rbManuName;
	}

	/**
	 * @param rbManuName the rbManuName to set
	 */
	public void setRbManuName(String rbManuName) {
		this.rbManuName = rbManuName;
	}

	/**
	 * @return the rbModel
	 */
	public String getRbModel() {
		return rbModel;
	}

	/**
	 * @param rbModel the rbModel to set
	 */
	public void setRbModel(String rbModel) {
		this.rbModel = rbModel;
	}

	/**
	 * @return the rbConnectionStrut
	 */
	public String getRbConnectionStrut() {
		return rbConnectionStrut;
	}

	/**
	 * @param rbConnectionStrut the rbConnectionStrut to set
	 */
	public void setRbConnectionStrut(String rbConnectionStrut) {
		this.rbConnectionStrut = rbConnectionStrut;
	}

	/**
	 * @return the rbOSVer
	 */
	public String getRbOSVer() {
		return rbOSVer;
	}

	/**
	 * @param rbOSVer the rbOSVer to set
	 */
	public void setRbOSVer(String rbOSVer) {
		this.rbOSVer = rbOSVer;
	}

	/**
	 * @return the rbDesc
	 */
	public String getRbDesc() {
		return rbDesc;
	}

	/**
	 * @param rbDesc the rbDesc to set
	 */
	public void setRbDesc(String rbDesc) {
		this.rbDesc = rbDesc;
	}

	/**
	 * @return the rbActiveStatus
	 */
	public String getRbActiveStatus() {
		return rbActiveStatus;
	}

	/**
	 * @param rbActiveStatus the rbActiveStatus to set
	 */
	public void setRbActiveStatus(String rbActiveStatus) {
		this.rbActiveStatus = rbActiveStatus;
	}

	/**
	 * @return the rbActiveDate
	 */
	public LocalDateTime getRbActiveDate() {
		return rbActiveDate;
	}

	/**
	 * @param rbActiveDate the rbActiveDate to set
	 */
	public void setRbActiveDate(LocalDateTime rbActiveDate) {
		this.rbActiveDate = rbActiveDate;
	}

	/**
	 * @return the rbInactiveDate
	 */
	public LocalDateTime getRbInactiveDate() {
		return rbInactiveDate;
	}

	/**
	 * @param rbInactiveDate the rbInactiveDate to set
	 */
	public void setRbInactiveDate(LocalDateTime rbInactiveDate) {
		this.rbInactiveDate = rbInactiveDate;
	}

	/**
	 * @return the createdDate
	 */
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the lastUpdatedDate
	 */
	public LocalDateTime getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	/**
	 * @param lastUpdatedDate the lastUpdatedDate to set
	 */
	public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	/**
	 * @return the createdUser
	 */
	public String getCreatedUser() {
		return createdUser;
	}

	/**
	 * @param createdUser the createdUser to set
	 */
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	/**
	 * @return the updatedUser
	 */
	public String getUpdatedUser() {
		return updatedUser;
	}

	/**
	 * @param updatedUser the updatedUser to set
	 */
	public void setUpdatedUser(String updatedUser) {
		this.updatedUser = updatedUser;
	}

	/**
	 * @return the rbFlag
	 */
	public int getRbFlag() {
		return rbFlag;
	}

	/**
	 * @param rbFlag the rbFlag to set
	 */
	public void setRbFlag(int rbFlag) {
		this.rbFlag = rbFlag;
	}

	/**
	 * @return the rbStatus
	 */
	public int getRbStatus() {
		return rbStatus;
	}

	/**
	 * @param rbStatus the rbStatus to set
	 */
	public void setRbStatus(int rbStatus) {
		this.rbStatus = rbStatus;
	}

	@Override
	public String toString() {
		return "RaspBase [rbId=" + rbId + ", rbMacid=" + rbMacid + ", rbManuName=" + rbManuName + ", rbModel=" + rbModel
				+ ", rbConnectionStrut=" + rbConnectionStrut + ", rbOSVer=" + rbOSVer + ", rbDesc=" + rbDesc
				+ ", rbActiveStatus=" + rbActiveStatus + ", rbActiveDate=" + rbActiveDate + ", rbInactiveDate="
				+ rbInactiveDate + ", createdDate=" + createdDate + ", lastUpdatedDate=" + lastUpdatedDate
				+ ", createdUser=" + createdUser + ", updatedUser=" + updatedUser + ", rbFlag=" + rbFlag + ", rbStatus="
				+ rbStatus + "]";
	}
}