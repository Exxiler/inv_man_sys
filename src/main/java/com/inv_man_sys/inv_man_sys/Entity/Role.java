package com.inv_man_sys.inv_man_sys.Entity;

import jakarta.persistence.Entity;

@Entity
public class Role {
    
    private String role_name;
    private String role_description;


    private Role() {
        
    }

    public Role(String role_name, String role_description) {
        this.role_name = role_name;
        this.role_description = role_description;
    }

    
     public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_description() {
        return role_description;
    }

    public void setRole_description(String role_description) {
        this.role_description = role_description;
    }

}
