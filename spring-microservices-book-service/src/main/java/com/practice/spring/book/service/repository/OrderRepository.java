package com.practice.spring.book.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.spring.book.service.model.BookOrder;

@Repository
public interface OrderRepository extends JpaRepository<BookOrder, Long> {

}
