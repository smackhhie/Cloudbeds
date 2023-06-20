/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Model.*;
import java.text.SimpleDateFormat;
import java.awt.event.ActionListener;
import java.util.Calendar;
import Controller.*;
import javax.swing.JComboBox;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
public class Check_in_out extends javax.swing.JFrame {
  
    
    public JComboBox<String> getCombo_rNumber() {
        return combo_rNumber;
    }
    public JComboBox<String> getCombo_rType() {
        return commbo_rType;
        
    }
        public ButtonGroup getButtonGroupGender() {
        return btngroup;
    }
    private checkin_Controller controller;
    


    public JTextField getTxt_amtPaid() {
        return txt_amtPaid;
    }
    public JTextField getTxt_amtDue() {
        return txt_amtDue;
    }
    public JTextField getTxt_name() {
        return txt_name;
    }
    public JTextField getTxt_Phonenumber() {
        return txt_Phonenumber;
    }
  
    
    public JTextField getTxt_Duration() {
        return txt_Duration;
    }
        public JTextField getTxt_cID() {
        return txt_cID;
    }
        public int getSelectedRoomNumber() {
    String roomNumberStr = (String) combo_rNumber.getSelectedItem();
    return Integer.parseInt(roomNumberStr);
}   
        public int getPhNumber() {
    String PhnumberStr = (String) txt_Phonenumber.getText();
    return Integer.parseInt(PhnumberStr);
}
 
        
    public Check_in_out() {
        initComponents();
        txt_ChInDate.setEditable(false);
        SimpleDateFormat myFormat=new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal= Calendar.getInstance();
        txt_ChInDate.setText(myFormat.format(cal.getTime()));
        controller = new checkin_Controller(this);
        txt_ChInDate.setText(myFormat.format(cal.getTime()));
    }

checkin_Model mymodel;

public checkin_Model getData() {
    String fullName = txt_name.getText();
    String phoneNumber = txt_Phonenumber.getText();
    int amountPaid = Integer.parseInt(txt_amtPaid.getText());
    int duration = Integer.parseInt(txt_Duration.getText());
    
    String gender = "";
    if (RadioButtonM.isSelected()) {
        gender = "Male";
    } else if (RadioButtonF.isSelected()) {
        gender = "Female";
    } else if (RadioButtonO.isSelected()) {
        gender = "Other";
    }
    
    String roomType = (String) commbo_rType.getSelectedItem();
    int roomNumber = Integer.parseInt((String) combo_rNumber.getSelectedItem());
    Date checkinDate = Date.valueOf(txt_ChInDate.getText()); 

    // Get the customer ID
    int customerId = Integer.parseInt(txt_cID.getText());

    // Get the amount remaining
    int amountRemaining = Integer.parseInt(txt_amtDue.getText());

    mymodel = new checkin_Model(fullName, phoneNumber, amountPaid, duration, gender, roomType, roomNumber, checkinDate, customerId, amountRemaining);
    return mymodel;
}
  public void addCheckin(ActionListener log)
  {
      btn_submit.addActionListener(log);
  }
  public void showMessage(String msg){
      {
          JOptionPane.showMessageDialog(this, msg);
      }
  }
  public void calcDue(ActionListener log)
  {
      btn_calcDue.addActionListener(log);
  }
  public void showMessage1(String msg){
      {
          JOptionPane.showMessageDialog(this, msg);
      }
  }

    
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroup = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Phonenumber = new javax.swing.JTextField();
        txt_ChInDate = new javax.swing.JTextField();
        txt_Duration = new javax.swing.JTextField();
        txt_amtPaid = new javax.swing.JTextField();
        btn_submit = new javax.swing.JButton();
        btn_calcDue = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        commbo_rType = new javax.swing.JComboBox<>();
        combo_rNumber = new javax.swing.JComboBox<>();
        txt_amtDue = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_cID = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        RadioButtonM = new javax.swing.JRadioButton();
        RadioButtonF = new javax.swing.JRadioButton();
        RadioButtonO = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        jLabel2.setText("Customer-ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        jLabel5.setText("Duration");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        jLabel6.setText("Amount Paid");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        jLabel7.setText("Pending Amount");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));
        getContentPane().add(txt_Phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 242, -1));
        getContentPane().add(txt_ChInDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 242, -1));
        getContentPane().add(txt_Duration, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 242, -1));
        getContentPane().add(txt_amtPaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 242, -1));

        btn_submit.setBackground(new java.awt.Color(0, 0, 0));
        btn_submit.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        btn_submit.setForeground(new java.awt.Color(255, 255, 255));
        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 120, -1));

        btn_calcDue.setBackground(new java.awt.Color(0, 0, 0));
        btn_calcDue.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        btn_calcDue.setForeground(new java.awt.Color(255, 255, 255));
        btn_calcDue.setText("Calculate Due");
        btn_calcDue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcDueActionPerformed(evt);
            }
        });
        getContentPane().add(btn_calcDue, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 140, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagess/Check-in.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 0, 460, -1));

        jLabel9.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        jLabel9.setText("Phnone Number");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        jLabel10.setText("Room Type");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        jLabel11.setText("Room Number");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        commbo_rType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Suite", "Deluxe" }));
        commbo_rType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commbo_rTypeActionPerformed(evt);
            }
        });
        getContentPane().add(commbo_rType, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 242, -1));

        combo_rNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_rNumberActionPerformed(evt);
            }
        });
        getContentPane().add(combo_rNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 242, -1));

        txt_amtDue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_amtDueActionPerformed(evt);
            }
        });
        getContentPane().add(txt_amtDue, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 242, -1));

        jLabel12.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        jLabel12.setText("Check-in Date");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        txt_cID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cIDActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 242, -1));
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 242, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagess/cloudbeds-2-removebg-previewww.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 440, 80));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 110, -1));

        btngroup.add(RadioButtonM);
        RadioButtonM.setText("Male");
        getContentPane().add(RadioButtonM, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        btngroup.add(RadioButtonF);
        RadioButtonF.setText("Female");
        getContentPane().add(RadioButtonF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        btngroup.add(RadioButtonO);
        RadioButtonO.setText("Others");
        getContentPane().add(RadioButtonO, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_amtDueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_amtDueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_amtDueActionPerformed

    private void txt_cIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cIDActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed

    }//GEN-LAST:event_btn_submitActionPerformed

    private void combo_rNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_rNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_rNumberActionPerformed

    private void commbo_rTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commbo_rTypeActionPerformed
        // TODO add your handling code here:
        String selectedRoomType = (String) commbo_rType.getSelectedItem();
        controller.refreshRoomNumbers(selectedRoomType, combo_rNumber);
    }//GEN-LAST:event_commbo_rTypeActionPerformed

    private void btn_calcDueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcDueActionPerformed

    }//GEN-LAST:event_btn_calcDueActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Check_in_out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Check_in_out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Check_in_out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Check_in_out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Check_in_out().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioButtonF;
    private javax.swing.JRadioButton RadioButtonM;
    private javax.swing.JRadioButton RadioButtonO;
    private javax.swing.JButton btn_calcDue;
    private javax.swing.JButton btn_submit;
    private javax.swing.ButtonGroup btngroup;
    private javax.swing.JComboBox<String> combo_rNumber;
    private javax.swing.JComboBox<String> commbo_rType;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_ChInDate;
    private javax.swing.JTextField txt_Duration;
    private javax.swing.JTextField txt_Phonenumber;
    private javax.swing.JTextField txt_amtDue;
    private javax.swing.JTextField txt_amtPaid;
    private javax.swing.JTextField txt_cID;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
