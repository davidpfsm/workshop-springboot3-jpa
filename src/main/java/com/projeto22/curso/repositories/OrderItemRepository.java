package com.projeto22.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto22.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
