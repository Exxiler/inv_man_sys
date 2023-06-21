package com.inv_man_sys.inv_man_sys.Entity;

import java.util.Date;

import jakarta.persistence.Entity;

@Entity
public class User {
    
    private String name;
    private String username;
    private String password;
    private Date created_at;
    private Role role;
    

    private User() {
        
    }

    public User(String name, String username, String password, Date created_at, Role role) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.created_at = created_at;
        this.role = role;
    }

    public User(String name, String username, String password, Role role) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.created_at = new Date();
        this.role = new Role();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


}
