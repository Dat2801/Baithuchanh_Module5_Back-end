package com.example.baithuchanhmd5.service;

import com.example.baithuchanhmd5.model.Book;
import com.example.baithuchanhmd5.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService {

    @Autowired
    public IBookRepo bookRepo;

    @Override
    public Iterable<Book> findAll() {
        return bookRepo.findAll();
    }

    @Override
    public Book findById(Long id) {
        return bookRepo.findById(id).get();
    }

    @Override
    public Book save(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public void deleteById(Long id) {
        bookRepo.deleteById(id);
    }
}
