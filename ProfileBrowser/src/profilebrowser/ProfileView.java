/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package profilebrowser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Simple Database Query - Profile Browser  
 * Description: Display record from database and move next or previous record
 * License: GNU Public License
 * @author sepirothx
 */
public class ProfileView extends javax.swing.JFrame {

    /**
     * Creates new form ProfileView
     */
    private static int currentRecord = 1; //added for next record
    
    
    public ProfileView() {
        initComponents();
        setLocationRelativeTo(null);

        try {
        
          // this sql query will pull out all database records
        String query = "SELECT * FROM users"; //SQL Syntax
            
         //create object for the DatabaseConnection
        DatabaseConnection dbc = new DatabaseConnection();
        
        //Declare variables to capture database credentials
        String jdbcDriver = dbc.getJdbcDriver();
        String dbConnectionURL = dbc.getDbConnectionURL();
        String dbUsername = dbc.getDbUsername();
        String dbPassword = dbc.getDbPassword();
        
        Class.forName(jdbcDriver);
        Connection connection = DriverManager.getConnection(dbConnectionURL,
                dbUsername,dbPassword);
        
        PreparedStatement statement = connection.prepareStatement(query);
        
        ResultSet resultSet = statement.executeQuery();
        
        if(resultSet.next()) {
            
            System.out.println("Connection established!");
            String record_id = resultSet.getString("id");
            String firstName = resultSet.getString("firstname");
            String lastName = resultSet.getString("lastname");
            String school_id = resultSet.getString("school_id");
            
            
            
            System.out.println("Record ID: " + record_id);
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("School ID: " + school_id);
            
            //display the output in the UI
            recordNumJL.setText(record_id);
            firstNameTF.setText(firstName);
            lastNameTF.setText(lastName);
            school_numTF.setText(school_id);
            
            
           
            
        }
            
            connection.close();
            resultSet.close();
            statement.close();
            
            
        } catch (ClassNotFoundException | SQLException e  ) {
            
            e.printStackTrace();
            
        }
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        previousButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        recordNumJL = new javax.swing.JLabel();
        firstNameTF = new javax.swing.JTextField();
        lastNameTF = new javax.swing.JTextField();
        school_numTF = new javax.swing.JTextField();
        searchBoxTF = new javax.swing.JTextField();
        go_searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable1 = new javax.swing.JTable();

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Record ID");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("School ID");

        previousButton.setText("PREVIOUS");
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        nextButton.setText("NEXT");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        recordNumJL.setText("00000000");

        firstNameTF.setEditable(false);

        lastNameTF.setEditable(false);

        school_numTF.setEditable(false);

        searchBoxTF.setText("search . . . ");
        searchBoxTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBoxTFActionPerformed(evt);
            }
        });

        go_searchButton.setText("SEARCH");
        go_searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_searchButtonActionPerformed(evt);
            }
        });

        userTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Course", "Year Level"
            }
        ));
        jScrollPane1.setViewportView(userTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstNameTF)
                    .addComponent(lastNameTF)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(recordNumJL, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchBoxTF, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(go_searchButton))
                    .addComponent(school_numTF))
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(previousButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(recordNumJL)
                    .addComponent(searchBoxTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(go_searchButton))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(school_numTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(previousButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
             
        try {
        
          // this sql query will pull out all database records
        String query = "SELECT * FROM users LIMIT ?, 1"; //added to limit result to 1
            
         //create object for the DatabaseConnection
        DatabaseConnection dbc = new DatabaseConnection();
        
        //Declare variables to capture database credentials
        String jdbcDriver = dbc.getJdbcDriver();
        String dbConnectionURL = dbc.getDbConnectionURL();
        String dbUsername = dbc.getDbUsername();
        String dbPassword = dbc.getDbPassword();
        
        Class.forName(jdbcDriver);
        Connection connection = DriverManager.getConnection(dbConnectionURL,
                dbUsername,dbPassword);
        
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, currentRecord); //added for next record
        
        ResultSet resultSet = statement.executeQuery();
        
        if(resultSet.next()) {
            
            System.out.println("Connection established!");
            String record_id = resultSet.getString("id");
            String firstName = resultSet.getString("firstname");
            String lastName = resultSet.getString("lastname");
            String school_id = resultSet.getString("school_id");
            
            
            
            System.out.println("Record ID: " + record_id);
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("School ID: " + school_id);
            
            //display the output in the UI
            recordNumJL.setText(record_id);
            firstNameTF.setText(firstName);
            lastNameTF.setText(lastName);
            school_numTF.setText(school_id);
            
            
           currentRecord++; //added as counter
            
        } else {System.out.println("No more record found!");
        
        JOptionPane.showMessageDialog(null, "No more records found.");
        }
            
            connection.close();
            resultSet.close();
            statement.close();
            
            
            
        } catch (ClassNotFoundException | SQLException e  ) {
            
            e.printStackTrace();
            
        
        
       
        }
        

        
    }//GEN-LAST:event_nextButtonActionPerformed

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        // TODO add your handling code here:
        
        try {
        
            if(currentRecord > 0){
                
              currentRecord--; //added as counter
                // this sql query will pull out all database records
              String query = "SELECT * FROM users LIMIT ?, 1"; //added to limit result to 1

               //create object for the DatabaseConnection
              DatabaseConnection dbc = new DatabaseConnection();

              //Declare variables to capture database credentials
              String jdbcDriver = dbc.getJdbcDriver();
              String dbConnectionURL = dbc.getDbConnectionURL();
              String dbUsername = dbc.getDbUsername();
              String dbPassword = dbc.getDbPassword();

              Class.forName(jdbcDriver);
              Connection connection = DriverManager.getConnection(dbConnectionURL,
                      dbUsername,dbPassword);

              PreparedStatement statement = connection.prepareStatement(query);
              statement.setInt(1, currentRecord); //added for next record

              ResultSet resultSet = statement.executeQuery();

              if(resultSet.next()) {

                  System.out.println("Connection established!");
                  String record_id = resultSet.getString("id");
                  String firstName = resultSet.getString("firstname");
                  String lastName = resultSet.getString("lastname");
                  String school_id = resultSet.getString("school_id");



                  System.out.println("Record ID: " + record_id);
                  System.out.println("First Name: " + firstName);
                  System.out.println("Last Name: " + lastName);
                  System.out.println("School ID: " + school_id);

                  //display the output in the UI
                  recordNumJL.setText(record_id);
                  firstNameTF.setText(firstName);
                  lastNameTF.setText(lastName);
                  school_numTF.setText(school_id);


               
              } else {
                 JOptionPane.showMessageDialog(null, "Beginning of record!");
                 } 
             connection.close();
            resultSet.close();
            statement.close();
            
        } else {System.out.println("No more records found.");
        
        JOptionPane.showMessageDialog(null, "No more records found.");
        
        }
   
            
        } catch (ClassNotFoundException | SQLException e  ) {
            
            e.printStackTrace();
            
        
        
       
        }
        
        
        
        
        
        
    }//GEN-LAST:event_previousButtonActionPerformed

    private void searchBoxTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBoxTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBoxTFActionPerformed

    private void go_searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_searchButtonActionPerformed
        // TODO add your handling code here:
        
         try{
             
            // this sql query will pull out all database records
              String searchQuery = " SELECT * FROM users "
                      + "WHERE id LIKE ? OR " 
                      + "firstname LIKE ? OR " 
                      + "lastname LIKE ? OR " 
                      + "school_id LIKE ? "; 

               //create object for the DatabaseConnection
              DatabaseConnection dbc = new DatabaseConnection();

              //Declare variables to capture database credentials
              String jdbcDriver = dbc.getJdbcDriver();
              String dbConnectionURL = dbc.getDbConnectionURL();
              String dbUsername = dbc.getDbUsername();
              String dbPassword = dbc.getDbPassword();

              Class.forName(jdbcDriver);
              Connection connection = DriverManager.getConnection(dbConnectionURL,
                      dbUsername,dbPassword);

              PreparedStatement statement = connection.prepareStatement(searchQuery);
            
             // Set search parameters (you can customize this part)
             String searchKeyword = searchBoxTF.getText(); // Replace with your search keyword
             statement.setString(1, "%" + searchKeyword + "%");
             statement.setString(2, "%" + searchKeyword + "%");
             statement.setString(3, "%" + searchKeyword + "%");
             statement.setString(4, "%" + searchKeyword + "%");
           
              ResultSet resultSet = statement.executeQuery();
           // Check if a row was found
           
            if (resultSet.next()) {
                String firstName = resultSet.getString("firstname");
                String lastName = resultSet.getString("lastname");
                String record_id = resultSet.getString("id");
                String school_id = resultSet.getString("school_id");
                
 

                // Display the retrieved data
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("ID: " + record_id);
                System.out.println("School ID: " + school_id);
                
                 //display the output in the UI
                  recordNumJL.setText(record_id);
                  firstNameTF.setText(firstName);
                  lastNameTF.setText(lastName);
                  school_numTF.setText(school_id);
                  
                  
                  
                      //display related data search to the table
                    // String searchQuery2 = "SELECT * FROM users WHERE";
                    // Create a table model to store data
                    DefaultTableModel tableModel = new DefaultTableModel();
                    userTable1.setModel(tableModel);
                    

                  
                    // Create a PreparedStatement
                    PreparedStatement preparedStatement = connection.prepareStatement(searchQuery);
                    preparedStatement.setString(1, "%" + searchKeyword + "%");
                    preparedStatement.setString(2, "%" + searchKeyword + "%");
                    preparedStatement.setString(3, "%" + searchKeyword + "%");
                    preparedStatement.setString(4, "%" + searchKeyword + "%");

                    // Execute the query
                    ResultSet resultSet2 = preparedStatement.executeQuery();

                    // Get column names and add them to the table model
                    java.sql.ResultSetMetaData metaData = resultSet.getMetaData();
                    int columnCount = metaData.getColumnCount();
                    for (int i = 1; i <= columnCount; i++) {
                        tableModel.addColumn(metaData.getColumnName(i));
                    }

                    // Add rows to the table model
                    while (resultSet2.next()) {
                        Object[] rowData = new Object[columnCount];
                        for (int i = 1; i <= columnCount; i++) {
                            rowData[i - 1] = resultSet2.getObject(i);
                        }
                        tableModel.addRow(rowData);
                    }
                  
                  
                
                
                
            } else {
                System.out.println("No matching records found.");
                JOptionPane.showMessageDialog(null, "No record found!");
            }
              
               
            connection.close();
            resultSet.close();
            statement.close();
            
        }  catch (ClassNotFoundException | SQLException e  ) {
            
            e.printStackTrace();
            
        
        
       
        }
             
    }//GEN-LAST:event_go_searchButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField firstNameTF;
    private javax.swing.JButton go_searchButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameTF;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton previousButton;
    private javax.swing.JLabel recordNumJL;
    private javax.swing.JTextField school_numTF;
    private javax.swing.JTextField searchBoxTF;
    private javax.swing.JTable userTable1;
    // End of variables declaration//GEN-END:variables
}
