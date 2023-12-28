package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.TodoItem;

public interface TodoRepository extends JpaRepository<TodoItem, Long> {
}
