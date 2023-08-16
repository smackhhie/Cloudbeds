/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package model;

import database.FRONT;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author Craze
 */
public class Cus_info extends javax.swing.JFrame {

    /**
     * Creates new form Cus_info
     */
    public Cus_info() {
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

        grpbtn = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        Cus_name = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        Heading = new javax.swing.JLabel();
        nagarikta = new javax.swing.JLabel();
        Phone_num = new javax.swing.JLabel();
        txt_CusName = new javax.swing.JTextField();
        txtcitizen = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        btnmale = new javax.swing.JCheckBox();
        btnfemale = new javax.swing.JCheckBox();
        btnOther = new javax.swing.JCheckBox();
        submit = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Form");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(930, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cb.png"))); // NOI18N
        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 372, 75));

        Cus_name.setBackground(new java.awt.Color(255, 255, 255));
        Cus_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Cus_name.setText("Customer Name");
        jPanel1.add(Cus_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 184, 114, 28));

        Gender.setBackground(new java.awt.Color(255, 255, 255));
        Gender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Gender.setText("Gender");
        jPanel1.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 257, -1, -1));

        Heading.setBackground(new java.awt.Color(255, 255, 255));
        Heading.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Heading.setText("CUSTOMER FORM");
        jPanel1.add(Heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        nagarikta.setBackground(new java.awt.Color(255, 255, 255));
        nagarikta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nagarikta.setText("Citizenship Number");
        jPanel1.add(nagarikta, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 325, -1, 16));

        Phone_num.setBackground(new java.awt.Color(255, 255, 255));
        Phone_num.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Phone_num.setText("Phone Number");
        jPanel1.add(Phone_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 390, -1, -1));

        txt_CusName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CusNameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_CusName, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 188, 199, -1));
        jPanel1.add(txtcitizen, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 323, 199, -1));
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 390, 208, -1));

        grpbtn.add(btnmale);
        btnmale.setText("Male");
        jPanel1.add(btnmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 258, -1, -1));

        grpbtn.add(btnfemale);
        btnfemale.setText("Female");
        btnfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfemaleActionPerformed(evt);
            }
        });
        jPanel1.add(btnfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 258, -1, -1));

        grpbtn.add(btnOther);
        btnOther.setText("Other");
        jPanel1.add(btnOther, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 258, -1, -1));

        submit.setBackground(new java.awt.Color(102, 102, 255));
        submit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 82, -1));

        back.setBackground(new java.awt.Color(102, 102, 255));
        back.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 81, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_CusNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CusNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CusNameActionPerformed

    private void btnfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnfemaleActionPerformed
 boolean validation()
        {
            
            String fname=txt_CusName.getText();
            String Citizen=txtcitizen.getText();
            String Phone;
            
            Phone=phone.getText();
            
            
            if (fname.equals(""))
            {
                JOptionPane.showMessageDialog(this,"please enter name");
                return false;
            }
            try{
                    String selectedValue = "";
                if (btnmale.isSelected()) {
                    selectedValue = btnmale.getText();
                } else if (btnfemale.isSelected()) {
                    selectedValue = btnfemale.getText();
                } else if (btnOther.isSelected()) {
                    selectedValue = btnOther.getText();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Select Gender");
                    return false;
                }
            }
               catch(Exception e){
                       e.printStackTrace();
                       }
          
           
                if (Phone.equals(""))
            {
                JOptionPane.showMessageDialog(this,"please enter phone number");
                return false;
            }
                    if (Phone.length()!=10)
            {
                JOptionPane.showMessageDialog(this,"Phone number should be of 10 digits");
                return false;
            }
                    if (Citizen.equals(""))
            {
            JOptionPane.showMessageDialog(this,"please enter Citizenship number");
            return false;
            }
           else{

                return true;
                }
        }
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        boolean pra=validation();
        if(pra==false){
            
        }
        else{
            Connection conn = FRONT.dbConnect();
            try{
                    String selectedValue = "";
                if (btnmale.isSelected()) {
                    selectedValue = btnmale.getText();
                } else if (btnfemale.isSelected()) {
                    selectedValue = btnfemale.getText();
                } else if (btnOther.isSelected()) {
                    selectedValue = btnOther.getText();
                }
                Statement stmt=conn.createStatement();
                            String sql="insert into cusinfo values('"+txt_CusName.getText()+"','"+selectedValue+"','"+txtcitizen.getText()+"','"+phone.getText()+"')";
                            stmt.executeUpdate(sql);
                            System.out.println("Data inserted");
                            JOptionPane.showMessageDialog(null,"Sucessfully Added");
                            new Cus_info().setVisible(false);
                    dispose();
                    new dashboard().setVisible(true);
            }
            catch(Exception e){
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_submitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed
       
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
            java.util.logging.Logger.getLogger(Cus_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cus_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cus_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cus_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cus_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cus_name;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Header;
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel Phone_num;
    private javax.swing.JButton back;
    private javax.swing.JCheckBox btnOther;
    private javax.swing.JCheckBox btnfemale;
    private javax.swing.JCheckBox btnmale;
    private javax.swing.ButtonGroup grpbtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nagarikta;
    private javax.swing.JTextField phone;
    private javax.swing.JButton submit;
    private javax.swing.JTextField txt_CusName;
    private javax.swing.JTextField txtcitizen;
    // End of variables declaration//GEN-END:variables
}
