package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.validation.constraints.AssertFalse;
import java.util.LinkedList;
import java.util.List;

@Component
class RunAtStart {

    private final LibraryRepository libraryRepository;

    @Autowired
    public RunAtStart(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    @PostConstruct
    public void run(){



        Library library = new Library();
        library.setName("Oracle");
        library.setAuthor("Kevin Loney");
        Library library1 = new Library();
        library1.setName("Spring w akcji");
        library1.setAuthor("Craig Walls");


        libraryRepository.save(library);
        libraryRepository.save(library1);
    }
}
