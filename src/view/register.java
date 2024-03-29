/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.registerController;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.registermodel;

public class register extends javax.swing.JFrame {
registermodel model;
    public register() {
        
        initComponents();
    }
     public registermodel getUser(){
             
       model = new registermodel(txtfirstname.getText(),txtlastname.getText(), txtselect.getSelectedItem(),citizen.getText(),txtusername.getText(),txtpassword.getText(),txtconpassword.getText());
       return model;
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
        photolbl = new javax.swing.JLabel();
        toppanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        infopanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        btnsignup = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtlastname = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        citizen = new javax.swing.JTextField();
        txtconpassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtselect = new javax.swing.JComboBox<>();
        lbl_userexist = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainpanel.setBackground(new java.awt.Color(255, 255, 255));
        mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        photolbl.setBackground(new java.awt.Color(255, 255, 255));
        photolbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.png"))); // NOI18N
        mainpanel.add(photolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 350, 350));

        toppanel.setBackground(new java.awt.Color(51, 204, 255));
        toppanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LOGO.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        toppanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 57, 57));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("CLOUDBEDS");
        toppanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 150, 40));

        jButton1.setBackground(new java.awt.Color(102, 204, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        toppanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 58, 57));

        mainpanel.add(toppanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 57));

        infopanel.setBackground(new java.awt.Color(255, 255, 255));
        infopanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        infopanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("SIGNUP");
        infopanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 90, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Username");
        infopanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 90, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Password");
        infopanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 80, 30));

        txtfirstname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfirstname.setToolTipText("");
        txtfirstname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        txtfirstname.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfirstnameActionPerformed(evt);
            }
        });
        infopanel.add(txtfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 140, 30));

        txtpassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtpassword.setToolTipText("");
        txtpassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtpassword.setDoubleBuffered(true);
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        infopanel.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 140, 30));

        btnsignup.setBackground(new java.awt.Color(102, 204, 255));
        btnsignup.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnsignup.setText("Sign Up");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        infopanel.add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 120, 40));

        btnlogin.setBackground(new java.awt.Color(102, 102, 102));
        btnlogin.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("LOG IN");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        infopanel.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 110, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("First Name");
        infopanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 90, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Last Name");
        infopanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 90, 30));

        txtlastname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtlastname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtlastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlastnameActionPerformed(evt);
            }
        });
        infopanel.add(txtlastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 140, 30));

        txtusername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtusername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        infopanel.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 140, 30));

        citizen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        citizen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        citizen.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        citizen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citizenActionPerformed(evt);
            }
        });
        infopanel.add(citizen, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 140, 30));

        txtconpassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtconpassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        infopanel.add(txtconpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 140, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Confirm Password");
        infopanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 150, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("No.");
        jLabel9.setToolTipText("");
        infopanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 90, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Select");
        infopanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 100, 30));

        txtselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Citizenship", "License", " " }));
        txtselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtselectActionPerformed(evt);
            }
        });
        infopanel.add(txtselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 140, 30));

        lbl_userexist.setForeground(new java.awt.Color(255, 0, 51));
        infopanel.add(lbl_userexist, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 140, 20));

        mainpanel.add(infopanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 420, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 911, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new frontpage().setVisible(false);
        dispose();
        new register().setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtfirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfirstnameActionPerformed
    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        }//GEN-LAST:event_txtpasswordActionPerformed

   boolean validation()
        {
            
            String fname=txtfirstname.getText();
            String lname=txtlastname.getText();
            String select=(String) txtselect.getSelectedItem();
            String Id;
            Id = citizen.getText();
            String uname=txtusername.getText();
            String password=txtpassword.getText();
            String con_pass=txtconpassword.getText();
            
            if (fname.equals(""))
            {
                JOptionPane.showMessageDialog(this,"please enter firstname");
                return false;
            }
            if (lname.equals(""))
            {
                JOptionPane.showMessageDialog(this,"please enter lastname");
                return false;
            }
            if (select == null)
        {
            JOptionPane.showMessageDialog(this,"please choose");
            return false;
        }
            if (Id.equals(""))
        {
            JOptionPane.showMessageDialog(this,"please enter your id");
            return false;
        }
                if (uname.equals(""))
            {
                JOptionPane.showMessageDialog(this,"please enter your username");
                return false;
            }
                if (password.equals(""))
            {
                JOptionPane.showMessageDialog(this,"please enter password");
                return false;
            }
                if (con_pass.equals(""))
            {
                JOptionPane.showMessageDialog(this,"please confirm the password");
                return false;
            }
                if (password.length()<8)
                {
                   JOptionPane.showMessageDialog(this,"password should be 8 digit");

                   return false;
                }
                if (!password.equals(con_pass))
                {
                    JOptionPane.showMessageDialog(this ,"password not matched");
                    return false;
                }
                
                else{
                     try {
                int idValue = Integer.parseInt(Id);   
                } 
                catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter a valid integer ID");
                return false;
                }
                return true;
                }
               
        }
    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        boolean ok= validation();
        if (ok==false)
        {
            
        }
        else{
registerController a= new registerController(this);
                }
//Assert. assertEquals ("First name cannot be empty", false, txtfirstname.getText ().isEmpty ());
//Assert.assertEquals ("Last name cannot be empty", false, txtlastname.getText () .isEmpty ());
//Assert. assertEquals ("Password cannot be empty", false, txtpassword. getText () .isEmpty ()) ;
//Assert.assertEquals ("Passwords do not match", txtpassword.getText () , txtconpassword.getText ());
    }//GEN-LAST:event_btnsignupActionPerformed
    
    public void registerListner(ActionListener log){
        btnsignup.addActionListener(log);
    }
    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        new register().setVisible(false);
        dispose();
        new login().setVisible(true);
        
    }//GEN-LAST:event_btnloginActionPerformed

    private void txtlastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlastnameActionPerformed

    private void txtselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtselectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtselectActionPerformed

    private void citizenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citizenActionPerformed
//        MaskFormatter formatter;
//        try {
//            formatter = new MaskFormatter("##-##-##-#####");
//        } catch (Exception e) {
//            e.printStackTrace();
//            return;
//        }
//        id = new JFormattedTextField(formatter);
//        id.setColumns(15);
//        System.out.println("error okz");
    }//GEN-LAST:event_citizenActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsignup;
    private javax.swing.JTextField citizen;
    private javax.swing.JPanel infopanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_userexist;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JLabel photolbl;
    private javax.swing.JPanel toppanel;
    private javax.swing.JPasswordField txtconpassword;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JComboBox<String> txtselect;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

}
