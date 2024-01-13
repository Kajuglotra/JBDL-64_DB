package org.gfg.JBDL64DBConnectivity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Configuration
public class DBBean {

    @Bean
    public Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbdl_64", "root", "rootroot");
        return connection;
    }
}
