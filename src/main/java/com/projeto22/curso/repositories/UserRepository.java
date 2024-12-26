package com.projeto22.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto22.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
