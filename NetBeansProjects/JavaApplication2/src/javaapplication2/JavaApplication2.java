/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author it-server
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    //global database connection variables
//    public static String jdbcDriver  = "com.mysql.cj.jdbc.Driver"; //define jdbc driver
//    public static String dbConnectionURL = "jdbc:mysql://localhost:3307/myjavadb"; //define connection url
//    public static String dbUsername = "root"; //database username
//    public static String dbPassword = "P@ssword!"; //database password
//    
    
    
    public static void main(String[] args) {
            // TODO code application logic here


            Scanner console = new Scanner(System.in);        
            System.out.println("Username: ");
            String inputUsername = console.next();

            System.out.println("Password: ");
            String inputPassword = console.next();

            Connection connection = null;
            try {

                // Register the JDBC driver, retrieve from DatabaseConnectionData.java

                Class.forName("com.mysql.cj.jdbc.Driver");


                // Establish the connection
                connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/myjavadb2", "admin", "password");

                // Perform database operations...

                 try {
                String query = "SELECT * FROM users WHERE username = ? AND password = ?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, inputUsername);
                statement.setString(2, inputPassword);

                ResultSet resultSet = statement.executeQuery();


                 if (resultSet.next()) {
                  System.out.println("Login successful!1$%^");
                  System.out.println("Logged in user: " + resultSet.getString("username"));
                  System.out.println("First Name: "+ resultSet.getString("First Name"));
                  System.out.println("Middle Name: "+ resultSet.getString("Middle Name"));
                  System.out.println("Last Name: "+ resultSet.getString("Last Name"));


                } else {
                    System.out.println("Invalid username or password.");
                   
                }

                    resultSet.close();
                    statement.close();

                } catch (SQLException e) {
                    e.printStackTrace();


                } 



        }   catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();


            }
        
    
}
    
}
