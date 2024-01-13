package org.gfg.JBDL64DBConnectivity.services;

import org.gfg.JBDL64DBConnectivity.Person;
import org.gfg.JBDL64DBConnectivity.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;
    public List<Person> getAllPerson() throws SQLException {
        return personRepository.getAllPerson();
    }

    public boolean insertPerson(Person person) throws SQLException {
        return personRepository.insertPerson(person);
    }

    // business logic come under service
    // interaction between third parties
    // interaction with db
}
