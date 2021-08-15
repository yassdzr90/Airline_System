/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CHARIF
 */
public class Customer_registration extends javax.swing.JInternalFrame {

    /**
     * Creates new form Customer_registration
     */
    public Customer_registration() {
        initComponents();
    }

    Connection con;
    PreparedStatement pst;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("List Of All Customers");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setLayout(null);

        TableList.setBackground(new java.awt.Color(0, 153, 153));
        TableList.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        TableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "First Name", "Last Name", "Passport ID", "Birth Date", "Contact", "Address"
            }
        ));
        jScrollPane1.setViewportView(TableList);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 110, 1060, 350);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("View All Customers available");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 10, 450, 60);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\CHARIF\\Downloads\\rsz_listback.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1080, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1081, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        try
            {
               
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
                
                try
                {
                    String q="select * from customer";
                    pst=con.prepareStatement(q);
                  ResultSet myresult=pst.executeQuery();
                  
                  if(myresult.next())
                  {
                      DefaultTableModel mymodel=(DefaultTableModel)TableList.getModel();
                      do
                      {
                          String custid,firstname,lastname,passID,birth,conta,address,countr;
                          custid=myresult.getString("Cust_ID");
                          firstname=myresult.getString("Cust_fname");
                          lastname=myresult.getString("Cust_lname");
                          passID=myresult.getString("Cust_passportid");
                          birth=myresult.getString("Cust_birth");
                          conta=myresult.getString("Cust_contact");
                          address=myresult.getString("Cust_address");
                          countr=myresult.getString("Country");
                          
                          mymodel.addRow(new Object[]{custid,firstname,lastname,passID,birth,conta,address,countr});
                       }
                      while(myresult.next());
                  }
                  else
                  {
                      JOptionPane.showMessageDialog(rootPane, "No Registration Available", "Null", JOptionPane.ERROR_MESSAGE);  
                  }
                     
                    
                     
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error in query due to"+e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
                }
                finally
                {
                    con.close();
                }
            }
        catch(Exception e)
        {
         e.printStackTrace();
         JOptionPane.showMessageDialog(rootPane, "Error in connection" +e.getMessage());
        }
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
