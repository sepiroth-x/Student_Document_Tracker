/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaswinggui;

import General.ConnectionProvider;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author jetro
 */
public class StudentBackground extends javax.swing.JFrame {
      Connection con;
      PreparedStatement ps;
      private  String studentID;
      private String studentName;
      
     
      
    
    public StudentBackground() {
       
        initComponents();
        
        //sample sir cupal
        
        
        
        
        
        
        
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        student_id = new javax.swing.JTextField();
        student_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        course = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        section = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        grade_level = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        searchTF = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "student_id", "student_name", "course", "age", "grade_level", "status", "section"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("student_id");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        student_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        student_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_idActionPerformed(evt);
            }
        });
        jPanel1.add(student_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 320, -1));

        student_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        student_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_nameActionPerformed(evt);
            }
        });
        jPanel1.add(student_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 320, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("student_name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("course");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        course.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseActionPerformed(evt);
            }
        });
        jPanel1.add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 320, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("age");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        age.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 320, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("section");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        section.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(section, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 320, -1));

        status.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 320, -1));

        grade_level.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(grade_level, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 320, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("grade_level");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("status");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "student_id", "student_name", "course", "age", "grade_level", "status", "section"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 830, 250));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 130, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("STUDENT BACKGROUND");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 430, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 950, 80));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("add student");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, 130, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, 130, -1));
        jPanel1.add(searchTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 320, -1));

        searchButton.setText("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, 140, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void student_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_idActionPerformed

    private void student_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_nameActionPerformed

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseActionPerformed
private JFrame frame;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 frame = new JFrame("Exit");
       if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","MySQL connector",
               JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
       {
          
           this.dispose();
       }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
       // this.con = thisConnectionProvider.connect();
        int student_id = Integer.parseInt(this.student_id.getText());
        System.out.println(student_id);
        String student_name = this.student_name.getText();
        String course = this.course.getText();
        String age = this.age.getText();
        String grade_level = this.grade_level.getText();
        String status = this.status.getText();
        String section = this.section.getText();
        
       
          try {
              this.ps = this.con.prepareStatement("INSERT INTO student_background(student_id,student_name,course,age,grade_level,status,section)VALUES(?,?,?,?,?,?,?)");
              this.ps.setInt(1, student_id);
              this.ps.setString(2,student_name);
              this.ps.setString(3,course);
              this.ps.setString(4,age);
              this.ps.setString(5,grade_level);
              this.ps.setString(6,status);
              this.ps.setString(7,section);
              
              this.ps.executeUpdate();
              
              this.student_id.setText("");
              this.student_name.setText("");
              this.course.setText("");
              this.age.setText("");
              this.grade_level.setText("");
              this.status.setText("");
              this.section.setText("");
              
          }catch (SQLException ex) {
              Logger.getLogger(StudentBackground.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        

        
        
         try{
             
            // this sql query will pull out all database records
              String searchQuery = " SELECT * FROM student_background "
                      + "WHERE student_id LIKE ? OR " 
                      + "student_name LIKE ?"; 

               //create object for the DatabaseConnection
             ConnectionProvider dbc = new ConnectionProvider();

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
             String searchKeyword = searchTF.getText(); // Replace with your search keyword
             statement.setString(1, "%" + searchKeyword + "%"); 
             statement.setString(2, "%" + searchKeyword + "%");
       
           
              ResultSet resultSet = statement.executeQuery();
           // Check if a row was found
           
            if (resultSet.next()) {
                this.studentID = resultSet.getString("student_id");
                 this.studentName = resultSet.getString("student_name");
                
                
 

                // Display the retrieved data
                System.out.println("First Name: " + this.studentID);
                System.out.println("Last Name: " + this.studentName);
                
                
                 //display the output in the UI
//                  recordNumJL.setText(this.record_id);
//                  firstNameTF.setText(this.firstName);
//                  lastNameTF.setText(this.lastName);
//                  school_numTF.setText(this.school_id);
//                  
//                  
                  
                      //display related data search to the table
                    // String searchQuery2 = "SELECT * FROM users WHERE";
                    // Create a table model to store data
                    DefaultTableModel tableModel = new DefaultTableModel();
                    jTable2.setModel(tableModel);
                    
                    /*this part is the application of centering the data in the cell, coming from the custom class inside
                    *the tablerelated package, inside CenteredTableCellRenderer class
                    **/
//                    tablerelated.CenteredTableCellRenderer renderer = new tablerelated.CenteredTableCellRenderer();
//                    jTable2.setDefaultRenderer(Object.class, renderer);
                    

                  
                    // Create a PreparedStatement
                    PreparedStatement preparedStatement = connection.prepareStatement(searchQuery);
                    preparedStatement.setString(1, "%" + searchKeyword + "%");
                    preparedStatement.setString(2, "%" + searchKeyword + "%");
                

                    // Execute the query
                    ResultSet resultSet2 = preparedStatement.executeQuery();

                    // Get column names and add them to the table model
                    java.sql.ResultSetMetaData metaData = resultSet2.getMetaData();
                    
                    int columnCount = metaData.getColumnCount();
                    for (int i = 1; i <= columnCount; i++) {
                        
                            //tableModel.addColumn(metaData.getColumnName(i));
              
                            String columnName = metaData.getColumnName(i);
                            if (columnName.equals("student_id") || columnName.equals("student_name")) {
                                 
                                     tableModel.addColumn(columnName);

                            }
                        
                    }

                    // Add rows to the table model
                    while (resultSet2.next()) {
                        Object[] rowData = new Object[columnCount];
                        for (int i = 1; i <= columnCount; i++) {
                            //rowData[i - 1] = resultSet2.getObject(i);
                            
                            rowData[0] = resultSet2.getObject("student_id");
                            rowData[1] = resultSet2.getObject("student_name");
                            
                            
                            
                            
                            
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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_searchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StudentBackground.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentBackground.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentBackground.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentBackground.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentBackground().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextField course;
    private javax.swing.JTextField grade_level;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTF;
    private javax.swing.JTextField section;
    private javax.swing.JTextField status;
    private javax.swing.JTextField student_id;
    private javax.swing.JTextField student_name;
    // End of variables declaration//GEN-END:variables
}
