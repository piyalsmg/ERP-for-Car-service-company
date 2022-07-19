/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AllController;
import Model.DBSearch;
import java.sql.ResultSet;

/**
 *
 * @author Nadeesha
 */
public class Supplier extends javax.swing.JFrame {

    /**
     * Creates new form Supplier
     */
    public Supplier() {
        initComponents();
        
        SearchMid();
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
        SupIdTF = new javax.swing.JTextField();
        SupNameTF = new javax.swing.JTextField();
        MatIdCMB = new javax.swing.JComboBox<>();
        SaveBTN = new javax.swing.JButton();
        ResetBTN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 255, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Adobe Caslon Pro", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Supplier Details");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 30, 340, 60);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Supplier ID :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 131, 122, 28);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Supplier Name :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 200, 160, 28);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Material ID :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 280, 124, 28);

        SupIdTF.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(SupIdTF);
        SupIdTF.setBounds(200, 128, 177, 40);

        SupNameTF.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(SupNameTF);
        SupNameTF.setBounds(230, 200, 239, 40);

        MatIdCMB.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(MatIdCMB);
        MatIdCMB.setBounds(210, 280, 151, 40);

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
        SaveBTN.setBounds(410, 360, 79, 37);

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
        ResetBTN.setBounds(290, 360, 87, 37);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/4.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(390, 80, 230, 240);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(530, 360, 83, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBTNActionPerformed
        // TODO add your handling code here:
        String Mid = MatIdCMB.getSelectedItem().toString();
        AllController.Supplier(SupIdTF.getText(), SupNameTF.getText(), Mid);
    }//GEN-LAST:event_SaveBTNActionPerformed

    private void ResetBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBTNActionPerformed
        // TODO add your handling code here:
        SupIdTF.setText("");
        SupNameTF.setText("");
    }//GEN-LAST:event_ResetBTNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Supplier.getFrames()[1].dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void SearchMid(){
        
        try{
           
            ResultSet rs = new DBSearch().SearchMid("Select * From Material");
            
            while(rs.next()) {
                MatIdCMB.addItem(rs.getString("MatId"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
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
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> MatIdCMB;
    private javax.swing.JButton ResetBTN;
    private javax.swing.JButton SaveBTN;
    private javax.swing.JTextField SupIdTF;
    private javax.swing.JTextField SupNameTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}