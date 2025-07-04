package com.library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    private Long id;
    private String title;

    public Book() {}

    public Book(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }

    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
}
