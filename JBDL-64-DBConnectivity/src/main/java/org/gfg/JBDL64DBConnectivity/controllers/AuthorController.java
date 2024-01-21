package org.gfg.JBDL64DBConnectivity.controllers;

import org.gfg.JBDL64DBConnectivity.Person;
import org.gfg.JBDL64DBConnectivity.model.Author;
import org.gfg.JBDL64DBConnectivity.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/addAuthor")
    public boolean insertData(@RequestBody Author author) throws Exception {
        return authorService.addAuthor(author);
    }
}
