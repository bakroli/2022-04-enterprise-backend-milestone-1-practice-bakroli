package com.codecool.library.repository;

import com.codecool.library.model.Book;
import com.codecool.library.model.Writer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BookRepository {

    private List<Book> books = new ArrayList<>();
    private WriterRepository writerRepository;

    @Autowired
    public BookRepository(List<Book> books, WriterRepository writerRepository) {
        this.books = books;
        this.writerRepository = writerRepository;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBook() {
        return books;
    }


    public long getGenre(String genre) {
        return books.stream().filter(g->g.getGenre().equals(genre)).count();
    }

    public List<String> getAllBorrowed() {
        return books.stream()
                .filter(b->b.getNumberBorrowed() == b.getNumberOwnedByLibrary())
                .map(s->s.getTitle())
                .collect(Collectors.toList());
    }

    public List<Book> getByWriterByPlace(String country) {
        List<Book> byBooks = new ArrayList<>();
        List<Writer> writers = writerRepository.getAll();;
        for (Book book : books) {
            String writerBook = book.getWriterName();
                for (Writer writer : writers) {
                    if (writerBook.equals(writer.getName())&& writer.getBirthPlace().equals(country)) {
                        byBooks.add(book);
                    }
                }
        }
        return byBooks;
    }



}
