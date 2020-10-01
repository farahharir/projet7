package com.techprimers.security.springsecurityauthserver.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="role")
public class Role implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="role_id")
    private int roleId;

    @Column
    private String role;

    public Role() {
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}