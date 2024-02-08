/**
 * 
 */
package com.coso.emeter.apiapp.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.databind.JsonNode;

@Entity
@Table(name = "compinfo", schema  = "elecmet")
public class CompInfo { // implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ci_id")
	public String ciId;
	
	@Column(name = "ci_name", columnDefinition = "TEXT")
	private String ciName;
	
	@Column(name="ci_branch", columnDefinition = "TEXT")
	private String ciBranch;
	
	@Column(name="ci_parent_id", columnDefinition = "TEXT")
	private String 	ciParentId;
	
	@Column(name = "ci_add1", columnDefinition = "TEXT")
	private String ciAdd1;	
	
	@Column(name="ci_add2", columnDefinition = "TEXT")
    private String ciAdd2;
	
	@Column(name="ci_town", columnDefinition = "TEXT")
    private String ciTown;
	
	@Column(name="ci_state", columnDefinition = "TEXT")
    private String ciState;
	
	@Column(name="ci_pin", columnDefinition = "TEXT")
    private String ciPin;

	@Column(name="ci_admin_mobile", columnDefinition = "TEXT")
    private String ciAdminMobile;

	@Column(name="ci_admin_email", columnDefinition = "TEXT")
    private String ciAdminEmail;

	@Column(name="ci_sms_mobiles", columnDefinition = "TEXT")
    private String ciSmsMobiles;

	@Column(name="ci_emails", columnDefinition = "TEXT")
    private String ciEmails;

	@Column(name = "ci_meter_count", columnDefinition = "integer")
	private int ciMeterCount;	
	
