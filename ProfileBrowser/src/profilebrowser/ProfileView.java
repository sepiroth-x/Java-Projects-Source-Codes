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
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.IOException;
import java.net.URL;
import java.awt.*;


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
   // private  String profileImagePath = "/";
    private  String record_id;
    private  String firstName;
    private  String lastName;
    private  String school_id;
    private  String section;
    //private  String status; 

    public String getRecord_id() {
        return record_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSchool_id() {
        return school_id;
    }

    public String getSection() {
        return section;
    }
    
    
    

    public ProfileView() {
        initComponents();
        setLocationRelativeTo(null);
        toolsjLabel.setText("<html><u><font color='blue'>TOOLS</font></u></html>");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

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
            this.record_id = resultSet.getString("id");
            this.firstName = resultSet.getString("firstname");
            this.lastName = resultSet.getString("lastname");
            this.school_id = resultSet.getString("school_id");
            
            System.out.println("Record ID: " + this.record_id);
            System.out.println("First Name: " + this.firstName);
            System.out.println("Last Name: " + this.lastName);
            System.out.println("School ID: " + this.school_id);
            
            //display the output in the UI
            recordNumJL.setText(this.record_id);
            firstNameTF.setText(this.firstName);
            lastNameTF.setText(this.lastName);
            school_numTF.setText(this.school_id);
            
            //display image of user
            
//            String imageFilename = resultSet.getString("img_filename");
//            URL imageUrl = getClass().getResource("/img/users/"+imageFilename); // replace with your image file name
//            //JLabel imageLabel = new JLabel(new ImageIcon(imageUrl));
//             jLabelForImage = new JLabel(new ImageIcon(imageUrl));
//            
//            //JFrame frame = new JFrame();
//            
//            jPanelForImage.add(jLabelForImage);
//            jPanelForImage. setPreferredSize(new Dimension(42, 18));
//            //jPanelForImage.pack();
//            jPanelForImage.setVisible(true);
            
       
           String imageFilename = resultSet.getString("img_filename");
           URL imageUrl = getClass().getResource("/img/users/" + imageFilename);
           
         if (imageUrl != null) {
                try {
                    // Read the image from URL
                    BufferedImage originalImage = ImageIO.read(imageUrl);

                    // Scale the image to fit the dimensions of the label
                    ImageIcon imageIcon = new ImageIcon(getScaledImage(originalImage, jLabelForImage.getWidth(), jLabelForImage.getHeight()));

                    // Set the scaled image to the label
                    jLabelForImage.setIcon(imageIcon);

                    // Make the JLabel visible
                    jLabelForImage.setVisible(true);

                    // You might need to revalidate and repaint the label if it's already visible
                    jLabelForImage.revalidate();
                    jLabelForImage.repaint();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        } else {
            // Handle the case where the image resource is not found
            System.err.println("Image resource not found: " + imageFilename);
        }
         
         
     

            
     
        }
            
            connection.close();
            resultSet.close();
            statement.close();
            
            
        } catch (ClassNotFoundException | SQLException e  ) {
            
            e.printStackTrace();
            
        }
        
        
        
        
    }
    // Image Helper method to scale the image - custom written by sepiroth x
    private Image getScaledImage(Image srcImg, int width, int height) {
        BufferedImage resizedImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        // Scale the image
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, width, height, null);
        g2.dispose();

        return resizedImg;
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
        fullDetailsJLabel = new javax.swing.JLabel();
        toolsjLabel = new javax.swing.JLabel();
        jLabelForImage = new javax.swing.JLabel();

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
        userTable1.setEnabled(false);
        jScrollPane1.setViewportView(userTable1);

        fullDetailsJLabel.setText("View Full Details");
        fullDetailsJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fullDetailsJLabelMouseClicked(evt);
            }
        });

        toolsjLabel.setText("TOOLS");
        toolsjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolsjLabelMouseClicked(evt);
            }
        });

        jLabelForImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(previousButton)
                        .addGap(18, 18, 18)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(fullDetailsJLabel)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(toolsjLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(school_numTF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameTF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameTF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(recordNumJL, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchBoxTF, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(go_searchButton)
                                .addGap(0, 6, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelForImage, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(toolsjLabel)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(recordNumJL)
                            .addComponent(searchBoxTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(go_searchButton)
                            .addComponent(jLabel1))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(school_numTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(previousButton)
                            .addComponent(nextButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabelForImage, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fullDetailsJLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        searchBoxTF.setText(null);
             
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
            this.record_id = resultSet.getString("id");
            this.firstName = resultSet.getString("firstname");
            this.lastName = resultSet.getString("lastname");
            this.school_id = resultSet.getString("school_id");
            
            
            
            System.out.println("Record ID: " + this.record_id);
            System.out.println("First Name: " + this.firstName);
            System.out.println("Last Name: " + this.lastName);
            System.out.println("School ID: " + this.school_id);
            
            //display the output in the UI
            recordNumJL.setText(this.record_id);
            firstNameTF.setText(this.firstName);
            lastNameTF.setText(this.lastName);
            school_numTF.setText(this.school_id);
            
            
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
        
        searchBoxTF.setText(null);
        
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
                  this.record_id = resultSet.getString("id");
                  this.firstName = resultSet.getString("firstname");
                  this.lastName = resultSet.getString("lastname");
                  this.school_id = resultSet.getString("school_id");



                  System.out.println("Record ID: " + this.record_id);
                  System.out.println("First Name: " + this.firstName);
                  System.out.println("Last Name: " + this.lastName);
                  System.out.println("School ID: " + this.school_id);

                  //display the output in the UI
                  recordNumJL.setText(this.record_id);
                  firstNameTF.setText(this.firstName);
                  lastNameTF.setText(this.lastName);
                  school_numTF.setText(this.school_id);


               
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
                      + "section LIKE ? OR "
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
             statement.setString(5, "%" + searchKeyword + "%");
           
              ResultSet resultSet = statement.executeQuery();
           // Check if a row was found
           
            if (resultSet.next()) {
                 this.firstName = resultSet.getString("firstname");
                 this.lastName = resultSet.getString("lastname");
                 this.record_id = resultSet.getString("id");
                 this.school_id = resultSet.getString("school_id");
                
 

                // Display the retrieved data
                System.out.println("First Name: " + this.firstName);
                System.out.println("Last Name: " + this.lastName);
                System.out.println("ID: " + this.record_id);
                System.out.println("School ID: " + this.school_id);
                
                 //display the output in the UI
                  recordNumJL.setText(this.record_id);
                  firstNameTF.setText(this.firstName);
                  lastNameTF.setText(this.lastName);
                  school_numTF.setText(this.school_id);
                  
                  
                  
                      //display related data search to the table
                    // String searchQuery2 = "SELECT * FROM users WHERE";
                    // Create a table model to store data
                    DefaultTableModel tableModel = new DefaultTableModel();
                    userTable1.setModel(tableModel);
                    
                    /*this part is the application of centering the data in the cell, coming from the custom class inside
                    *the tablerelated package, inside CenteredTableCellRenderer class
                    **/
                    tablerelated.CenteredTableCellRenderer renderer = new tablerelated.CenteredTableCellRenderer();
                    userTable1.setDefaultRenderer(Object.class, renderer);
                    

                  
                    // Create a PreparedStatement
                    PreparedStatement preparedStatement = connection.prepareStatement(searchQuery);
                    preparedStatement.setString(1, "%" + searchKeyword + "%");
                    preparedStatement.setString(2, "%" + searchKeyword + "%");
                    preparedStatement.setString(3, "%" + searchKeyword + "%");
                    preparedStatement.setString(4, "%" + searchKeyword + "%");
                    preparedStatement.setString(5, "%" + searchKeyword + "%");

                    // Execute the query
                    ResultSet resultSet2 = preparedStatement.executeQuery();

                    // Get column names and add them to the table model
                    java.sql.ResultSetMetaData metaData = resultSet2.getMetaData();
                    
                    int columnCount = metaData.getColumnCount();
                    for (int i = 1; i <= columnCount; i++) {
                        
                            //tableModel.addColumn(metaData.getColumnName(i));
              
                            String columnName = metaData.getColumnName(i);
                            if (columnName.equals("id") || columnName.equals("firstname") || 
                                 columnName.equals("lastname") || columnName.equals("school_id") || 
                                 columnName.equals("section")) {
                                 
                                     tableModel.addColumn(columnName);

                            }
                        
                    }

                    // Add rows to the table model
                    while (resultSet2.next()) {
                        Object[] rowData = new Object[columnCount];
                        for (int i = 1; i <= columnCount; i++) {
                            //rowData[i - 1] = resultSet2.getObject(i);
                            
                            rowData[0] = resultSet2.getObject("id");
                            rowData[1] = resultSet2.getObject("firstname");
                            rowData[2] = resultSet2.getObject("lastname");
                            rowData[3] = resultSet2.getObject("school_id");
                            rowData[4] = resultSet2.getObject("section");
                            
                            
                            
                            
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

    private void fullDetailsJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullDetailsJLabelMouseClicked
        // Profile Full View - TODO add your handling code here:
        setVisible(false);
        
       String firstname  = this.firstName;
       String lastname = this.lastName;
        
        ProfileFullView pfv = new ProfileFullView(firstname, lastname);
        setVisible(false);
        
        
        
    }//GEN-LAST:event_fullDetailsJLabelMouseClicked

    private void toolsjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolsjLabelMouseClicked
        // TODO add your handling code here:
        complabinventory.toolsSearch ts = new complabinventory.toolsSearch();
        ts.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_toolsjLabelMouseClicked

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
    private javax.swing.JLabel fullDetailsJLabel;
    private javax.swing.JButton go_searchButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelForImage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameTF;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton previousButton;
    private javax.swing.JLabel recordNumJL;
    private javax.swing.JTextField school_numTF;
    private javax.swing.JTextField searchBoxTF;
    private javax.swing.JLabel toolsjLabel;
    private javax.swing.JTable userTable1;
    // End of variables declaration//GEN-END:variables
}
