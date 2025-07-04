package com.library;

import com.library.model.Book;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApp implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepo;

    public static void main(String[] args) {
        SpringApplication.run(LibraryApp.class, args);
    }

    @Override
    public void run(String... args) {
        bookRepo.save(new Book(1L, "Spring in Action"));
        bookRepo.save(new Book(2L, "Effective Java"));

        bookRepo.findAll().forEach(book ->
            System.out.println(book.getId() + " - " + book.getTitle())
        );
    }
}
