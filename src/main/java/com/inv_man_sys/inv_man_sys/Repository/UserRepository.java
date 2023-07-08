package com.inv_man_sys.inv_man_sys.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.inv_man_sys.inv_man_sys.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
    User findByUsername(String username);

}
