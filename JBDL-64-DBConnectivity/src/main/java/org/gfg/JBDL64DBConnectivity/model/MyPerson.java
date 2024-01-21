package org.gfg.JBDL64DBConnectivity.model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Cacheable
public class MyPerson {

    public MyPerson(String firstName) {
        this.firstName = firstName;
    }
//    @Id
//    @GeneratedValue(strategy=GenerationType.TABLE, generator = "table-generator")
//    @TableGenerator(
//            name ="table-generator",
//            allocationSize = 1
//    )
//    private Integer id;


//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "sequence-generator")
//    @GenericGenerator(
//            name ="sequence-generator",
//            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
//            parameters = {
//                    @org.hibernate.annotations.Parameter(name = "sequence_name", value = "user_sequence"),
//                    @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
//                    @Parameter(name = "increment_size", value = "1")
//            }
//    )
//    private Integer id;


    @Id
    @GeneratedValue
    private Integer id;


    @Column(name ="fName",  length= 30)
    private String firstName;


}
// create table my_person (id integer not null, f_name varchar(30), primary key (id)) engine=InnoDB
// create table my_person (id integer not null auto_increment, f_name varchar(30), primary key (id)) engine=InnoDB
//create table my_person (id integer not null, f_name varchar(30), primary key (id)) engine=InnoDB


// change the value in the table generation type
// 50 to 1