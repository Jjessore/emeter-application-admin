/**
 * 
 */
package com.coso.emeter.apiapp.entity;

import javax.persistence.*;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "compraspinfo", schema  = "elecmet")
@Getter 
@Setter
@NoArgsConstructor
public class CompRaspInfo { // implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="cr_id")
	public Long crId;
	
	@Column(name = "ci_id", columnDefinition = "TEXT")
	private String ciId;
	
	@Column(name = "cr_rasp_macID", columnDefinition = "TEXT")
	private String crRaspMacID;
	
	@Column(name="cr_rasp_status", columnDefinition = "TEXT")
	private String crRaspStatus;
	
	@Column(name = "cr_active_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime crActiveDate;
	
	@Column(name = "cr_inactive_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime crInactiveDate;
	
	
	@Column(name = "created_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime createdDate;
	
	@Column(name = "last_updated_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime lastUpdatedDate;
	
	@Column(name="created_user")
	private String createdUser;
	
	@Column(name="updated_user")
	private String updatedUser;
	
	@Column(name = "cr_flag", columnDefinition = "integer")
	private int crFlag;
	
	@Column(name = "cr_status", columnDefinition = "integer")
	private int crStatus;

	public CompRaspInfo(Long crId, String ciId, String crRaspMacID, String crRaspStatus, LocalDateTime crActiveDate,
			LocalDateTime crInactiveDate, LocalDateTime createdDate, LocalDateTime lastUpdatedDate, String createdUser,
			String updatedUser, int crFlag, int crStatus) {
		this.crId = crId;
		this.ciId = ciId;
		this.crRaspMacID = crRaspMacID;
		this.crRaspStatus = crRaspStatus;
		this.crActiveDate = crActiveDate;
		this.crInactiveDate = crInactiveDate;
		this.createdDate = createdDate;
		this.lastUpdatedDate = lastUpdatedDate;
		this.createdUser = createdUser;
		this.updatedUser = updatedUser;
		this.crFlag = crFlag;
		this.crStatus = crStatus;
	}

	public Long getCrId() {
		return crId;
	}

	public void setCrId(Long crId) {
		this.crId = crId;
	}

	public String getCiId() {
		return ciId;
	}

	public void setCiId(String ciId) {
		this.ciId = ciId;
	}

	public String getCrRaspMacID() {
		return crRaspMacID;
	}

	public void setCrRaspMacID(String crRaspMacID) {
		this.crRaspMacID = crRaspMacID;
	}

	public String getCrRaspStatus() {
		return crRaspStatus;
	}

	public void setCrRaspStatus(String crRaspStatus) {
		this.crRaspStatus = crRaspStatus;
	}

	public LocalDateTime getCrActiveDate() {
		return crActiveDate;
	}

	public void setCrActiveDate(LocalDateTime crActiveDate) {
		this.crActiveDate = crActiveDate;
	}

	public LocalDateTime getCrInactiveDate() {
		return crInactiveDate;
	}

	public void setCrInactiveDate(LocalDateTime crInactiveDate) {
		this.crInactiveDate = crInactiveDate;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public String getUpdatedUser() {
		return updatedUser;
	}

	public void setUpdatedUser(String updatedUser) {
		this.updatedUser = updatedUser;
	}

	public int getCrFlag() {
		return crFlag;
	}

	public void setCrFlag(int crFlag) {
		this.crFlag = crFlag;
	}

	public int getCrStatus() {
		return crStatus;
	}

	public void setCrStatus(int crStatus) {
		this.crStatus = crStatus;
	}

	@Override
	public String toString() {
		return "CompRaspInfo [crId=" + crId + ", ciId=" + ciId + ", crRaspMacID=" + crRaspMacID + ", crRaspStatus="
				+ crRaspStatus + ", crActiveDate=" + crActiveDate + ", crInactiveDate=" + crInactiveDate
				+ ", createdDate=" + createdDate + ", lastUpdatedDate=" + lastUpdatedDate + ", createdUser="
				+ createdUser + ", updatedUser=" + updatedUser + ", crFlag=" + crFlag + ", crStatus=" + crStatus + "]";
	}
}