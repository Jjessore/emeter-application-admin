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
@Table(name = "ipbase", schema  = "elecmet")
@Getter 
@Setter
@NoArgsConstructor
public class IPBase { // implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ip_id")
	public String ipId;

	@Column(name = "ip_meter", columnDefinition = "TEXT")
	private String ip_meter;
	
	@Column(name = "ip_rasp", columnDefinition = "TEXT")
	private String ip_rasp;
	
	@Column(name = "ip_springboot", columnDefinition = "TEXT")
	private String ip_springboot;
	
	@Column(name="ip_postgres", columnDefinition = "TEXT")
	private String ip_postgres;
	
	@Column(name = "ip_dashboard", columnDefinition = "TEXT")
	private LocalDateTime ip_dashboard;
	
	@Column(name = "ip_alert", columnDefinition = "TEXT")
	private LocalDateTime ip_alert;
	
	@Column(name="ip_active_status", columnDefinition = "TEXT")
	private String ip_active_status;
	
	@Column(name = "ip_active_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime ip_active_date;
	
	@Column(name = "ip_inactive_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime ip_inactive_date;
	
	@Column(name = "created_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime createdDate;
	
	@Column(name = "last_updated_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime lastUpdatedDate;
	
	@Column(name="created_user")
	private String createdUser;
	
	@Column(name="updated_user")
	private String updatedUser;
	
	@Column(name = "ip_flag", columnDefinition = "integer")
	private int ipFlag;
	
	@Column(name = "ipstatus", columnDefinition = "integer")
	private int ipStatus;

	public IPBase(String ipId, String ip_meter, String ip_rasp, String ip_springboot, String ip_postgres,
			LocalDateTime ip_dashboard, LocalDateTime ip_alert, String ip_active_status, LocalDateTime ip_active_date,
			LocalDateTime ip_inactive_date, LocalDateTime createdDate, LocalDateTime lastUpdatedDate,
			String createdUser, String updatedUser, int ipFlag, int ipStatus) {
		this.ipId = ipId;
		this.ip_meter = ip_meter;
		this.ip_rasp = ip_rasp;
		this.ip_springboot = ip_springboot;
		this.ip_postgres = ip_postgres;
		this.ip_dashboard = ip_dashboard;
		this.ip_alert = ip_alert;
		this.ip_active_status = ip_active_status;
		this.ip_active_date = ip_active_date;
		this.ip_inactive_date = ip_inactive_date;
		this.createdDate = createdDate;
		this.lastUpdatedDate = lastUpdatedDate;
		this.createdUser = createdUser;
		this.updatedUser = updatedUser;
		this.ipFlag = ipFlag;
		this.ipStatus = ipStatus;
	}

	/**
	 * @return the ipId
	 */
	public String getIpId() {
		return ipId;
	}

	/**
	 * @param ipId the ipId to set
	 */
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	/**
	 * @return the ip_meter
	 */
	public String getIp_meter() {
		return ip_meter;
	}

	/**
	 * @param ip_meter the ip_meter to set
	 */
	public void setIp_meter(String ip_meter) {
		this.ip_meter = ip_meter;
	}

	/**
	 * @return the ip_rasp
	 */
	public String getIp_rasp() {
		return ip_rasp;
	}

	/**
	 * @param ip_rasp the ip_rasp to set
	 */
	public void setIp_rasp(String ip_rasp) {
		this.ip_rasp = ip_rasp;
	}

	/**
	 * @return the ip_springboot
	 */
	public String getIp_springboot() {
		return ip_springboot;
	}

	/**
	 * @param ip_springboot the ip_springboot to set
	 */
	public void setIp_springboot(String ip_springboot) {
		this.ip_springboot = ip_springboot;
	}

	/**
	 * @return the ip_postgres
	 */
	public String getIp_postgres() {
		return ip_postgres;
	}

	/**
	 * @param ip_postgres the ip_postgres to set
	 */
	public void setIp_postgres(String ip_postgres) {
		this.ip_postgres = ip_postgres;
	}

	/**
	 * @return the ip_dashboard
	 */
	public LocalDateTime getIp_dashboard() {
		return ip_dashboard;
	}

	/**
	 * @param ip_dashboard the ip_dashboard to set
	 */
	public void setIp_dashboard(LocalDateTime ip_dashboard) {
		this.ip_dashboard = ip_dashboard;
	}

	/**
	 * @return the ip_alert
	 */
	public LocalDateTime getIp_alert() {
		return ip_alert;
	}

	/**
	 * @param ip_alert the ip_alert to set
	 */
	public void setIp_alert(LocalDateTime ip_alert) {
		this.ip_alert = ip_alert;
	}

	/**
	 * @return the ip_active_status
	 */
	public String getIp_active_status() {
		return ip_active_status;
	}

	/**
	 * @param ip_active_status the ip_active_status to set
	 */
	public void setIp_active_status(String ip_active_status) {
		this.ip_active_status = ip_active_status;
	}

	/**
	 * @return the ip_active_date
	 */
	public LocalDateTime getIp_active_date() {
		return ip_active_date;
	}

	/**
	 * @param ip_active_date the ip_active_date to set
	 */
	public void setIp_active_date(LocalDateTime ip_active_date) {
		this.ip_active_date = ip_active_date;
	}

	/**
	 * @return the ip_inactive_date
	 */
	public LocalDateTime getIp_inactive_date() {
		return ip_inactive_date;
	}

	/**
	 * @param ip_inactive_date the ip_inactive_date to set
	 */
	public void setIp_inactive_date(LocalDateTime ip_inactive_date) {
		this.ip_inactive_date = ip_inactive_date;
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
	 * @return the ipFlag
	 */
	public int getIpFlag() {
		return ipFlag;
	}

	/**
	 * @param ipFlag the ipFlag to set
	 */
	public void setIpFlag(int ipFlag) {
		this.ipFlag = ipFlag;
	}

	/**
	 * @return the ipStatus
	 */
	public int getIpStatus() {
		return ipStatus;
	}

	/**
	 * @param ipStatus the ipStatus to set
	 */
	public void setIpStatus(int ipStatus) {
		this.ipStatus = ipStatus;
	}

	@Override
	public String toString() {
		return "IPBase [ipId=" + ipId + ", ip_meter=" + ip_meter + ", ip_rasp=" + ip_rasp + ", ip_springboot="
				+ ip_springboot + ", ip_postgres=" + ip_postgres + ", ip_dashboard=" + ip_dashboard + ", ip_alert="
				+ ip_alert + ", ip_active_status=" + ip_active_status + ", ip_active_date=" + ip_active_date
				+ ", ip_inactive_date=" + ip_inactive_date + ", createdDate=" + createdDate + ", lastUpdatedDate="
				+ lastUpdatedDate + ", createdUser=" + createdUser + ", updatedUser=" + updatedUser + ", ipFlag="
				+ ipFlag + ", ipStatus=" + ipStatus + "]";
	}
}