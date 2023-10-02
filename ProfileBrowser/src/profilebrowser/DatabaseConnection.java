/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package profilebrowser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Simple Database Query - Profile Browser
 * Description: Display record from database and move next or previous record
 * License: GNU Public License
 * @author sepirothx
 */
public class DatabaseConnection {

       private String jdbcDriver = "com.mysql.cj.jdbc.Driver";
       private String dbConnectionURL = "jdbc:mysql://localhost:3306/javaproject";
       private String dbUsername = "admin";
       private String dbPassword = "p@ssword!";
        
    
    public String getJdbcDriver() {
        return jdbcDriver;
    }

    public String getDbConnectionURL() {
        return dbConnectionURL;
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public String getDbPassword() {
        return dbPassword;
    }
   
    
    
    
    
}
