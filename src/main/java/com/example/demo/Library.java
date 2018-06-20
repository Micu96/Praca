package com.example.demo;

import com.example.demo.DTO.AddBook;

import javax.persistence.*;

@Entity
//@Table(name = "LIBRARY")
public class Library {

    @Id
    @GeneratedValue
    //@Column(name = "id")
    private long id;
    //@Column(name = "name")
    private String name;
    //@Column(name = "author")
    private String author;

    public Library() {
    }

    public Library(AddBook addBook) {
        this.name = addBook.getName();
        this.author = addBook.getAuthor();

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}