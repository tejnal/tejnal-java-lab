package com.tejnal.java.tejnaljavalab.topics.singletonpattern;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-06
 */
public class DbSingletonDemoTest {

    @Test
    public void checkTheSingletonPattern() throws SQLException {
        DbSingleton instance = DbSingleton.getInstance();

        long timeBefore = 0;
        long timeAfter = 0;

        System.out.println(instance);

        timeBefore = System.currentTimeMillis();
        Connection conn = instance.getConn();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);

        Statement statement;

        try {

            statement = conn.createStatement();
            int count = statement
                    .executeUpdate("CREATE TABLE Address(ID INT, StreetName VARCHAR(20),"
                    +" City VARCHAR(20))");
            System.out.println(count);
            System.out.println("Table created");
            statement.close();

        }catch(SQLException e) {
            e.printStackTrace();

        }

        timeBefore = System.currentTimeMillis();
        conn = instance.getConn();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);

        System.out.println(conn);

    }
}
