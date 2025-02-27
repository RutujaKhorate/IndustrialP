package com.expense.mvc.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="user")
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)  // `username` should be unique for authentication
    private String username;

    @Column(nullable = false)  // Password field to store the user’s password
    private String password;

    @Column(nullable = false)  // The `enabled` field to track if the account is active
    private Boolean enabled;

    // Other fields you already have, like `name`, `email`, etc.
    private String name;

    private String email;

    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @CreationTimestamp
    private Date createdAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @UpdateTimestamp
    private Date updatedAt;
	
// 	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "users")
// //	
// 	private Set<Category> categories;
	
	

}
