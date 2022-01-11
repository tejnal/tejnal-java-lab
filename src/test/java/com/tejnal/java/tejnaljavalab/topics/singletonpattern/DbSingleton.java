package com.tejnal.java.tejnaljavalab.topics.singletonpattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-06
 */
public class DbSingleton {

    //this called eagerly loading and if create instance on demand is called lazy loading
    //private static DbSingleton instance = new DbSingleton();

    private static volatile DbSingleton instance = null;
    private static volatile Connection  conn = null;

    //how to create a thread safe
    public DbSingleton() {
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(conn != null ){
            throw new RuntimeException("Use getConnection() method to create");
        }

        if(instance !=null ) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }
        ///Lazy instance loading -- this will improve the performance
    static DbSingleton getInstance(){
        if(instance == null ){
            synchronized (DbSingleton.class) {
                if(instance == null ){
                    instance = new DbSingleton();
                }
            }

        }
        return instance;
    }

    public Connection getConn() throws SQLException {
        if(conn == null) {
            synchronized (DbSingleton.class) {
                if(conn == null ) {
                    var dbUrl = "jdbc:derby:memory:corejava/webdb;create=true";
                    conn= DriverManager.getConnection(dbUrl);
                }
            }
        }
        return conn;
    }
}
