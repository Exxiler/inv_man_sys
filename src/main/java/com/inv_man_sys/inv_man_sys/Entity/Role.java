package com.inv_man_sys.inv_man_sys.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String role_name;

    @Column(columnDefinition = "TEXT")
    private String role_description;


    public Role() {
        
    }

    public Role(String role_name) {
        this.role_name = role_name;
    }

    public Role(String role_name, String role_description) {
        this.role_name = role_name;
        this.role_description = role_description;
    }


    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
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
