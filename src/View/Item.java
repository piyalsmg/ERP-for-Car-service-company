/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AllController;

/**
 *
 * @author Nadeesha
 */
public class Item extends javax.swing.JFrame {

    /**
     * Creates new form Item
     */
    public Item() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ResetBTN = new javax.swing.JButton();
        SaveBTN = new javax.swing.JButton();
        IcodeTF = new javax.swing.JTextField();
        DescTF = new javax.swing.JTextField();
        SpriceTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        INameTF = new javax.swing.JTextField();
        SaveBTN1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 255, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Adobe Caslon Pro", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Item Details");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(224, 30, 260, 60);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Item Code :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 120, 120, 28);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Description :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 270, 123, 28);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Selling Price :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 350, 132, 28);

        ResetBTN.setBackground(new java.awt.Color(0, 0, 0));
        ResetBTN.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        ResetBTN.setForeground(new java.awt.Color(255, 255, 255));
        ResetBTN.setText("Reset");
        ResetBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBTNActionPerformed(evt);
            }
        });
        jPanel1.add(ResetBTN);
        ResetBTN.setBounds(350, 460, 100, 37);

        SaveBTN.setBackground(new java.awt.Color(0, 0, 0));
        SaveBTN.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        SaveBTN.setForeground(new java.awt.Color(255, 255, 255));
        SaveBTN.setText("Save");
        SaveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBTNActionPerformed(evt);
            }
        });
        jPanel1.add(SaveBTN);
        SaveBTN.setBounds(480, 460, 79, 37);

        IcodeTF.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(IcodeTF);
        IcodeTF.setBounds(190, 120, 190, 40);

        DescTF.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(DescTF);
        DescTF.setBounds(200, 270, 210, 40);

        SpriceTF.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SpriceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpriceTFActionPerformed(evt);
            }
        });
        jPanel1.add(SpriceTF);
        SpriceTF.setBounds(200, 350, 160, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Name :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 190, 70, 28);

        INameTF.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(INameTF);
        INameTF.setBounds(150, 190, 190, 40);

        SaveBTN1.setBackground(new java.awt.Color(0, 0, 0));
        SaveBTN1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        SaveBTN1.setForeground(new java.awt.Color(255, 255, 255));
        SaveBTN1.setText("Back");
        SaveBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBTN1ActionPerformed(evt);
            }
        });
        jPanel1.add(SaveBTN1);
        SaveBTN1.setBounds(590, 460, 90, 37);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IMG-20190821-WA0054.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(180, 120, 520, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResetBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBTNActionPerformed
        // TODO add your handling code here:
        IcodeTF.setText("");
        INameTF.setText("");
        DescTF.setText("");
        SpriceTF.setText("");
    }//GEN-LAST:event_ResetBTNActionPerformed

    private void SaveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBTNActionPerformed
        // TODO add your handling code here:
         AllController.Item(IcodeTF.getText(), INameTF.getText(), DescTF.getText(), SpriceTF.getText());
        ClearField();
    }//GEN-LAST:event_SaveBTNActionPerformed

    private void SpriceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpriceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SpriceTFActionPerformed

    private void SaveBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBTN1ActionPerformed
        // TODO add your handling code here:
        Item.getFrames()[1].dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_SaveBTN1ActionPerformed

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
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Item().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DescTF;
    private javax.swing.JTextField INameTF;
    private javax.swing.JTextField IcodeTF;
    private javax.swing.JButton ResetBTN;
    private javax.swing.JButton SaveBTN;
    private javax.swing.JButton SaveBTN1;
    private javax.swing.JTextField SpriceTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void ClearField() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}