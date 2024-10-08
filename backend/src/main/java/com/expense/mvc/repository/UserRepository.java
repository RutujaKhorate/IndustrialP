package com.expense.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.expense.mvc.model.Category;
import com.expense.mvc.model.User;
import java.util.List;
import java.util.Optional;


public interface UserRepository  extends JpaRepository<User, Long>{
    // @Query("SELECT u FROM User u WHERE u.email = :email")
    // User findByEmail(@Param("email") String email);
	Optional<User> findByUsername(String username);
}
