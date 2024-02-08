package com.coso.emeter.apiapp.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity()
@Table(name = "permission", schema  = "elecmet")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PermissionOld {

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name="mb_id")
    //public String mbId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "roleid" )
    public Long roleId;

    @Column(name = "role_name" )
    public String role_name;

    @Column(name = "rasp_Menu" )
    public Boolean rasp_Menu;

    @Column(name = "companymenu" )
    public Boolean companymenu;

    @Column(name = "metermenu" )
    public Boolean metermenu;

    @Column(name = "edit_ops" )
    public Boolean edit_Ops;

    @Column(name = "delete_ops" )
    public Boolean delete_Ops;

    @Column(name = "update_ops" )
    public Boolean update_ops;

    @Column(name = "addnew" )
    public Boolean addnew;

    @Column(name = "view_ops" )
    public Boolean view_ops;

}
