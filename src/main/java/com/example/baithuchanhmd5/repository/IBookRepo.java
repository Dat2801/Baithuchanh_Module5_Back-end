package com.example.baithuchanhmd5.repository;

import com.example.baithuchanhmd5.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface IBookRepo extends CrudRepository<Book, Long> {
}
