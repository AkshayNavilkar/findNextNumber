package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepository extends JpaRepository<String, Integer> {
}
