package com.example.demo.Service;
import com.example.demo.DTO.LibraryDTO;
import com.example.demo.DTO.*;

import com.example.demo.Library;
import com.example.demo.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class LibraryService {

    @Autowired
    private LibraryRepository libraryRepository;

    public List<LibraryDTO> findAll(){
        return libraryRepository.findAll()
                .stream()
                .map(LibraryDTO::new)
                .collect(toList());
    }

    public LibraryDTO create(AddBook addBook){
        return new LibraryDTO(libraryRepository.save(new Library(addBook)));
    }

}
