package com.example.baithuchanhmd5.controller;

import com.example.baithuchanhmd5.model.Book;
import com.example.baithuchanhmd5.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    public IBookService bookService;

    @GetMapping
    public ResponseEntity<Iterable<Book>> showAll() {
        return new ResponseEntity<>(bookService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> findById(@PathVariable Long id) {
        return new ResponseEntity<>(bookService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        return new ResponseEntity<>(bookService.save(book), HttpStatus.CREATED);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Book> editBook(@RequestBody Book book, @PathVariable Long id) {
        book.setId(id);
        return new ResponseEntity<>(bookService.save(book), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Book> deleteBoook(@PathVariable Long id) {
        bookService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
