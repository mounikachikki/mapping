package com.example.mapping.Mapping.repository;

import com.example.mapping.Mapping.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
