package org.example;

import java.sql.*;
import java.util.Collections;

public class DatabaseConnection {
    private final String url = "jdbc:mysql://localhost:3306/store_java";
    private final String name = "root";
    private final String password = "";

    public Connection connect() throws  SQLException{
        return DriverManager.getConnection(url, name, password);
    }
}
