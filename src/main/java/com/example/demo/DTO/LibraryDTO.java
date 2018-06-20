package com.example.demo.DTO;
import com.example.demo.Library;

public class LibraryDTO {

    private long ID;
    private String name;
    private String author;

    public LibraryDTO(Library library) {

        this.ID = library.getId();
        this.name = library.getName();
        this.author = library.getAuthor();
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
