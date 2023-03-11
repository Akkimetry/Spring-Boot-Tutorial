package com.softechexperts.SpringBootTutorial.repository;

import com.softechexperts.SpringBootTutorial.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
