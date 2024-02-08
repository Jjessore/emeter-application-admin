/**
 * 
 */
package com.coso.emeter.apiapp.entity;


import javax.persistence.*;

import java.time.LocalDateTime;

import lombok.*;

@Entity
@Table(name = "meterbase", schema  = "elecmet")
@Getter 
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MeterBase { // implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="mb_id")
	public Long mbId;

	@Column(name = "mb_name", columnDefinition = "TEXT")
	private String mbName;
	
	@Column(name = "mb_manu_name", columnDefinition = "TEXT")
	private String mbManuName;
	
	@Column(name = "mb_model", columnDefinition = "TEXT")
	private String mbModel;
	
	@Column(name="mb_model_prgname", columnDefinition = "TEXT")
	private String mbModelPrgname;
	
	@Column(name = "mb_meternumber", columnDefinition = "TEXT")
	private String mbMeternumber;
	
	@Column(name = "mb_meter_desc", columnDefinition = "TEXT")
	private String mbMeterDesc;
	
	@Column(name="mb_meter_status", columnDefinition = "TEXT")
	private String mbMeterStatus;
	
	@Column(name = "mb_active_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime mbActiveDate;
	
	@Column(name = "mb_inactive_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime mbInactiveDate;
	
	@Column(name = "created_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime createdDate;
	
	@Column(name = "last_updated_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime lastUpdatedDate;
	
	@Column(name="created_user")
	private String createdUser;
	
	@Column(name="updated_user")
	private String updatedUser;
	
	@Column(name = "mb_flag", columnDefinition = "integer")
	private int mbFlag;
	
	@Column(name = "mb_status", columnDefinition = "integer")
	private int mbStatus;

	//public MeterBase(String mbId, String mbName, String mbManuName, String mbModel, String mbModelPrgname,
	//		LocalDateTime mbMeternumber, LocalDateTime mbMeterDesc, String mbMeterStatus, LocalDateTime mbActiveDate,
	//		LocalDateTime mbInactiveDate, LocalDateTime createdDate, LocalDateTime lastUpdatedDate, String createdUser,
	//		String updatedUser, int mbFlag, int mbStatus) {
	//	this.mbId = mbId;
	//	this.mbName = mbName;
	//	this.mbManuName = mbManuName;
	//	this.mbModel = mbModel;
	//	this.mbModelPrgname = mbModelPrgname;
	//	this.mbMeternumber = mbMeternumber;
	//	this.mbMeterDesc = mbMeterDesc;
	//	this.mbMeterStatus = mbMeterStatus;
	//	this.mbActiveDate = mbActiveDate;
	//	this.mbInactiveDate = mbInactiveDate;
	//	this.createdDate = createdDate;
	//	this.lastUpdatedDate = lastUpdatedDate;
	//	this.createdUser = createdUser;
	//	this.updatedUser = updatedUser;
	//	this.mbFlag = mbFlag;
	//	this.mbStatus = mbStatus;
	//}

	/**
	 * @return the mbId
	 */
	public Long getMbId() {
		return mbId;
	}

	/**
	 * @param mbId the mbId to set
	 */
	public void setMbId(Long mbId) {
		this.mbId = mbId;
	}

	/**
	 * @return the mbName
	 */
	public String getMbName() {
		return mbName;
	}

	/**
	 * @param mbName the mbName to set
	 */
	public void setMbName(String mbName) {
		this.mbName = mbName;
	}

	/**
	 * @return the mbManuName
	 */
	public String getMbManuName() {
		return mbManuName;
	}

	/**
	 * @param mbManuName the mbManuName to set
	 */
	public void setMbManuName(String mbManuName) {
		this.mbManuName = mbManuName;
	}

	/**
	 * @return the mbModel
	 */
	public String getMbModel() {
		return mbModel;
	}

	/**
	 * @param mbModel the mbModel to set
	 */
	public void setMbModel(String mbModel) {
		this.mbModel = mbModel;
	}

	/**
	 * @return the mbModelPrgname
	 */
	public String getMbModelPrgname() {
		return mbModelPrgname;
	}

	/**
	 * @param mbModelPrgname the mbModelPrgname to set
	 */
	public void setMbModelPrgname(String mbModelPrgname) {
		this.mbModelPrgname = mbModelPrgname;
	}

	/**
	 * @return the mbMeternumber
	 */
	public String getMbMeternumber() {
		return mbMeternumber;
	}

	/**
	 * @param mbMeternumber the mbMeternumber to set
	 */
	public void setMbMeternumber(String mbMeternumber) {
		this.mbMeternumber = mbMeternumber;
	}

	/**
	 * @return the mbMeterDesc
	 */
	public String getMbMeterDesc() {
		return mbMeterDesc;
	}

	/**
	 * @param mbMeterDesc the mbMeterDesc to set
	 */
	public void setMbMeterDesc(String mbMeterDesc) {
		this.mbMeterDesc = mbMeterDesc;
	}

	/**
	 * @return the mbMeterStatus
	 */
	public String getMbMeterStatus() {
		return mbMeterStatus;
	}

	/**
	 * @param mbMeterStatus the mbMeterStatus to set
	 */
	public void setMbMeterStatus(String mbMeterStatus) {
		this.mbMeterStatus = mbMeterStatus;
	}

	/**
	 * @return the mbActiveDate
	 */
	public LocalDateTime getMbActiveDate() {
		return mbActiveDate;
	}

	/**
	 * @param mbActiveDate the mbActiveDate to set
	 */
	public void setMbActiveDate(LocalDateTime mbActiveDate) {
		this.mbActiveDate = mbActiveDate;
	}

	/**
	 * @return the mbInactiveDate
	 */
	public LocalDateTime getMbInactiveDate() {
		return mbInactiveDate;
	}

	/**
	 * @param mbInactiveDate the mbInactiveDate to set
	 */
	public void setMbInactiveDate(LocalDateTime mbInactiveDate) {
		this.mbInactiveDate = mbInactiveDate;
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
	 * @return the mbFlag
	 */
	public int getMbFlag() {
		return mbFlag;
	}

	/**
	 * @param mbFlag the mbFlag to set
	 */
	public void setMbFlag(int mbFlag) {
		this.mbFlag = mbFlag;
	}

	/**
	 * @return the mbStatus
	 */
	public int getMbStatus() {
		return mbStatus;
	}

	/**
	 * @param mbStatus the mbStatus to set
	 */
	public void setMbStatus(int mbStatus) {
		this.mbStatus = mbStatus;
	}

	@Override
	public String toString() {
		return "MeterBase [mbId=" + mbId + ", mbName=" + mbName + ", mbManuName=" + mbManuName + ", mbModel=" + mbModel
				+ ", mbModelPrgname=" + mbModelPrgname + ", mbMeternumber=" + mbMeternumber + ", mbMeterDesc="
				+ mbMeterDesc + ", mbMeterStatus=" + mbMeterStatus + ", mbActiveDate=" + mbActiveDate
				+ ", mbInactiveDate=" + mbInactiveDate + ", createdDate=" + createdDate + ", lastUpdatedDate="
				+ lastUpdatedDate + ", createdUser=" + createdUser + ", updatedUser=" + updatedUser + ", mbFlag="
				+ mbFlag + ", mbStatus=" + mbStatus + "]";
	}
}