/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import Model.roomAva_Model;
import Controller.roomAva_Controller;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JTextField;


public class roomAva_View extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
    
    private roomAva_Controller controller;
    
    DefaultTableModel dtm=null;
    
    public int getSelectedRoomNumber() {
    String roomNumberStr = (String) comboRoom_No.getSelectedItem();
    return Integer.parseInt(roomNumberStr);
    }
    
    public DefaultTableModel getTableModel() {
        return dtm;
    }
    


    public roomAva_View() {
    initComponents();
    dtm = (DefaultTableModel) tableRooms.getModel();
    tableRooms.setModel(dtm);
    controller = new roomAva_Controller(this);
    tableRooms.getTableHeader().setPreferredSize(new Dimension(tableRooms.getTableHeader().getPreferredSize().width, 50));
    tableRooms.setRowHeight(50); 
    }
    
    roomAva_Model model;
    public roomAva_Model getData(){   
    int room_no = Integer.parseInt((String) comboRoom_No.getSelectedItem());
    int rate = Integer.parseInt((String) txt_rate.getText());
    String status = (String) combo_Status.getSelectedItem();
    String availability= (String) comboAvailability.getSelectedItem();
    int package_rate = Integer.parseInt((String) txt_prate.getText());
    model = new roomAva_Model(availability, status, room_no, rate, package_rate);
    return model;
    }
    
    public void updateRoom (ActionListener log)
    {
      btn_Update.addActionListener(log);
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRooms = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboAvailability = new javax.swing.JComboBox<>();
        txt_prate = new javax.swing.JTextField();
        txt_rate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboRoom_No = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        combo_Status = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        btn_ShowRooms = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableRooms.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableRooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Room No", "Type", "Rate", "Availability", "Status", "Package_Rate"
            }
        ));
        tableRooms.setRowHeight(50);
        tableRooms.setShowGrid(true);
        jScrollPane1.setViewportView(tableRooms);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 570, 410));

        jLabel8.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(129, 133, 137));
        jLabel8.setText("Manage Rooms");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 140, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Availability");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 120, 30));

        comboAvailability.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "available", "occupied" }));
        jPanel2.add(comboAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 150, 30));

        txt_prate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_prateActionPerformed(evt);
            }
        });
        jPanel2.add(txt_prate, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 150, 30));

        txt_rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rateActionPerformed(evt);
            }
        });
        jPanel2.add(txt_rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 150, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Package Rate");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 120, 30));

        comboRoom_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRoom_NoActionPerformed(evt);
            }
        });
        jPanel2.add(comboRoom_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 150, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Status");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 120, 30));

        combo_Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "clean", "dirty" }));
        jPanel2.add(combo_Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 150, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Room No");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 120, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagess/cloudbeds-2-removebg-previewww.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 440, 80));

        jButton2.setText("jButton2");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 540, 130, 30));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 242, 242));
        jLabel7.setText("Update Rooms");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 300, 52));

        btn_back.setBackground(new java.awt.Color(0, 0, 0));
        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_back.setForeground(new java.awt.Color(254, 254, 254));
        btn_back.setText("Back");
        jPanel2.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 140, 40));

        btn_Update.setBackground(new java.awt.Color(0, 0, 0));
        btn_Update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Update.setForeground(new java.awt.Color(254, 254, 254));
        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 140, 40));

        btn_ShowRooms.setBackground(new java.awt.Color(0, 0, 0));
        btn_ShowRooms.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_ShowRooms.setForeground(new java.awt.Color(254, 254, 254));
        btn_ShowRooms.setText("Show Rooms");
        btn_ShowRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ShowRoomsActionPerformed(evt);
            }
        });
        jPanel2.add(btn_ShowRooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 140, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 300, 355));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Rate");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 120, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 911, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ShowRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ShowRoomsActionPerformed
        // TODO add your handling code here:
    controller.populateTableFromDatabase();
    controller.populateRoomNumbers(comboRoom_No);
    
    }//GEN-LAST:event_btn_ShowRoomsActionPerformed

    private void txt_rateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rateActionPerformed

    private void comboRoom_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRoom_NoActionPerformed
        // TODO add your handling code here:
        controller.refreshRates(getSelectedRoomNumber(), txt_rate);
        controller.refreshPackageRates(getSelectedRoomNumber(),txt_prate);
        controller.updateStatus(getSelectedRoomNumber(), combo_Status);
        controller.updateAvailabilityStatus(getSelectedRoomNumber(), comboAvailability);
    }//GEN-LAST:event_comboRoom_NoActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        // TODO add your handling code here:
        controller.updateRoomDetails(model);
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void txt_prateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_prateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prateActionPerformed

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
            java.util.logging.Logger.getLogger(roomAva_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(roomAva_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(roomAva_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(roomAva_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new roomAva_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ShowRooms;
    private javax.swing.JButton btn_Update;
    private javax.swing.JButton btn_back;
    private javax.swing.JComboBox<String> comboAvailability;
    private javax.swing.JComboBox<String> comboRoom_No;
    private javax.swing.JComboBox<String> combo_Status;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableRooms;
    private javax.swing.JTextField txt_prate;
    private javax.swing.JTextField txt_rate;
    // End of variables declaration//GEN-END:variables
}
