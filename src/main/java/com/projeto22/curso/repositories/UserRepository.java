package com.projeto22.curso.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto22.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	void saveAll(List<User> asList);
	

}
