package com.inv_man_sys.inv_man_sys.Repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.inv_man_sys.inv_man_sys.Entity.User;

public class UserRepository {
    
    private JdbcTemplate jdbc;

    public UserRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public List<User> findAll() {
        String sql = "SELECT * FROM User ORDER BY username ASC";
        return jdbc.query(sql, (rs, i) -> new User(
            rs.getString("name"),
            rs.getString("username"),
            rs.getString("password"),
            rs.getDate("created_at"),
            rs.getRole("role")
        ));
    }

}
