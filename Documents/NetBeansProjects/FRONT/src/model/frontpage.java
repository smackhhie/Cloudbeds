package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rujan
 */
public class frontpage extends javax.swing.JFrame {

    /**
     * Creates new form frontpage
     */
    public frontpage() {
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

        PHOTOPANEL = new javax.swing.JPanel();
        PHOTOLBL = new javax.swing.JLabel();
        toppanel = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();
        btnsignin = new javax.swing.JButton();
        INFOPANEL = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();
        btnregister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PHOTOPANEL.setBackground(new java.awt.Color(255, 255, 255));
        PHOTOPANEL.setPreferredSize(new java.awt.Dimension(910, 603));
        PHOTOPANEL.setRequestFocusEnabled(false);
        PHOTOPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PHOTOLBL.setBackground(new java.awt.Color(255, 255, 255));
        PHOTOLBL.setIcon(new javax.swing.ImageIcon("C:\\Users\\rujan\\Desktop\\2.png")); // NOI18N
        PHOTOPANEL.add(PHOTOLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 350, 350));

        toppanel.setBackground(new java.awt.Color(51, 204, 255));
        toppanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbllogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\rujan\\Desktop\\LOGO.png")); // NOI18N
        lbllogo.setText("jLabel2");
        toppanel.add(lbllogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 57, 57));

        lbltitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbltitle.setText("CLOUDBEDS");
        toppanel.add(lbltitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 150, 40));

        btnsignin.setBackground(new java.awt.Color(102, 204, 255));
        btnsignin.setIcon(new javax.swing.ImageIcon("C:\\Users\\rujan\\Desktop\\profile1.png")); // NOI18N
        btnsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsigninActionPerformed(evt);
            }
        });
        toppanel.add(btnsignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 58, 57));

        PHOTOPANEL.add(toppanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 57));

        INFOPANEL.setBackground(new java.awt.Color(255, 255, 255));
        INFOPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Your Gateway ");
        INFOPANEL.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 170, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("to");
        INFOPANEL.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 30, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 2, 24)); // NOI18N
        jLabel7.setText("Embrace the seamless journey of comfort,");
        INFOPANEL.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 420, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Hospitality");
        INFOPANEL.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 130, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 2, 24)); // NOI18N
        jLabel8.setText("connectivity, and unforgettable memories,");
        INFOPANEL.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 420, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 2, 24)); // NOI18N
        jLabel9.setText("leaving a lasting impression on your stay..");
        INFOPANEL.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 420, 30));

        btnlogin.setBackground(new java.awt.Color(102, 204, 255));
        btnlogin.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnlogin.setText("LOG IN");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        INFOPANEL.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 167, 52));

        btnregister.setBackground(new java.awt.Color(0, 0, 0));
        btnregister.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnregister.setForeground(new java.awt.Color(255, 255, 255));
        btnregister.setText("REGISTER");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        INFOPANEL.add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 167, 52));

        PHOTOPANEL.add(INFOPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 440, 360));

        getContentPane().add(PHOTOPANEL, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsigninActionPerformed
        new frontpage().setVisible(false);
        dispose();
        new register().setVisible(true);
    }//GEN-LAST:event_btnsigninActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        new frontpage().setVisible(false);
        dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        new frontpage().setVisible(false);
        dispose();
        new register().setVisible(true);
    }//GEN-LAST:event_btnregisterActionPerformed

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
            java.util.logging.Logger.getLogger(frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frontpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel INFOPANEL;
    private javax.swing.JLabel PHOTOLBL;
    private javax.swing.JPanel PHOTOPANEL;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnregister;
    private javax.swing.JButton btnsignin;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JPanel toppanel;
    // End of variables declaration//GEN-END:variables
}
