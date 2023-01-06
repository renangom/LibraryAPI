package com.love2code.springbootlibrary.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.love2code.springbootlibrary.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	
}
