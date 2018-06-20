package com.example.demo.Rest;
import com.example.demo.DTO.AddBook;
import com.example.demo.DTO.LibraryDTO;
import com.example.demo.Service.*;
import com.example.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/Library")
public class LibraryRest {

    @Autowired
    private LibraryService libraryService;

    @RequestMapping(path = "all", method = RequestMethod.GET)
    public List<LibraryDTO> findAll() {
        return libraryService.findAll();

    }
    @RequestMapping(path = "add", method = RequestMethod.PUT)
    public LibraryDTO create(@RequestBody AddBook addBook){
        return libraryService.create(addBook);
    }

}
