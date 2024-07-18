package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Task1 {
    public static void main(String[] args) {
        DatabaseConnection connManager = new DatabaseConnection();
        String sql = "select name, description from categories";
        try {
            Connection connect = connManager.connect();
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()){
                String names = rs.getString("name");
                String discription = rs.getString("description");
                System.out.println(names+" : "+discription);
            }
            connect.close();
        } catch (
                SQLException e) {
            System.err.println("Error when try to connect to database: "+e.getMessage());
        }
    }
}
