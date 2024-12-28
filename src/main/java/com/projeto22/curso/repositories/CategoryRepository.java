package com.projeto22.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto22.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
