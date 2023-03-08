package com.Springboot.taskproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springboot.taskproject.bean.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
