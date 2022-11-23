package com.example.springjpareview.repository;

import com.example.springjpareview.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}