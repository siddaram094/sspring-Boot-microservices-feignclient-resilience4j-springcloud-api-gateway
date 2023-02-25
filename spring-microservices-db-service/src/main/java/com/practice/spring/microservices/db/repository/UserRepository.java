package com.practice.spring.microservices.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.spring.microservices.db.model.UserData;


@Repository
public interface UserRepository extends JpaRepository<UserData, Long> {

}
