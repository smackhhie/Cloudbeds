/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author rujan
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnemployeeinfo = new javax.swing.JButton();
        btnmanageroom = new javax.swing.JButton();
        btnaddroom = new javax.swing.JButton();
        btnaddemployee = new javax.swing.JButton();
        btncheckinn = new javax.swing.JButton();
        btncheckout = new javax.swing.JButton();
        btnpackages = new javax.swing.JButton();
        btngallery = new javax.swing.JButton();
        btnfoodmenu = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btncustomerinfo = new javax.swing.JButton();
        btnupdatestatus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/cb.png"))); // NOI18N

        btnemployeeinfo.setBackground(new java.awt.Color(204, 204, 204));
        btnemployeeinfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnemployeeinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/employeeinfo.png"))); // NOI18N
        btnemployeeinfo.setText("Employee Info");
        btnemployeeinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnemployeeinfoActionPerformed(evt);
            }
        });

        btnmanageroom.setBackground(new java.awt.Color(204, 204, 204));
        btnmanageroom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnmanageroom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/manageroomicon.png"))); // NOI18N
        btnmanageroom.setText("Manage Room");

        btnaddroom.setBackground(new java.awt.Color(204, 204, 204));
        btnaddroom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnaddroom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/addroom.png"))); // NOI18N
        btnaddroom.setText("  Add  Room    ");
        btnaddroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddroomActionPerformed(evt);
            }
        });

        btnaddemployee.setBackground(new java.awt.Color(204, 204, 204));
        btnaddemployee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnaddemployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/addemployee.png"))); // NOI18N
        btnaddemployee.setText("Add Employee");
        btnaddemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddemployeeActionPerformed(evt);
            }
        });

        btncheckinn.setBackground(new java.awt.Color(204, 204, 204));
        btncheckinn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncheckinn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/checkinn.png"))); // NOI18N
        btncheckinn.setText(" Check-Inn      ");
        btncheckinn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncheckinnActionPerformed(evt);
            }
        });

        btncheckout.setBackground(new java.awt.Color(204, 204, 204));
        btncheckout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncheckout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/checkout.png"))); // NOI18N
        btncheckout.setText(" Check-Out     ");
        btncheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncheckoutActionPerformed(evt);
            }
        });

        btnpackages.setBackground(new java.awt.Color(204, 204, 204));
        btnpackages.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnpackages.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/packages.png"))); // NOI18N
        btnpackages.setText(" Packages       ");

        btngallery.setBackground(new java.awt.Color(204, 204, 204));
        btngallery.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btngallery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/gallery.png"))); // NOI18N
        btngallery.setText(" Our Gallery    ");
        btngallery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngalleryActionPerformed(evt);
            }
        });

        btnfoodmenu.setBackground(new java.awt.Color(204, 204, 204));
        btnfoodmenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnfoodmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/menu.png"))); // NOI18N
        btnfoodmenu.setText(" Food Menu    ");

        btnexit.setBackground(new java.awt.Color(204, 204, 204));
        btnexit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/exit.png"))); // NOI18N
        btnexit.setText("  Exit                ");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btncustomerinfo.setBackground(new java.awt.Color(204, 204, 204));
        btncustomerinfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncustomerinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/customerinfo.png"))); // NOI18N
        btncustomerinfo.setText("Customer Info");

        btnupdatestatus.setBackground(new java.awt.Color(204, 204, 204));
        btnupdatestatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnupdatestatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/updatestatus.png"))); // NOI18N
        btnupdatestatus.setText("Update Status");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(btnfoodmenu))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnemployeeinfo)
                                    .addComponent(btnmanageroom)
                                    .addComponent(btnaddroom)
                                    .addComponent(btncheckinn)
                                    .addComponent(btnpackages))))
                        .addGap(175, 175, 175)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnupdatestatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btncheckout)
                            .addComponent(btngallery, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnexit, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnaddemployee, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btncustomerinfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnmanageroom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnupdatestatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnemployeeinfo)
                    .addComponent(btncustomerinfo))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaddroom)
                    .addComponent(btnaddemployee))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncheckinn)
                    .addComponent(btncheckout))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnpackages)
                    .addComponent(btngallery))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfoodmenu)
                    .addComponent(btnexit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 914, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnemployeeinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnemployeeinfoActionPerformed
        new dashboard().setVisible(false);
            dispose();
            new emp_name().setVisible(true);
    }//GEN-LAST:event_btnemployeeinfoActionPerformed

    private void btngalleryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngalleryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btngalleryActionPerformed

    private void btncheckinnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncheckinnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncheckinnActionPerformed

    private void btncheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncheckoutActionPerformed
        new dashboard().setVisible(false);
            dispose();
            new Check_Out().setVisible(true);
    }//GEN-LAST:event_btncheckoutActionPerformed

    private void btnaddemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddemployeeActionPerformed
            new dashboard().setVisible(false);
            dispose();
            new Add_emp().setVisible(true);   
    }//GEN-LAST:event_btnaddemployeeActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        new dashboard().setVisible(false);
        dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnaddroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddroomActionPerformed
        new dashboard().setVisible(false);
        dispose();
        new Add_room().setVisible(true);
    }//GEN-LAST:event_btnaddroomActionPerformed

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddemployee;
    private javax.swing.JButton btnaddroom;
    private javax.swing.JButton btncheckinn;
    private javax.swing.JButton btncheckout;
    private javax.swing.JButton btncustomerinfo;
    private javax.swing.JButton btnemployeeinfo;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnfoodmenu;
    private javax.swing.JButton btngallery;
    private javax.swing.JButton btnmanageroom;
    private javax.swing.JButton btnpackages;
    private javax.swing.JButton btnupdatestatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
