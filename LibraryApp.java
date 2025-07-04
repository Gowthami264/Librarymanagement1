package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class BookRepository {
    public void saveBook(String title) {
        System.out.println("Book saved to database: " + title);
    }
}

class BookService {
    private BookRepository bookRepository;

        public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title) {
        System.out.println("Adding book: " + title);
        bookRepository.saveBook(title);
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.addBook("Spring in Action");
        ((ClassPathXmlApplicationContext) context).close();
    }
}
