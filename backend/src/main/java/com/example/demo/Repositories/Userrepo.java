package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.User;

public interface Userrepo extends JpaRepository<User, Integer> {

}