package org.gfg.JBDL64DBConnectivity.services;

import org.gfg.JBDL64DBConnectivity.Person;
import org.gfg.JBDL64DBConnectivity.model.MyPerson;
import org.gfg.JBDL64DBConnectivity.repositories.MyPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import org.gfg.JBDL64DBConnectivity.repositories.IPerson;
@Service
public class PersonService {

    @Autowired
    @Qualifier("personRepository")
    private IPerson iPerson;

    @Autowired
    private MyPersonRepository myPersonRepository;

    public List<Person> getAllPerson() throws SQLException {
        return iPerson.getAllPerson();
    }
    public boolean insertPerson(Person person) throws SQLException {
        MyPerson myPerson = new MyPerson(person.getId(), person.getName());
        MyPerson p =  myPersonRepository.save(myPerson);
        return true;
    }

    public int updatePerson(String name, Integer id) {
        try {
            return iPerson.updatePerson(name, id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // business logic come under service
    // interaction between third parties
    // interaction with db
}
