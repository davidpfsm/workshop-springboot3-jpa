package com.projeto22.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto22.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
