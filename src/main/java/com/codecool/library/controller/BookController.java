package com.codecool.library.controller;

import com.codecool.library.model.Book;
import com.codecool.library.servive.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @GetMapping("/all")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @GetMapping()
    public long getGenre(@RequestParam(name = "genre" ) String genre ) {
        return bookService.getGenre(genre);
    }

    @GetMapping("/allBorrowed")
    public List<String> getAllBorrowed() {
        return bookService.getAllBorrowed();
    }

    @GetMapping("/byWriter")
    public List<Book> getByWriterByPlace(@RequestParam(name = "writersBirthPlace" ) String country) {
        return bookService.getByWriterByPlace(country);
    }
}
