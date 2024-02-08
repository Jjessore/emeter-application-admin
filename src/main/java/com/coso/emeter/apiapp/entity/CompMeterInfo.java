/**
 * 
 */
package com.coso.emeter.apiapp.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "compmeterinfo", schema  = "elecmet")
@Getter 
@Setter
@NoArgsConstructor
public class CompMeterInfo { // implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="cm_id")
	public Long cmId;
	
	@Column(name = "ci_id", columnDefinition = "TEXT")
	private String ciId;
	
	@Column(name = "cm_cur_rasp_macID", columnDefinition = "TEXT")
	private String cmCurRaspMmacID;
	
	@Column(name = "cm_phy_meter_id", columnDefinition = "TEXT")
	private String cmPhyMeterId;
	
	@Column(name = "cm_pk_meter_id", columnDefinition = "TEXT")
	private String cmPKMeterId;
	
	
	@Column(name="cm_meter_status", columnDefinition = "TEXT")
	private String cmMeterStatus;
	
	@Column(name = "cm_active_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime cmActiveDate;
	
	@Column(name = "cm_inactive_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime cmInactiveDate;
	
	@Column(name="cm_meter_name", columnDefinition = "TEXT")
	private String cmMeterName;
	
	@Column(name="cmMeterBlock", columnDefinition = "TEXT")
	private String cmMeterBlock;
	
	@Column(name="cm_meter_dept", columnDefinition = "TEXT")
	private String cmMeterDept;
	
	@Column(name="cm_meter_divi", columnDefinition = "TEXT")
	private String cmMeterDivi;
	
	@Column(name="cm_meter_team", columnDefinition = "TEXT")
	private String cmMeterTeam;
	
	@Column(name="cm_meter_connmachine", columnDefinition = "TEXT")
	private String cmMeterConnmachine;
	
	@Column(name="cm_meter_desc", columnDefinition = "TEXT")
	private String cmMeterDesc;
	
	@Column(name="mb_name", columnDefinition = "TEXT")
	private String mbName;
	
	@Column(name="mb_model", columnDefinition = "TEXT")
	private String mbModel;
	
	@Column(name="mb_model_prgname", columnDefinition = "TEXT")
	private String mbModelPrgname;

	@Column(name = "created_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime createdDate;
	
	@Column(name = "last_updated_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime lastUpdatedDate;
	
	@Column(name="created_user")
	private String createdUser;
	
	@Column(name="updated_user")
	private String updatedUser;
	
	@Column(name = "cm_flag", columnDefinition = "integer")
	private int cmFlag;
	
	@Column(name = "cm_status", columnDefinition = "integer")
	private int cmStatus;

	public CompMeterInfo(Long cmId, String ciId, String cmCurRaspMmacID, String cmPhyMeterId, String cmPKMeterId,
			String cmMeterStatus, LocalDateTime cmActiveDate, LocalDateTime cmInactiveDate, String cmMeterName,
			String cmMeterBlock, String cmMeterDept, String cmMeterDivi, String cmMeterTeam, String cmMeterConnmachine,
			String cmMeterDesc, String mbName, String mbModel, String mbModelPrgname, LocalDateTime createdDate,
			LocalDateTime lastUpdatedDate, String createdUser, String updatedUser, int cmFlag, int cmStatus) {
		this.cmId = cmId;
		this.ciId = ciId;
		this.cmCurRaspMmacID = cmCurRaspMmacID;
		this.cmPhyMeterId = cmPhyMeterId;
		this.cmPKMeterId = cmPKMeterId;
		this.cmMeterStatus = cmMeterStatus;
		this.cmActiveDate = cmActiveDate;
		this.cmInactiveDate = cmInactiveDate;
		this.cmMeterName = cmMeterName;
		this.cmMeterBlock = cmMeterBlock;
		this.cmMeterDept = cmMeterDept;
		this.cmMeterDivi = cmMeterDivi;
		this.cmMeterTeam = cmMeterTeam;
		this.cmMeterConnmachine = cmMeterConnmachine;
		this.cmMeterDesc = cmMeterDesc;
		this.mbName = mbName;
		this.mbModel = mbModel;
		this.mbModelPrgname = mbModelPrgname;
		this.createdDate = createdDate;
		this.lastUpdatedDate = lastUpdatedDate;
		this.createdUser = createdUser;
		this.updatedUser = updatedUser;
		this.cmFlag = cmFlag;
		this.cmStatus = cmStatus;
	}

	/**
	 * @return the cmId
	 */
	public Long getCmId() {
		return cmId;
	}

	/**
	 * @param cmId the cmId to set
	 */
	public void setCmId(Long cmId) {
		this.cmId = cmId;
	}

	/**
	 * @return the ciId
	 */
	public String getCiId() {
		return ciId;
	}

	/**
	 * @param ciId the ciId to set
	 */
	public void setCiId(String ciId) {
		this.ciId = ciId;
	}

	/**
	 * @return the cmCurRaspMmacID
	 */
	public String getCmCurRaspMmacID() {
		return cmCurRaspMmacID;
	}

	/**
	 * @param cmCurRaspMmacID the cmCurRaspMmacID to set
	 */
	public void setCmCurRaspMmacID(String cmCurRaspMmacID) {
		this.cmCurRaspMmacID = cmCurRaspMmacID;
	}

	/**
	 * @return the cmPhyMeterId
	 */
	public String getCmPhyMeterId() {
		return cmPhyMeterId;
	}

	/**
	 * @param cmPhyMeterId the cmPhyMeterId to set
	 */
	public void setCmPhyMeterId(String cmPhyMeterId) {
		this.cmPhyMeterId = cmPhyMeterId;
	}

	/**
	 * @return the cmPKMeterId
	 */
	public String getCmPKMeterId() {
		return cmPKMeterId;
	}

	/**
	 * @param cmPKMeterId the cmPKMeterId to set
	 */
	public void setCmPKMeterId(String cmPKMeterId) {
		this.cmPKMeterId = cmPKMeterId;
	}

	/**
	 * @return the cmMeterStatus
	 */
	public String getCmMeterStatus() {
		return cmMeterStatus;
	}

	/**
	 * @param cmMeterStatus the cmMeterStatus to set
	 */
	public void setCmMeterStatus(String cmMeterStatus) {
		this.cmMeterStatus = cmMeterStatus;
	}

	/**
	 * @return the cmActiveDate
	 */
	public LocalDateTime getCmActiveDate() {
		return cmActiveDate;
	}

	/**
	 * @param cmActiveDate the cmActiveDate to set
	 */
	public void setCmActiveDate(LocalDateTime cmActiveDate) {
		this.cmActiveDate = cmActiveDate;
	}

	/**
	 * @return the cmInactiveDate
	 */
	public LocalDateTime getCmInactiveDate() {
		return cmInactiveDate;
	}

	/**
	 * @param cmInactiveDate the cmInactiveDate to set
	 */
	public void setCmInactiveDate(LocalDateTime cmInactiveDate) {
		this.cmInactiveDate = cmInactiveDate;
	}

	/**
	 * @return the cmMeterName
	 */
	public String getCmMeterName() {
		return cmMeterName;
	}

	/**
	 * @param cmMeterName the cmMeterName to set
	 */
	public void setCmMeterName(String cmMeterName) {
		this.cmMeterName = cmMeterName;
	}

	/**
	 * @return the cmMeterBlock
	 */
	public String getCmMeterBlock() {
		return cmMeterBlock;
	}

	/**
	 * @param cmMeterBlock the cmMeterBlock to set
	 */
	public void setCmMeterBlock(String cmMeterBlock) {
		this.cmMeterBlock = cmMeterBlock;
	}

	/**
	 * @return the cmMeterDept
	 */
	public String getCmMeterDept() {
		return cmMeterDept;
	}

	/**
	 * @param cmMeterDept the cmMeterDept to set
	 */
	public void setCmMeterDept(String cmMeterDept) {
		this.cmMeterDept = cmMeterDept;
	}

	/**
	 * @return the cmMeterDivi
	 */
	public String getCmMeterDivi() {
		return cmMeterDivi;
	}

	/**
	 * @param cmMeterDivi the cmMeterDivi to set
	 */
	public void setCmMeterDivi(String cmMeterDivi) {
		this.cmMeterDivi = cmMeterDivi;
	}

	/**
	 * @return the cmMeterTeam
	 */
	public String getCmMeterTeam() {
		return cmMeterTeam;
	}

	/**
	 * @param cmMeterTeam the cmMeterTeam to set
	 */
	public void setCmMeterTeam(String cmMeterTeam) {
		this.cmMeterTeam = cmMeterTeam;
	}

	/**
	 * @return the cmMeterConnmachine
	 */
	public String getCmMeterConnmachine() {
		return cmMeterConnmachine;
	}

	/**
	 * @param cmMeterConnmachine the cmMeterConnmachine to set
	 */
	public void setCmMeterConnmachine(String cmMeterConnmachine) {
		this.cmMeterConnmachine = cmMeterConnmachine;
	}

	/**
	 * @return the cmMeterDesc
	 */
	public String getCmMeterDesc() {
		return cmMeterDesc;
	}

	/**
	 * @param cmMeterDesc the cmMeterDesc to set
	 */
	public void setCmMeterDesc(String cmMeterDesc) {
		this.cmMeterDesc = cmMeterDesc;
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
	 * @return the cmFlag
	 */
	public int getCmFlag() {
		return cmFlag;
	}

	/**
	 * @param cmFlag the cmFlag to set
	 */
	public void setCmFlag(int cmFlag) {
		this.cmFlag = cmFlag;
	}

	/**
	 * @return the cmStatus
	 */
	public int getCmStatus() {
		return cmStatus;
	}

	/**
	 * @param cmStatus the cmStatus to set
	 */
	public void setCmStatus(int cmStatus) {
		this.cmStatus = cmStatus;
	}

	@Override
	public String toString() {
		return "CompMeterInfo [cmId=" + cmId + ", ciId=" + ciId + ", cmCurRaspMmacID=" + cmCurRaspMmacID
				+ ", cmPhyMeterId=" + cmPhyMeterId + ", cmPKMeterId=" + cmPKMeterId + ", cmMeterStatus=" + cmMeterStatus
				+ ", cmActiveDate=" + cmActiveDate + ", cmInactiveDate=" + cmInactiveDate + ", cmMeterName="
				+ cmMeterName + ", cmMeterBlock=" + cmMeterBlock + ", cmMeterDept=" + cmMeterDept + ", cmMeterDivi="
				+ cmMeterDivi + ", cmMeterTeam=" + cmMeterTeam + ", cmMeterConnmachine=" + cmMeterConnmachine
				+ ", cmMeterDesc=" + cmMeterDesc + ", mbName=" + mbName + ", mbModel=" + mbModel + ", mbModelPrgname="
				+ mbModelPrgname + ", createdDate=" + createdDate + ", lastUpdatedDate=" + lastUpdatedDate
				+ ", createdUser=" + createdUser + ", updatedUser=" + updatedUser + ", cmFlag=" + cmFlag + ", cmStatus="
				+ cmStatus + "]";
	}
	
}