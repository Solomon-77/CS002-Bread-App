/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Eustaquio
 */
import javax.swing.*;
import java.util.*;

public class CheckOutScreen extends javax.swing.JFrame {

    static void setText(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Creates new form MainLogin
     */
    public CheckOutScreen() {
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

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        closeBTN = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        receiptAREA = new javax.swing.JTextArea();
        voucherCODE = new javax.swing.JTextField();
        addonCHEESE = new javax.swing.JRadioButton();
        addonMAYO = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        backBTN = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        payBALANCE = new javax.swing.JPanel();
        payLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        totalAMOUNT = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(49, 52, 52));
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(49, 52, 52));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setForeground(new java.awt.Color(187, 89, 26));
        jPanel2.setLayout(null);

        closeBTN.setBackground(java.awt.Color.white);
        closeBTN.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        closeBTN.setForeground(java.awt.Color.white);
        closeBTN.setText("x");
        closeBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBTNMouseClicked(evt);
            }
        });
        jPanel2.add(closeBTN);
        closeBTN.setBounds(390, 7, 18, 17);

        receiptAREA.setColumns(20);
        receiptAREA.setRows(5);
        jScrollPane1.setViewportView(receiptAREA);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(40, 100, 340, 230);

        voucherCODE.setBackground(new java.awt.Color(49, 52, 52));
        voucherCODE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        voucherCODE.setForeground(new java.awt.Color(204, 204, 204));
        voucherCODE.setText("Voucher Code");
        voucherCODE.setBorder(null);
        voucherCODE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voucherCODEActionPerformed(evt);
            }
        });
        jPanel2.add(voucherCODE);
        voucherCODE.setBounds(40, 40, 100, 20);

        addonCHEESE.setForeground(java.awt.Color.white);
        addonCHEESE.setText("Extra-Cheese");
        addonCHEESE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addonCHEESEActionPerformed(evt);
            }
        });
        jPanel2.add(addonCHEESE);
        addonCHEESE.setBounds(110, 70, 100, 21);

        addonMAYO.setForeground(java.awt.Color.white);
        addonMAYO.setText("Extra-Mayo");
        jPanel2.add(addonMAYO);
        addonMAYO.setBounds(210, 70, 98, 21);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Add-Ons:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(40, 70, 60, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("____________________");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 50, 110, 16);

        jPanel4.setBackground(new java.awt.Color(187, 89, 26));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apply Voucher");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(160, 40, 110, 20);

        jPanel3.setBackground(java.awt.Color.white);

        backBTN.setBackground(new java.awt.Color(187, 89, 26));
        backBTN.setForeground(new java.awt.Color(187, 89, 26));
        backBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBTNMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("MENU");

        javax.swing.GroupLayout backBTNLayout = new javax.swing.GroupLayout(backBTN);
        backBTN.setLayout(backBTNLayout);
        backBTNLayout.setHorizontalGroup(
            backBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backBTNLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backBTNLayout.setVerticalGroup(
            backBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.black);
        jLabel2.setText("Total Amount Due:");

        payBALANCE.setBackground(new java.awt.Color(187, 89, 26));
        payBALANCE.setForeground(new java.awt.Color(187, 89, 26));
        payBALANCE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payBALANCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payBALANCEMouseClicked(evt);
            }
        });

        payLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        payLabel.setForeground(java.awt.Color.white);
        payLabel.setText("PAY BALANCE");

        javax.swing.GroupLayout payBALANCELayout = new javax.swing.GroupLayout(payBALANCE);
        payBALANCE.setLayout(payBALANCELayout);
        payBALANCELayout.setHorizontalGroup(
            payBALANCELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payBALANCELayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(payLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        payBALANCELayout.setVerticalGroup(
            payBALANCELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(payLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(40, 40, 61));
        jLabel3.setText("P");

        totalAMOUNT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalAMOUNT.setForeground(new java.awt.Color(40, 40, 61));
        totalAMOUNT.setText("" + MenuScreen.totalAmount2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalAMOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totalAMOUNT, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(payBALANCE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(payBALANCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBTNMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBTNMouseClicked

    private void voucherCODEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voucherCODEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voucherCODEActionPerformed

    private void addonCHEESEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addonCHEESEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addonCHEESEActionPerformed

    private void backBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBTNMouseClicked
        MenuScreen menu = new MenuScreen();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBTNMouseClicked
    public static float total1;
    public static float totalAmount1;
    
    private void payBALANCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payBALANCEMouseClicked

        if(AddBalancePOPUP.bal >= MenuScreen.totalAmount2 && MenuScreen.totalAmount2 != 0) {
            AddBalancePOPUP.bal = AddBalancePOPUP.bal - MenuScreen.totalAmount2;
            JOptionPane.showMessageDialog(this, "Payment Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            receiptAREA.setEditable(false);
            
            //-------------------------- receipt ------------------------------
            
            Date thisDate = new Date();
            receiptAREA.append("Receipt");
            receiptAREA.append("\n----------------------------------------------------------------------------");
            receiptAREA.append("\nDate:\t" + thisDate);
            receiptAREA.append("\nName:\t" + MenuScreen.menuUSER.getText());
            receiptAREA.append("\nBalance:\tP" + MenuScreen.totalBalance.getText());
            receiptAREA.append("\n----------------------------------------------------------------------------");
            receiptAREA.append("\nItems\tQuantity ");
            receiptAREA.append("\nBaguette\t" + MenuScreen.qtyA2);
            receiptAREA.append("\nCroissant\t" + MenuScreen.qtyB2);
            receiptAREA.append("\nGold Leaf\t" + MenuScreen.qtyC2);
            receiptAREA.append("\nSourDough\t" + MenuScreen.qtyD2);
            receiptAREA.append("\n----------------------------------------------------------------------------");
            receiptAREA.append("\nTotal Amount:\tP" + MenuScreen.totalAmount2);
            if (addonMAYO.isSelected()) {
                receiptAREA.append("\nAddons:\t" + addonMAYO.getText());
            }
            if (addonCHEESE.isSelected()) {
                receiptAREA.append("\nAddons:\t" + addonCHEESE.getText());
            }
            receiptAREA.append("\nChange:\tP" + AddBalancePOPUP.bal);
            
            total1 = MenuScreen.totalAmount2 + AddBalancePOPUP.bal;
            totalAmount1 = MenuScreen.totalAmount2;
            // ---------------------- end of receipt -------------------------
            
            // set cart and total amount due to 0 after the result of receipt
            MenuScreen.qtyA2 = 0;
            MenuScreen.qtyB2 = 0;
            MenuScreen.qtyC2 = 0;
            MenuScreen.qtyD2 = 0;
            MenuScreen.totalAmount2 = 0;
            CheckOutScreen.totalAMOUNT.setText("" + MenuScreen.totalAmount2);
            
        } else if (AddBalancePOPUP.bal < MenuScreen.totalAmount2) {
            JOptionPane.showMessageDialog(this, "Insufficient Balance.", "Add Balance Needed", JOptionPane.ERROR_MESSAGE);
        } else if (MenuScreen.totalAmount2 == 0) {
            JOptionPane.showMessageDialog(this, "Select your bread option first.", "Add Cart Needed", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_payBALANCEMouseClicked
    public static String[] voucherCodes = {"TIPSTUDENT", "NILASANTIAGO", "GROUP7"};
    
    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        String voucher = voucherCODE.getText();
        if (voucher.equals(voucherCodes[0]) || voucher.equals(voucherCodes[1]) || voucher.equals(voucherCodes[2])) {
            float total = (float) (MenuScreen.totalAmount2 * .10);
            MenuScreen.totalAmount2 -= total;
            totalAMOUNT.setText("" + MenuScreen.totalAmount2);
            JOptionPane.showMessageDialog(this, "Voucher Applied Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jPanel4MouseClicked

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
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton addonCHEESE;
    private javax.swing.JRadioButton addonMAYO;
    private javax.swing.JPanel backBTN;
    private javax.swing.JLabel closeBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel payBALANCE;
    private javax.swing.JLabel payLabel;
    public static javax.swing.JTextArea receiptAREA;
    public static javax.swing.JLabel totalAMOUNT;
    private javax.swing.JTextField voucherCODE;
    // End of variables declaration//GEN-END:variables
}
