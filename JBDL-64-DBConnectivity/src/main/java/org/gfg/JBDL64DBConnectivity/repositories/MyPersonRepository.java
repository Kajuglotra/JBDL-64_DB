package org.gfg.JBDL64DBConnectivity.repositories;

import org.gfg.JBDL64DBConnectivity.model.MyPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyPersonRepository extends JpaRepository<MyPerson,Integer> {
}
