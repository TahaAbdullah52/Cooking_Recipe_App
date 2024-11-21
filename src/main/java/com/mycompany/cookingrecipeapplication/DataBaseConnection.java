/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cookingrecipeapplication;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Properties;

public class DataBaseConnection {
    
    public static Connection GetConnection() {
        
        Connection connection = null;
        try {
           Properties props = new Properties();
            InputStream input = DataBaseConnection.class.getClassLoader().getResourceAsStream("dbconfig.properties");
            
            if (input == null) {
                System.out.println("Sorry, unable to find dbconfig.properties");
                return null; // Exit the method if the file is not found
            }
            
            // Load properties from the file
            props.load(input);

            // Get database properties
            String url = props.getProperty("db.url");
            String user = props.getProperty("db.user");
            String password = props.getProperty("db.password");

            // Connect to the database
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL database!");
        } catch (IOException | SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
        return connection;
    }
    
     public static void main(String[] args) {
        Connection conn = GetConnection();

        // Test the connection by querying the database
        if (conn != null) {
            try {
                Statement  stmt = conn.createStatement();
                ResultSet    rs = stmt.executeQuery("SELECT * FROM ingredients");

                while (rs.next()) {
                    System.out.println("Data from database: " + rs.getString("ingredient_name"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
     
     
}

