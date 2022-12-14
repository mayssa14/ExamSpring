package com.example.mejri_mayssa.repository;

import com.example.mejri_mayssa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User,Integer> {
}
