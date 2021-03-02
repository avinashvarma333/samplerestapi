package com.njc.sample.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.njc.sample.restservice.entity.User;

@RestResource(exported = false)
public interface UserRepository extends JpaRepository<User, String> {

}
