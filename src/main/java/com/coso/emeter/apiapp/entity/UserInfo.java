package com.coso.emeter.apiapp.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(schema="elecmet", name="userinfo")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ui_id")
    private Long uiId;

    //@Column(name = "ci_id")
    //private String ciId;

    @Column(name = "ui_name")
    private String uiName;

    @Column(name = "ui_email")
    private String uiEmail;

    @Column(name = "ui_password")
    private String uiPassword;

    @Column(name = "ui_mobile ")
    private String uiMobile;

    @Column(name = "ui_state")
    private String uiState;

    @Column(name = "ui_city")
    private String uiCity;

    @Column(name = "ui_address")
    private String uiAddress;

    @Column(name = "ui_pincode")
    private String uiPincode;

    @Column(name = "ui_geolocation")
    private String uiGeolocation;

    @Column(name = "ui_profession")
    private String uiProfession;

    @Column(name = "ui_speciallization")
    private String uiSpeciallization;

    @Column(name = "ui_role")
    private String uiRole;

    @Column(name = "created_user")
    private String createdUser;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "updated_user")
    private String updatedUser;

    @Column(name = "last_updated_date")
    private Date lastUpdatedDate;

    @Column(name = "ui_status")
    private Integer uiStatus;

    @OneToOne
    @JoinColumn(name = "ci_id")
    CompInfo companyInfo;

}