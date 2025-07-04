package com.library;

import com.library.model.Book;
import com.library.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final BookRepository bookRepo;

    public DataLoader(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public void run(String... args) {
        bookRepo.save(new Book(1L, "Spring Boot for Starters"));
        bookRepo.save(new Book(2L, "Effective Java"));

        bookRepo.findAll().forEach(book ->
            System.out.println(book.getId() + " - " + book.getTitle())
        );
    }
}
