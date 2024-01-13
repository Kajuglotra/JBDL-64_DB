package org.gfg.JBDL64DBConnectivity.repositories;

import org.gfg.JBDL64DBConnectivity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepository {

//    @Autowired
    private Connection connection;

    public PersonRepository(Connection connection) throws SQLException {
        this.connection = connection;
        createTable();
    }

    // connection with my db
    // queries to have data from db
    public List<Person> getAllPerson() throws SQLException {
        List<Person> list = new ArrayList<>();

        try {
            ResultSet set = connection.createStatement().executeQuery("select * from person");
            while(set.next()){
                Person p = new Person(set.getString("name"), set.getInt("id"));
                list.add(p);
            }
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void createTable() throws SQLException {
        connection.createStatement().execute("create table if not exists person (name varchar(25) , id int);");
    }

    public boolean insertPerson(Person person) throws SQLException {
       return  connection.createStatement().execute("insert into person (name, id) Values ('"+ person.getName() + "' , '"+person.getId()+"' )");
    }
}
