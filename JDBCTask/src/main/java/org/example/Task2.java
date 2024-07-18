package org.example;

import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    private static DatabaseConnection connManager = new DatabaseConnection();
    public static void main(String[] args) {
        try{
            Connection connect = connManager.connect();
            Statement stmt = connect.createStatement();

            String createTable = "CREATE TABLE Employee (" +
                    "id INT NOT NULL AUTO_INCREMENT, " +
                    "F_name VARCHAR(50) NOT NULL, " +
                    "L_name VARCHAR(50) NOT NULL, " +
                    "sex VARCHAR(10) NOT NULL, " +
                    "age INT NOT NULL, " +
                    "address VARCHAR(100), " +
                    "phone_number VARCHAR(50), " +
                    "Vacation_Balance INT DEFAULT 30, " +
                    "PRIMARY KEY (id))";
            stmt.executeUpdate(createTable);
            System.out.println("Table created Successfully.");

            insertData();
            modifyEmployee();

            connect.close();
        } catch (SQLException ex){
            System.err.println("Error: "+ex.getMessage());
        }
    }

    public static void insertData(){
        String insertSQL = "INSERT INTO Employee (F_name, L_name, sex, age, address, phone_number) VALUES (?, ?, ?, ?, ?, ?)";

        List<String[]> employees = new ArrayList<>();
        employees.add(new String[]{"Wael", "Magdy", "Male", "49", "Tanta", "9875256594"});
        employees.add(new String[]{"Emad", "Wael", "Male", "50", "Cairo", "97845622253"});
        employees.add(new String[]{"Maryam", "Mohsen", "Female", "60", "Zifta", "54148781100"});
        employees.add(new String[]{"Ahmed", "Awad", "Male", "35", "Cairo", "4878958522"});
        employees.add(new String[]{"Aml", "Farouk", "Female", "55", "Tanta", "54863795652"});

        try{
            Connection connect = connManager.connect();
            PreparedStatement preparedStatement = connect.prepareStatement(insertSQL);

            for(String[] employee: employees){
                preparedStatement.setString(1, employee[0]);
                preparedStatement.setString(2, employee[1]);
                preparedStatement.setString(3, employee[2]);
                preparedStatement.setInt(4, Integer.parseInt(employee[3]));
                preparedStatement.setString(5, employee[4]);
                preparedStatement.setString(6, employee[5]);
                preparedStatement.executeUpdate();
            }

            System.out.println("Data inserted successfully!");

            connect.close();

        } catch (SQLException ex){
            System.err.println("Error: "+ex.getMessage());
        }
    }

    public static void modifyEmployee(){
        String updateEmployee = "UPDATE Employee SET Vacation_Balance = 45," +
                " F_name = CASE " +
                " WHEN sex = 'Male' THEN CONCAT ('Mr. ', F_name)" +
                " WHEN sex = 'Female' THEN CONCAT ('Mrs. ', F_name)" +
                " END" +
                " WHERE age > 45";

        try{
            Connection connection = connManager.connect();
            PreparedStatement preparedStmt = connection.prepareStatement(updateEmployee);

            preparedStmt.addBatch();
            preparedStmt.executeBatch();
            System.out.println("Vacation Balance and First Name updated successfully");

            connection.close();
        } catch (SQLException ex){
            System.err.println("Error : "+ex.getMessage());
        }
    }
}
