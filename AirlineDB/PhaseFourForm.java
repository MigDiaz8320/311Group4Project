
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;  
import java.sql.Statement;
import javax.swing.DefaultListModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */   

/**
 *
 * @author block
 */
public class PhaseFourForm extends javax.swing.JFrame {

    /**
     * Creates new form PhaseFourForm
     */
    public PhaseFourForm() {
        initComponents();
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
        userList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RefreshButton = new javax.swing.JButton();
        staff = new javax.swing.JTextField();
        departTime = new javax.swing.JTextField();
        arrivalTime = new javax.swing.JTextField();
        insertButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        airplaneID = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flight Table");

        userList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        userList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                userListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(userList);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Flight");

        jLabel2.setText("Depart Time:");

        jLabel3.setText("Arrival Time:");

        jLabel4.setText("Airplane ID:");

        jLabel5.setText("Staff:");

        RefreshButton.setText("Refresh");
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });

        staff.setToolTipText("");
        staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffActionPerformed(evt);
            }
        });

        departTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departTimeActionPerformed(evt);
            }
        });

        arrivalTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrivalTimeActionPerformed(evt);
            }
        });

        insertButton.setText("Insert");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        airplaneID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "1000", "2", "3", "4" }));
        airplaneID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airplaneIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(72, 72, 72)
                        .addComponent(RefreshButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arrivalTime)
                            .addComponent(departTime)
                            .addComponent(staff)
                            .addComponent(airplaneID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton)
                        .addGap(107, 107, 107))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(RefreshButton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(departTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(arrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(airplaneID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertButton)
                            .addComponent(deleteButton)
                            .addComponent(updateButton))
                        .addGap(37, 37, 37))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed
        refresh(); 
    }//GEN-LAST:event_RefreshButtonActionPerformed

    private void departTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departTimeActionPerformed

    private void staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffActionPerformed

    private void userListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_userListValueChanged
        //Get the index of the selected item
        int index = userList.getSelectedIndex() + 1;
        
        //Log the output
        System.out.println("Index Selected: " + index);
        //Grab the selected value of the item.
        String s = (String) userList.getSelectedValue();
        //log the value
        System.out.println("Value Selected: " + s);
        //This function breaks apart the values by splitting the string based on "-"
        String[] parts = s.split("-");
        //Grab the first item - this is the flight_num
        String flight_num = parts[0].trim();
        System.out.println("flight_num: " + flight_num);
        //Call the update form funciton to update the screen
        updateform(flight_num);
    }//GEN-LAST:event_userListValueChanged

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        Insert();
    }//GEN-LAST:event_insertButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        deleteUser();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        saveUser();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void arrivalTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrivalTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arrivalTimeActionPerformed

    private void airplaneIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airplaneIDActionPerformed
        
    }//GEN-LAST:event_airplaneIDActionPerformed
    
        public void refresh()
    {
        try {
            //Connect to the database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/groupfourproject", "root", "root");
            //initialize the query
            String query = "select * from flight";
            //Create a new statement
            Statement sta = connection.createStatement();
            //Execute the Query and assign the results to the rs object
            ResultSet rs = sta.executeQuery(query);
            //instantiate a new DefaultListModel
            DefaultListModel listModel;
            listModel = new DefaultListModel();
            //Loop through the results and add the items to the lsit model
            while (rs.next()) {
            listModel.addElement(rs.getString("flight_num") + " - " + rs.getString("depart_time") + " " +
            rs.getString("arrival_time"));
            }
            //Set the model of the userList to the list Model
            userList.setModel(listModel);
            //Close the connection
            connection.close();
            //Catch any errors
        } 
        catch (Exception exception) 
        {
            exception.printStackTrace();
        }
    }
        
        public void updateform(String flight_num){
        try 
        {
            airplaneID.setEnabled(true);
            //Establish mysql connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/groupfourproject", "root","root");
            //Initialize the query
            String query = "select * from flight where flight_num="+flight_num;
            //create the statement
            Statement sta = connection.createStatement();
            //Set the results
            ResultSet rs = sta.executeQuery(query);
            //Because we are targeting a primary key, we simply set the values to the results taht are retrieved.
            while (rs.next()) 
            {
                departTime.setText(rs.getString("depart_time"));
                arrivalTime.setText(rs.getString("arrival_time"));
                airplaneID.setSelectedItem(rs.getString("airplane_ID"));
                staff.setText(rs.getString("staff"));
            }
            //close the connection
            connection.close();
        } 
        catch (Exception exception) 
        { //catch any exceptions that may have occured
            exception.printStackTrace(); //print any errors
        }
    }
        
    public void Insert()
    {
        try 
        {
            int iteration_flight_num = userList.getLastVisibleIndex()+ 2;
            //Establish mysql connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/groupfourproject", "root","root");
            //Initialize the query
            String query = "select * from flight where flight_num=";
            //create the statement
            Statement sta = connection.createStatement();
            if(departTime.getText().isEmpty() == false)
            {
                if(arrivalTime.getText().isEmpty() == false)
                {
                    PreparedStatement pStmt = connection.prepareStatement("insert into flight values(?, ?, ?, ?, ?)");
                    pStmt.setString(1, String.valueOf(iteration_flight_num));
                    pStmt.setString(2, departTime.getText());
                    pStmt.setString(3, arrivalTime.getText());
                    pStmt.setString(4, airplaneID.getEditor().getItem().toString());
                    pStmt.setString(5, staff.getText());
                    pStmt.executeUpdate();
                }
            }
            //close the connection
            connection.close();
        } 
        catch (Exception exception) 
        { //catch any exceptions that may have occured
            exception.printStackTrace(); //print any errors
        }
    }
    
    public void deleteUser()
    {
        try 
        {
            int selectedUser = userList.getSelectedIndex() + 1;
            //Establish mysql connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/groupfourproject", "root","root");
            //Initialize the query
            String query = "select * from flight where flight_num=";
            //create the statement
            Statement sta = connection.createStatement();
            PreparedStatement pStmt = connection.prepareStatement("delete from flight where flight_num = ?");
            pStmt.setInt(1, selectedUser);
            pStmt.executeUpdate();
            //close the connection
            connection.close();
            refresh();
        } 
        catch (Exception exception) 
        { //catch any exceptions that may have occured
            exception.printStackTrace(); //print any errors
        }
    }
    
    public void saveUser()
    {
        try 
        {  
            int selectedUser = userList.getSelectedIndex() + 1;
            //Establish mysql connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/groupfourproject", "root","root");
            //Initialize the query
            String query = "select * from flight where flight_number=";
            //create the statement
            Statement sta = connection.createStatement();
            PreparedStatement pStmt = connection.prepareStatement("update flight set depart_time = ?, arrival_time = ?, airplane_ID = ?, staff = ? where flight_num = ?");
            pStmt.setString(1, departTime.getText());
            pStmt.setString(2, arrivalTime.getText());
            pStmt.setString(3, airplaneID.getEditor().getItem().toString());
            pStmt.setString(4, staff.getText());
            pStmt.setInt(5, selectedUser);
            pStmt.executeUpdate();
            //close the connection
            connection.close();
            refresh();
        } 
        catch (Exception exception) 
        { //catch any exceptions that may have occured
            exception.printStackTrace(); //print any errors
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
            java.util.logging.Logger.getLogger(PhaseFourForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhaseFourForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhaseFourForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhaseFourForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhaseFourForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RefreshButton;
    private javax.swing.JComboBox<String> airplaneID;
    private javax.swing.JTextField arrivalTime;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField departTime;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField staff;
    private javax.swing.JButton updateButton;
    private javax.swing.JList<String> userList;
    // End of variables declaration//GEN-END:variables
}
