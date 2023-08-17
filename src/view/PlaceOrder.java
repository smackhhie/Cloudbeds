/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
//import controller.menuaddcontroller;
import database.FRONT;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class PlaceOrder extends javax.swing.JFrame {
    public PlaceOrder() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtnumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtfood = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtquantity = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Bill ID :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 117, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Customer Details :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Name : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 180, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Mobile Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));
        getContentPane().add(txtnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 180, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Category");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price"
            }
        ));
        Table1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Table1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 297, 240));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Item Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Price");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        txtfood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfoodActionPerformed(evt);
            }
        });
        getContentPane().add(txtfood, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 150, -1));
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 150, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Quantity");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));
        getContentPane().add(txtquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 150, -1));

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        jButton3.setText("Add to Cart");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 650, 50, 20));

        Table2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Quantity", "Total"
            }
        ));
        jScrollPane2.setViewportView(Table2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 360, 250));

        jButton5.setText("Desert");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jButton6.setText("Main Course");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jButton7.setText("Drinks");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jButton4.setText("Generate Bill");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, -1, -1));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        txtbill.setColumns(20);
        txtbill.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtbill.setRows(5);
        txtbill.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtbill.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtbillAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(txtbill);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, 460, 380));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close2.jpg"))); // NOI18N
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 0, -1, -1));

        jButton8.setText("Print");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 540, 90, 30));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed
    private int rowCount1 = 0;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                        DefaultTableModel dtm = (DefaultTableModel) Table2.getModel();
                    dtm.setRowCount(rowCount1);
                String food = txtfood.getText();
                String pric = txtprice.getText();
                Object quantity=txtquantity.getValue();
                
                double p=Double.parseDouble((pric));
                double q=Double.parseDouble(quantity.toString());    
                double totalll=p*q;
                
                String total = Double.toString(totalll);

                Object[] row = {food, pric,quantity,total};
                dtm.addRow(row);
                 rowCount1++;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Table1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Table1AncestorAdded

    }//GEN-LAST:event_Table1AncestorAdded

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
   DefaultTableModel dtm = (DefaultTableModel) Table1.getModel();
        String food=dtm.getValueAt(Table1.getSelectedRow(),0).toString();
                String pric=dtm.getValueAt(Table1.getSelectedRow(),1).toString();
              
                txtfood.setText(food);
                txtprice.setText(pric);                                  

    }//GEN-LAST:event_Table1MouseClicked
    private int rowCount2 = 0;
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            Connection conn = FRONT.dbConnect();
                        DefaultTableModel dtm = (DefaultTableModel) Table1.getModel();
            dtm.setRowCount(0);
        try{
            Statement stmt=conn.createStatement();
            String query="select * from maincourse";
                    ResultSet result=stmt.executeQuery(query);
                     while (result.next()) {
                String food = result.getString("food");
                double pric = result.getDouble("price");
                


                Object[] row = {food, pric};
                dtm.addRow(row);
                rowCount2++;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed
    private int rowCount3 = 0;
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Connection conn = FRONT.dbConnect();
                    DefaultTableModel dtm = (DefaultTableModel) Table1.getModel();
                    dtm.setRowCount(0);
        try{
            Statement stmt=conn.createStatement();
            String query="select * from desert";
                    ResultSet result=stmt.executeQuery(query);
                     while (result.next()) {
                String desert = result.getString("desert");
                double pric = result.getDouble("price");
                

                Object[] row = {desert, pric};
                dtm.addRow(row);
                rowCount3++;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed
private int rowCount = 0;
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
                   Connection conn = FRONT.dbConnect();
                   DefaultTableModel dtm = (DefaultTableModel) Table1.getModel();
                   dtm.setRowCount(0);
        try{
            Statement stmt=conn.createStatement();
            String query="select * from drinks";
                    ResultSet result=stmt.executeQuery(query);
                     while (result.next()) {
                String drink = result.getString("drink");
                double pric = result.getDouble("price");
                
            

                Object[] row = {drink, pric};
                dtm.addRow(row);
            }
        }
        catch(Exception e){
            e.printStackTrace();
            rowCount++;
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtfoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfoodActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
            DefaultTableModel dtm = (DefaultTableModel) Table2.getModel();
    int rowCount = dtm.getRowCount();

    double totalAmount = 0.0;

    txtbill.setText(txtbill.getText()+"====================== Bill =======================\n");
      txtbill.setText(txtbill.getText()+"\t\t\t Dilibazar,kathmandu\n");
      txtbill.setText(txtbill.getText()+"\t\t\t Contact:.9817065857\n");
      txtbill.setText(txtbill.getText()+"Name:"+txtname.getText()+"\n");
      txtbill.setText(txtbill.getText()+"Mobile Number:"+txtnumber.getText());
      txtbill.setText(txtbill.getText()+"\n -------------------------------------------------------------------------------\n");
        txtbill.setText(txtbill.getText()+" Item"+"\t"+"Price"+"\t"+"Quantity"+"\t"+"Total"+"\n");
        for (int i = 0; i < rowCount; i++) {
            String item = (String) dtm.getValueAt(i, 0);
            String price = (String) dtm.getValueAt(i, 1);        
            int quantity = (int) dtm.getValueAt(i, 2); 
            String Total=  (String) dtm.getValueAt(i, 3);
            txtbill.setText(txtbill.getText()+item+"\t"+price+"\t"+quantity+"\t"+Total+"\n");
            double p=Double.parseDouble((price));
            double total=p*quantity;
            totalAmount+=total;
        }
      txtbill.setText(txtbill.getText()+"\n -------------------------------------------------------------------------------\n");
        txtbill.setText(txtbill.getText()+"\t\t\t Grand Total:"+totalAmount);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtbillAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtbillAncestorAdded
        
    }//GEN-LAST:event_txtbillAncestorAdded

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorAdded

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
                try{
            txtbill.print();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                            new PlaceOrder().setVisible(false);
                    dispose();
                    new dashboard().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
                             

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
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JTable Table2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtbill;
    private javax.swing.JTextField txtfood;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnumber;
    private javax.swing.JTextField txtprice;
    private javax.swing.JSpinner txtquantity;
    // End of variables declaration//GEN-END:variables
}
