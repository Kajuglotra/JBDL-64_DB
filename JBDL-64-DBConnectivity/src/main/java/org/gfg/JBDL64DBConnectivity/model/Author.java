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
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "sequence-generator")
    @GenericGenerator(
            name ="sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "user_sequence"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private Integer id;


//    @Id
//    @GeneratedValue(strategy=GenerationType.TABLE, generator = "table-generator")
//    @TableGenerator(
//            name ="table-generator",
//            allocationSize = 1
//    )
//    private Integer id;

    private String authorName;
}

// uuid generates a unique string --> db/ hiberante --> hibernate is doing this for u

// UUIDGenerator --> hibernate version 5