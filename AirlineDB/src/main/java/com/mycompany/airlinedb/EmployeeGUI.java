/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.airlinedb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
/**
 *
 * @author sasha
 */
public class EmployeeGUI extends javax.swing.JFrame {

    // 2 states: "New", "Update"
    String state;
    
    /**
     * Creates new form employeeGUI
     */
    public EmployeeGUI() {
        initComponents();
        state = "New";
        
         try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/groupfourproject", "root","");
                    Statement sta = connection.createStatement();
                    String query = "select flight_num from Flight order by flight_num";
                    ResultSet rs = sta.executeQuery(query);
                    flightID.addItem(null);
                    while (rs.next()) {
                        flightID.addItem(rs.getString("flight_num"));
                    }
        } catch (Exception exception) {
                    exception.printStackTrace();
        }
        refresh();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        goBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeList = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        empID = new javax.swing.JTextField();
        newButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        role = new javax.swing.JTextField();
        flightID = new javax.swing.JComboBox<>();
        refreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Employee");

        goBack.setText("Go Back");
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });

        employeeList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        employeeList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                employeeListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(employeeList);

        jLabel7.setText("Work on flight");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel5.setText("Employee ID");

        empID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empIDActionPerformed(evt);
            }
        });

        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Role");

        flightID.setActionCommand("");

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(goBack))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(22, 22, 22))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(flightID, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fname, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                        .addComponent(lname)
                                        .addComponent(empID)
                                        .addComponent(role)))))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(newButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(empID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(flightID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newButton)
                            .addComponent(deleteButton)
                            .addComponent(saveButton)))
                    .addComponent(jScrollPane1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goBack)
                    .addComponent(refreshButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {                                       
        this.setVisible(false);
        LauncherGUI newLauncher = new LauncherGUI();
        newLauncher.setVisible(true);
    }                                      

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        state = "New";
        empID.setEditable(true);
        fname.setText("");
        lname.setText("");
        empID.setText("");
        role.setText("");
        flightID.setSelectedIndex(0);
    }                                         

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if (state.equals("Update")) {
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/groupfourproject", "root","");
                Statement sta = connection.createStatement();
                String query = "DELETE FROM employee where employee_id="+ empID.getText();
                sta.execute(query);
                connection.close();
                empID.setEditable(true);
            } catch (Exception exception) {
                    exception.printStackTrace();
            } 
            refresh();
        }
    }                                            

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/groupfourproject", "root","");
            Statement sta = connection.createStatement();
            String flight;
            if (flightID.getSelectedItem() == null) {
                flight = "null";
            } else {
                flight = flightID.getSelectedItem().toString();
            }
            if (state.equals("New") 
                    && !fname.getText().isBlank() && !lname.getText().isBlank()) {
                //FIX WHEN ADDED NAME
                String query = "INSERT INTO employee VALUE (" + 
                        empID.getText() + ", '" + fname.getText() + "', '" + 
                        lname.getText() + "', " + flight + ", '" + role.getText() + "')";
                sta.execute(query);
                connection.close();
            }  else if (state.equals("Update")
                    && !fname.getText().isBlank() && !lname.getText().isBlank()) {
                String query = "UPDATE employee SET first_name = '" + fname.getText() + 
                        "', last_name = '" + lname.getText() +
                        "', flight_num = " + flight + ", role = '"
                        + role.getText() + "' where employee_ID = " +empID.getText();
                sta.execute(query);
                connection.close();
                empID.setEditable(true);
            }
            refresh();
        } catch (Exception exception) {
             exception.printStackTrace();
        }
    }                                          

    private void empIDActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void employeeListValueChanged(javax.swing.event.ListSelectionEvent evt) {                                          
        int index = employeeList.getSelectedIndex();
        //to get rid of index out of bound exception
        //when selected item does not exist anymore
        if (index >= 0) {
            System.out.println("Index Selected: " + index);
            String s = (String) employeeList.getSelectedValue();
            System.out.println("Value Selected: " + s);
            String[] parts = s.split("-");
            String ID = parts[0].trim();
            System.out.println("ID: " + ID);
            state = "Update";
            empID.setEditable(false);
            updateform(ID);       
        }
    }                                         

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        refresh();
    }                                             

    public void updateform(String id){
    try {   
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/groupfourproject", "root","");
 
                    String query = "select * from employee where employee_id="+id;

                    Statement sta = connection.createStatement();
                    ResultSet rs = sta.executeQuery(query);  
                    while (rs.next()) {
                       fname.setText(rs.getString("first_name"));
                       lname.setText(rs.getString("last_name"));
                       empID.setText(rs.getString("employee_id"));
                       role.setText(rs.getString("role"));
                       String flight = rs.getString("flight_num");
                       if (flight != null) {
                        flightID.setSelectedItem(rs.getString("flight_num"));
                       } else {
                           flightID.setSelectedItem(0);
                       }
                    } 
                
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                } 
}
    public void refresh(){
      try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/groupfourproject", "root","");
                   
                    String query = "select * from Employee order by employee_id";

                    Statement sta = connection.createStatement();
                    ResultSet rs = sta.executeQuery(query);  
                    DefaultListModel empModel;
                    empModel = new DefaultListModel();
                    while (rs.next()) {
                        empModel.addElement(rs.getString("employee_ID")
                                + " - " + rs.getString("first_name") + " " + rs.getString("last_name"));
                    }
                    employeeList.setModel(empModel);
                    
                    fname.setText("");
                    lname.setText("");
                    empID.setText("");
                    role.setText("");
                    flightID.setSelectedIndex(0);
                    
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
    }
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
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField empID;
    private javax.swing.JList<String> employeeList;
    private javax.swing.JComboBox<String> flightID;
    private javax.swing.JTextField fname;
    private javax.swing.JButton goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JButton newButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField role;
    private javax.swing.JButton saveButton;
    // End of variables declaration                   
}
