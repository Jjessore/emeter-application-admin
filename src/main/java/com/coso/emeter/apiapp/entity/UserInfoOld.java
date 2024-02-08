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
@Table(schema="elecmet", name="usm_users")
public class UserInfoOld {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usm_user_id")
    private Long user_id;

    //@Column(name = "usm_user_org_id")
    //private String user_org_id;

    @Column(name = "usm_user_name")
    private String user_name;

    @Column(name = "usm_user_email")
    private String user_email;

    @Column(name = "usm_user_password")
    private String user_password;

    @Column(name = "usm_user_mobile")
    private String user_mobile;

    @Column(name = "usm_user_state")
    private String user_state;

    @Column(name = "usm_user_city")
    private String user_city;

    @Column(name = "usm_user_address")
    private String user_address;

    @Column(name = "usm_user_pincode")
    private String user_pincode;

    @Column(name = "usm_user_geolocation")
    private String user_geolocation;

    @Column(name = "usm_user_profession")
    private String user_profession;

    @Column(name = "usm_user_speciallization")
    private String user_speciallization;

    @Column(name = "usm_user_role")
    private String user_role;

    @Column(name = "usm_user_created_by")
    private String user_created_by;

    @Column(name = "usm_user_created_date_time")
    private Date user_created_date;

    @Column(name = "usm_user_updated_by")
    private String user_updated_by;

    @Column(name = "usm_user_updated_date_time")
    private Date user_updated_date;

    @Column(name = "usm_user_status")
    private String user_status;

    @OneToOne
    @JoinColumn(name = "usm_user_org_id")
    CompInfo companyInfo;

}