	@Column(name = "created_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime createdDate;
	
	@Column(name = "last_updated_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime lastUpdatedDate;
	
	@Column(name="created_user")
	private String createdUser;
	
	@Column(name="updated_user")
	private String updatedUser;
	
	@Column(name = "ci_flag", columnDefinition = "integer")
	private int ciFlag;
	
	@Column(name = "ci_status", columnDefinition = "integer")
	private int ciStatus;

	public CompInfo() {
	}

	public CompInfo(String ciId, String ciName, String ciBranch, String ciParentId, String ciAdd1, String ciAdd2,
			String ciTown, String ciState, String ciPin, String ciAdminMobile, String ciAdminEmail, String ciSmsMobiles,
			String ciEmails, int ciMeterCount, LocalDateTime createdDate, LocalDateTime lastUpdatedDate,
			String createdUser, String updatedUser, int ciFlag, int ciStatus) {
		this.ciId = ciId;
		this.ciName = ciName;
		this.ciBranch = ciBranch;
		this.ciParentId = ciParentId;
		this.ciAdd1 = ciAdd1;
		this.ciAdd2 = ciAdd2;
		this.ciTown = ciTown;
		this.ciState = ciState;
		this.ciPin = ciPin;
		this.ciAdminMobile = ciAdminMobile;
		this.ciAdminEmail = ciAdminEmail;
		this.ciSmsMobiles = ciSmsMobiles;
		this.ciEmails = ciEmails;
		this.ciMeterCount = ciMeterCount;
		this.createdDate = createdDate;
		this.lastUpdatedDate = lastUpdatedDate;
		this.createdUser = createdUser;
		this.updatedUser = updatedUser;
		this.ciFlag = ciFlag;
		this.ciStatus = ciStatus;
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
	 * @return the ciName
	 */
	public String getCiName() {
		return ciName;
	}

	/**
	 * @param ciName the ciName to set
	 */
	public void setCiName(String ciName) {
		this.ciName = ciName;
	}

	/**
	 * @return the ciBranch
	 */
	public String getCiBranch() {
		return ciBranch;
	}

	/**
	 * @param ciBranch the ciBranch to set
	 */
	public void setCiBranch(String ciBranch) {
		this.ciBranch = ciBranch;
	}

	/**
	 * @return the ciParentId
	 */
	public String getCiParentId() {
		return ciParentId;
	}

	/**
	 * @param ciParentId the ciParentId to set
	 */
	public void setCiParentId(String ciParentId) {
		this.ciParentId = ciParentId;
	}

	/**
	 * @return the ciAdd1
	 */
	public String getCiAdd1() {
		return ciAdd1;
	}

	/**
	 * @param ciAdd1 the ciAdd1 to set
	 */
	public void setCiAdd1(String ciAdd1) {
		this.ciAdd1 = ciAdd1;
	}

	/**
	 * @return the ciAdd2
	 */
	public String getCiAdd2() {
		return ciAdd2;
	}

	/**
	 * @param ciAdd2 the ciAdd2 to set
	 */
	public void setCiAdd2(String ciAdd2) {
		this.ciAdd2 = ciAdd2;
	}

	/**
	 * @return the ciTown
	 */
	public String getCiTown() {
		return ciTown;
	}

	/**
	 * @param ciTown the ciTown to set
	 */
	public void setCiTown(String ciTown) {
		this.ciTown = ciTown;
	}

	/**
	 * @return the ciState
	 */
	public String getCiState() {
		return ciState;
	}

	/**
	 * @param ciState the ciState to set
	 */
	public void setCiState(String ciState) {
		this.ciState = ciState;
	}

	/**
	 * @return the ciPin
	 */
	public String getCiPin() {
		return ciPin;
	}

	/**
	 * @param ciPin the ciPin to set
	 */
	public void setCiPin(String ciPin) {
		this.ciPin = ciPin;
	}

	/**
	 * @return the ciAdminMobile
	 */
	public String getCiAdminMobile() {
		return ciAdminMobile;
	}

	/**
	 * @param ciAdminMobile the ciAdminMobile to set
	 */
	public void setCiAdminMobile(String ciAdminMobile) {
		this.ciAdminMobile = ciAdminMobile;
	}

	/**
	 * @return the ciAdminEmail
	 */
	public String getCiAdminEmail() {
		return ciAdminEmail;
	}

	/**
	 * @param ciAdminEmail the ciAdminEmail to set
	 */
	public void setCiAdminEmail(String ciAdminEmail) {
		this.ciAdminEmail = ciAdminEmail;
	}

	/**
	 * @return the ciSmsMobiles
	 */
	public String getCiSmsMobiles() {
		return ciSmsMobiles;
	}

	/**
	 * @param ciSmsMobiles the ciSmsMobiles to set
	 */
	public void setCiSmsMobiles(String ciSmsMobiles) {
		this.ciSmsMobiles = ciSmsMobiles;
	}

	/**
	 * @return the ciEmails
	 */
	public String getCiEmails() {
		return ciEmails;
	}

	/**
	 * @param ciEmails the ciEmails to set
	 */
	public void setCiEmails(String ciEmails) {
		this.ciEmails = ciEmails;
	}

	/**
	 * @return the ciMeterCount
	 */
	public int getCiMeterCount() {
		return ciMeterCount;
	}

	/**
	 * @param ciMeterCount the ciMeterCount to set
	 */
	public void setCiMeterCount(int ciMeterCount) {
		this.ciMeterCount = ciMeterCount;
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
	 * @return the ciFlag
	 */
	public int getCiFlag() {
		return ciFlag;
	}

	/**
	 * @param ciFlag the ciFlag to set
	 */
	public void setCiFlag(int ciFlag) {
		this.ciFlag = ciFlag;
	}

	/**
	 * @return the ciStatus
	 */
	public int getCiStatus() {
		return ciStatus;
	}

	/**
	 * @param ciStatus the ciStatus to set
	 */
	public void setCiStatus(int ciStatus) {
		this.ciStatus = ciStatus;
	}

	@Override
	public String toString() {
		return "CompInfo [ciId=" + ciId + ", ciName=" + ciName + ", ciBranch=" + ciBranch + ", ciParentId=" + ciParentId
				+ ", ciAdd1=" + ciAdd1 + ", ciAdd2=" + ciAdd2 + ", ciTown=" + ciTown + ", ciState=" + ciState
				+ ", ciPin=" + ciPin + ", ciAdminMobile=" + ciAdminMobile + ", ciAdminEmail=" + ciAdminEmail
				+ ", ciSmsMobiles=" + ciSmsMobiles + ", ciEmails=" + ciEmails + ", ciMeterCount=" + ciMeterCount
				+ ", createdDate=" + createdDate + ", lastUpdatedDate=" + lastUpdatedDate + ", createdUser="
				+ createdUser + ", updatedUser=" + updatedUser + ", ciFlag=" + ciFlag + ", ciStatus=" + ciStatus + "]";
	}

}