package org.gfg.JBDL64DBConnectivity.controllers;

import org.gfg.JBDL64DBConnectivity.Person;
import org.gfg.JBDL64DBConnectivity.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController // combination of controller+ responsebody
public class PersonController {

    @Autowired
    private PersonService personService;
    @GetMapping("/getPersons")
    public List<Person> getAllPerson() throws SQLException {
        // controller responsibilities
        // 1) validation
        // 2) return the perfect data
        return personService.getAllPerson();

    }

    @PostMapping("/addPerson")
    public ResponseEntity<Boolean> insertData(@RequestBody Person person) throws Exception {
        if(person.getName()== null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//            throw new Exception("name should not be null");

        }
        return new ResponseEntity<>(personService.insertPerson(person), HttpStatus.OK);
    }
    // api here -> update the data present in database


}
