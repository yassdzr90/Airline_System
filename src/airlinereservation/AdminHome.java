/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package airlinereservation;

import javax.swing.JOptionPane;

/**
 *
 * @author CHARIF
 */
public class AdminHome extends javax.swing.JFrame {

    /** Creates new form HomePage */
    public AdminHome() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        AddCustomer = new javax.swing.JMenuItem();
        SearchCustomer = new javax.swing.JMenuItem();
        UpdateCustomer = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        AddFlightDetails = new javax.swing.JMenuItem();
        UpdateFlightsDetails = new javax.swing.JMenuItem();
        ViewFlight = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        TicketsReservation = new javax.swing.JMenuItem();
        TicketsEnquiry = new javax.swing.JMenuItem();
        CancelSeat = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        FlightsList = new javax.swing.JMenuItem();
        RegisterList = new javax.swing.JMenuItem();
        FlightByDeparture = new javax.swing.JMenuItem();
        FlightByDepartureDate = new javax.swing.JMenuItem();
        BookingByDepartureDate = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        AddSource_destination = new javax.swing.JMenuItem();
        CreateEmployee = new javax.swing.JMenuItem();
        DeleteEmployee = new javax.swing.JMenuItem();
        ChangePassword = new javax.swing.JMenuItem();
        LogOut = new javax.swing.JMenuItem();
        NewUserCreation = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 255));

        jDesktopPane1.setBackground(new java.awt.Color(153, 153, 255));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1368, 753));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\CHARIF\\Downloads\\HOMEBLACK.jpg")); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1368, 700));

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1156, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 51, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jMenuBar1.setForeground(new java.awt.Color(0, 122, 117));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(68, 45));

        jMenu1.setText("Airline System");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenu3.setBackground(new java.awt.Color(204, 204, 255));
        jMenu3.setText("Customers");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        AddCustomer.setBackground(new java.awt.Color(204, 153, 255));
        AddCustomer.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        AddCustomer.setText("Add Customer");
        AddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCustomerActionPerformed(evt);
            }
        });
        jMenu3.add(AddCustomer);

        SearchCustomer.setBackground(new java.awt.Color(204, 153, 255));
        SearchCustomer.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SearchCustomer.setText("View Customer");
        SearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchCustomerActionPerformed(evt);
            }
        });
        jMenu3.add(SearchCustomer);

        UpdateCustomer.setBackground(new java.awt.Color(204, 153, 255));
        UpdateCustomer.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        UpdateCustomer.setText("Update Customer");
        UpdateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCustomerActionPerformed(evt);
            }
        });
        jMenu3.add(UpdateCustomer);

        jMenu1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(204, 204, 255));
        jMenu4.setText("Flights");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        AddFlightDetails.setBackground(new java.awt.Color(204, 153, 255));
        AddFlightDetails.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        AddFlightDetails.setText("Add Flight");
        AddFlightDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFlightDetailsActionPerformed(evt);
            }
        });
        jMenu4.add(AddFlightDetails);

        UpdateFlightsDetails.setBackground(new java.awt.Color(204, 153, 255));
        UpdateFlightsDetails.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        UpdateFlightsDetails.setText("Update Flight");
        UpdateFlightsDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateFlightsDetailsActionPerformed(evt);
            }
        });
        jMenu4.add(UpdateFlightsDetails);

        ViewFlight.setBackground(new java.awt.Color(204, 153, 255));
        ViewFlight.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ViewFlight.setText("View Flights");
        ViewFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewFlightActionPerformed(evt);
            }
        });
        jMenu4.add(ViewFlight);

        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tickets");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        TicketsReservation.setBackground(new java.awt.Color(153, 153, 255));
        TicketsReservation.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        TicketsReservation.setText("Ticket Reservation");
        TicketsReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketsReservationActionPerformed(evt);
            }
        });
        jMenu2.add(TicketsReservation);

        TicketsEnquiry.setBackground(new java.awt.Color(153, 153, 255));
        TicketsEnquiry.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        TicketsEnquiry.setText("Ticket Enquiry");
        TicketsEnquiry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketsEnquiryActionPerformed(evt);
            }
        });
        jMenu2.add(TicketsEnquiry);

        CancelSeat.setBackground(new java.awt.Color(153, 153, 255));
        CancelSeat.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        CancelSeat.setText("Cancel Seat");
        CancelSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelSeatActionPerformed(evt);
            }
        });
        jMenu2.add(CancelSeat);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("List");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        FlightsList.setBackground(new java.awt.Color(204, 204, 255));
        FlightsList.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        FlightsList.setText("Flights List");
        FlightsList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlightsListActionPerformed(evt);
            }
        });
        jMenu5.add(FlightsList);

        RegisterList.setBackground(new java.awt.Color(204, 204, 255));
        RegisterList.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        RegisterList.setText("Customer List");
        RegisterList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterListActionPerformed(evt);
            }
        });
        jMenu5.add(RegisterList);

        FlightByDeparture.setBackground(new java.awt.Color(204, 204, 255));
        FlightByDeparture.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        FlightByDeparture.setText("Flight By Departure");
        jMenu5.add(FlightByDeparture);

        FlightByDepartureDate.setBackground(new java.awt.Color(204, 204, 255));
        FlightByDepartureDate.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        FlightByDepartureDate.setText("Flights By Departure Date");
        FlightByDepartureDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlightByDepartureDateActionPerformed(evt);
            }
        });
        jMenu5.add(FlightByDepartureDate);

        BookingByDepartureDate.setBackground(new java.awt.Color(204, 204, 255));
        BookingByDepartureDate.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        BookingByDepartureDate.setText("Booking By Depparture Date");
        BookingByDepartureDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingByDepartureDateActionPerformed(evt);
            }
        });
        jMenu5.add(BookingByDepartureDate);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Others");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        AddSource_destination.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        AddSource_destination.setText("Add Source and Destination");
        AddSource_destination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSource_destinationActionPerformed(evt);
            }
        });
        jMenu6.add(AddSource_destination);

        CreateEmployee.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        CreateEmployee.setText("Create Employee");
        CreateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateEmployeeActionPerformed(evt);
            }
        });
        jMenu6.add(CreateEmployee);

        DeleteEmployee.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        DeleteEmployee.setText("Delete Employee");
        DeleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteEmployeeActionPerformed(evt);
            }
        });
        jMenu6.add(DeleteEmployee);

        ChangePassword.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ChangePassword.setText("Change Password");
        ChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePasswordActionPerformed(evt);
            }
        });
        jMenu6.add(ChangePassword);

        LogOut.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        LogOut.setText("Log out");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        jMenu6.add(LogOut);

        NewUserCreation.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        NewUserCreation.setText("Create User");
        NewUserCreation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewUserCreationActionPerformed(evt);
            }
        });
        jMenu6.add(NewUserCreation);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1156, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddFlightDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFlightDetailsActionPerformed
        // TODO add your handling code here:
        Add_Flights addflight=new Add_Flights();
        jDesktopPane1.add(addflight);
      addflight.setVisible(true);
    }//GEN-LAST:event_AddFlightDetailsActionPerformed

    private void TicketsEnquiryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicketsEnquiryActionPerformed
        // TODO add your handling code here:
         Enquiry_Tickets Enqu=new Enquiry_Tickets();
         jDesktopPane1.add(Enqu);
         Enqu.setVisible(true);
    }//GEN-LAST:event_TicketsEnquiryActionPerformed

    private void RegisterListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterListActionPerformed
        // TODO add your handling code here:
         Customer_registration listreg=new Customer_registration();
        jDesktopPane1.add(listreg);
      listreg.setVisible(true);
    }//GEN-LAST:event_RegisterListActionPerformed

    private void CreateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateEmployeeActionPerformed
        // TODO add your handling code here:
        Create_Employee obj=new Create_Employee();
        jDesktopPane1.add(obj);
      obj.setVisible(true);
    }//GEN-LAST:event_CreateEmployeeActionPerformed

    private void AddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCustomerActionPerformed
        // TODO add your handling code here:
        Add_Customer custAdd=new Add_Customer();
        jDesktopPane1.add(custAdd);
      custAdd.setVisible(true);
    }//GEN-LAST:event_AddCustomerActionPerformed

    private void SearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchCustomerActionPerformed
        // TODO add your handling code here:
        ViewCustomer view=new  ViewCustomer();
        jDesktopPane1.add(view);
      view.setVisible(true);
    }//GEN-LAST:event_SearchCustomerActionPerformed

    private void UpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCustomerActionPerformed
        // TODO add your handling code here:
        UpdateCustomer updcust=new  UpdateCustomer();
        jDesktopPane1.add(updcust);
      updcust.setVisible(true);
    }//GEN-LAST:event_UpdateCustomerActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void ViewFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewFlightActionPerformed
        // TODO add your handling code here:
        ViewFkightInfo FLview=new  ViewFkightInfo();
        jDesktopPane1.add(FLview);
      FLview.setVisible(true);
    }//GEN-LAST:event_ViewFlightActionPerformed

    private void UpdateFlightsDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateFlightsDetailsActionPerformed
        // TODO add your handling code here:
        Update_Flights updflight=new  Update_Flights();
        jDesktopPane1.add(updflight);
      updflight.setVisible(true);
    }//GEN-LAST:event_UpdateFlightsDetailsActionPerformed

    private void AddSource_destinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSource_destinationActionPerformed
        // TODO add your handling code here:
        Add_SourceDestination sdes=new  Add_SourceDestination();
        jDesktopPane1.add(sdes);
      sdes.setVisible(true);
    }//GEN-LAST:event_AddSource_destinationActionPerformed

    private void DeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteEmployeeActionPerformed
        // TODO add your handling code here:
        Delete_Employee emp=new  Delete_Employee();
        jDesktopPane1.add(emp);
     emp.setVisible(true);
    }//GEN-LAST:event_DeleteEmployeeActionPerformed

    private void ChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePasswordActionPerformed
        // TODO add your handling code here:
        Change_Password chPass=new  Change_Password();
        jDesktopPane1.add(chPass);
    chPass.setVisible(true);
    }//GEN-LAST:event_ChangePasswordActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
        this.dispose();
      LOGIN obj=new LOGIN();
      obj.setVisible(true);
    }//GEN-LAST:event_LogOutActionPerformed

    private void TicketsReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicketsReservationActionPerformed
        // TODO add your handling code here:
        Ticket_reservation res=new  Ticket_reservation();
        jDesktopPane1.add(res);
    res.setVisible(true);
    }//GEN-LAST:event_TicketsReservationActionPerformed

    private void NewUserCreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewUserCreationActionPerformed
        // TODO add your handling code here:
        CreateNewUser usnew=new  CreateNewUser();
        jDesktopPane1.add(usnew);
    usnew.setVisible(true);
    }//GEN-LAST:event_NewUserCreationActionPerformed

    private void FlightsListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlightsListActionPerformed
        // TODO add your handling code here:
        Flights_List listfli=new  Flights_List();
        jDesktopPane1.add(listfli);
    listfli.setVisible(true);
    }//GEN-LAST:event_FlightsListActionPerformed

    private void FlightByDepartureDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlightByDepartureDateActionPerformed
        // TODO add your handling code here:
        FlightByDate Datlist=new  FlightByDate();
        jDesktopPane1.add(Datlist);
        Datlist.setVisible(true);
    }//GEN-LAST:event_FlightByDepartureDateActionPerformed

    private void CancelSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelSeatActionPerformed
        // TODO add your handling code here:
        Cancel_seat ca_seat=new  Cancel_seat();
        jDesktopPane1.add(ca_seat);
        ca_seat.setVisible(true);
    }//GEN-LAST:event_CancelSeatActionPerformed

    private void BookingByDepartureDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingByDepartureDateActionPerformed
        // TODO add your handling code here:
        BookingListByDate bkl = new BookingListByDate();
       jDesktopPane1.add(bkl);
        bkl.setVisible(true);
    }//GEN-LAST:event_BookingByDepartureDateActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddCustomer;
    private javax.swing.JMenuItem AddFlightDetails;
    private javax.swing.JMenuItem AddSource_destination;
    private javax.swing.JMenuItem BookingByDepartureDate;
    private javax.swing.JMenuItem CancelSeat;
    private javax.swing.JMenuItem ChangePassword;
    private javax.swing.JMenuItem CreateEmployee;
    private javax.swing.JMenuItem DeleteEmployee;
    private javax.swing.JMenuItem FlightByDeparture;
    private javax.swing.JMenuItem FlightByDepartureDate;
    private javax.swing.JMenuItem FlightsList;
    private javax.swing.JMenuItem LogOut;
    private javax.swing.JMenuItem NewUserCreation;
    private javax.swing.JMenuItem RegisterList;
    private javax.swing.JMenuItem SearchCustomer;
    private javax.swing.JMenuItem TicketsEnquiry;
    private javax.swing.JMenuItem TicketsReservation;
    private javax.swing.JMenuItem UpdateCustomer;
    private javax.swing.JMenuItem UpdateFlightsDetails;
    private javax.swing.JMenuItem ViewFlight;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

}
