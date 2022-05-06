package com.codecool.library.servive;

import com.codecool.library.model.Book;
import com.codecool.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book) {
        bookRepository.addBook(book);
    }

    public List<Book> getBooks() {
        return bookRepository.getBook();
    }

    public long getGenre(String genre) {
        return bookRepository.getGenre(genre);
    }

    public List<String> getAllBorrowed() {
        return bookRepository.getAllBorrowed();
    }

    public List<Book> getByWriterByPlace(String country) {
        return bookRepository.getByWriterByPlace(country);
    }
}
