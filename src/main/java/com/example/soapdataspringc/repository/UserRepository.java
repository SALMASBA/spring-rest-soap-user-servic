package com.example.soapdataspringc.repository;


import com.example.soapdataspringc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
// Expose automatiquement les endpoints REST /users
@RepositoryRestResource(path = "users")
public interface UserRepository extends JpaRepository<User, Long> {
}