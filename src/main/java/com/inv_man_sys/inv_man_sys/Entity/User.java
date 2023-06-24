package com.inv_man_sys.inv_man_sys.Entity;

import java.util.Collection;
import java.util.Date;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;


@Entity
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = "username")})
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private String name;

    @Column (unique = true)
    private String username;


    private String password;


    private Date created_at;

    
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
                name = "user_roles",
                joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;


    public User() {}

    public User(String name, String username, String password, Date created_at, Collection<Role> roles) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.created_at = created_at;
        this.roles = roles;
    }

    public User(String name, String username, String password, Collection<Role> roles) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.created_at = new Date();
        this.roles = roles;
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

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRole(Collection<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User [id =" + id + ", name =" + name + ", username =" + username + ", password =" + password + ", created_at =" + created_at + ", roles =" + roles + "]";
    }

}
