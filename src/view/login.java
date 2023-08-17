
package view;

import controller.logincontroller;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.loginmodel;


public class login extends javax.swing.JFrame {
    loginmodel model;
    public login() {
        initComponents();
    }
       public loginmodel getUser(){
       model = new loginmodel(txtusername.getText(),txtpassword.getText());
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
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        btngoback = new javax.swing.JButton();

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
        jLabel4.setText("LOGIN");
        infopanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 80, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Username:");
        infopanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 90, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Password:");
        infopanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 90, 30));

        txtusername.setToolTipText("");
        txtusername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        txtusername.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        infopanel.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 140, 30));
        txtusername.getAccessibleContext().setAccessibleName("");

        txtpassword.setToolTipText("");
        txtpassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtpassword.setDoubleBuffered(true);
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        infopanel.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 140, 30));

        btnlogin.setBackground(new java.awt.Color(102, 204, 255));
        btnlogin.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnlogin.setText("LOG IN");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        infopanel.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 120, 40));

        btngoback.setBackground(new java.awt.Color(102, 102, 102));
        btngoback.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btngoback.setForeground(new java.awt.Color(255, 255, 255));
        btngoback.setText("GO BACK");
        btngoback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngobackActionPerformed(evt);
            }
        });
        infopanel.add(btngoback, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 110, 40));

        mainpanel.add(infopanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 370, 360));

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

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    boolean valid(){
        String uname=txtusername.getText();
        String password=txtpassword.getText();
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
                else{
                return true;
                }
    }
    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        boolean ok1= valid();
        if (ok1==false)
        {
            
        } 
        else{
logincontroller a= new logincontroller(this);
    }//GEN-LAST:event_btnloginActionPerformed
// Assert.assertEquals(false,txtusername.getText().length()==0);
// Assert.assertEquals(false,txtpassword.getText().length()==0);
    }
    public void loginListner(ActionListener log){
        btnlogin.addActionListener(log);
    }
    private void btngobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngobackActionPerformed
        new login().setVisible(false);
        dispose();
        new frontpage().setVisible(true);
    }//GEN-LAST:event_btngobackActionPerformed


    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngoback;
    private javax.swing.JButton btnlogin;
    private javax.swing.JPanel infopanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JLabel photolbl;
    private javax.swing.JPanel toppanel;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
