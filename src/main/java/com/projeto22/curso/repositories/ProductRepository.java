package com.projeto22.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto22.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
