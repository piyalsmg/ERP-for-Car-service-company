/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AllController;
import Model.DBSearch;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nadeesha
 */
public class OrderPlace extends javax.swing.JFrame {

    Vector v = new Vector();
    Object listorder = new Object();
    
    /**
     * Creates new form OrderPlace
     */
    public OrderPlace() {
        initComponents();
        
        SearchCustomer();
        SearchCode();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        OrderNoTF = new javax.swing.JTextField();
        DescTF = new javax.swing.JTextField();
        CusIdCMB = new javax.swing.JComboBox<>();
        IcodeCMB = new javax.swing.JComboBox<>();
        ODateChooser = new com.toedter.calendar.JDateChooser();
        QtyTF = new javax.swing.JTextField();
        AddBTN = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        DeDateChooser = new com.toedter.calendar.JDateChooser();
        ResetBTN = new javax.swing.JButton();
        SaveBTN = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 255, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Adobe Caslon Pro", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Order Place");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(330, 30, 250, 70);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Order No. :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(49, 136, 120, 28);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Description :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(49, 198, 130, 28);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Qty :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(49, 313, 70, 28);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Customer ID :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(502, 136, 140, 28);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Item Code :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(49, 257, 120, 28);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Order Date :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(502, 198, 130, 28);

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Qty"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(381, 284, 367, 134);

        OrderNoTF.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(OrderNoTF);
        OrderNoTF.setBounds(180, 138, 200, 30);

        DescTF.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DescTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescTFActionPerformed(evt);
            }
        });
        jPanel1.add(DescTF);
        DescTF.setBounds(190, 200, 207, 28);

        CusIdCMB.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(CusIdCMB);
        CusIdCMB.setBounds(660, 130, 180, 40);

        IcodeCMB.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(IcodeCMB);
        IcodeCMB.setBounds(180, 260, 160, 28);
        jPanel1.add(ODateChooser);
        ODateChooser.setBounds(641, 200, 250, 30);

        QtyTF.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(QtyTF);
        QtyTF.setBounds(120, 310, 110, 30);

        AddBTN.setBackground(new java.awt.Color(0, 0, 0));
        AddBTN.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        AddBTN.setForeground(new java.awt.Color(255, 255, 255));
        AddBTN.setText("Add");
        AddBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBTNActionPerformed(evt);
            }
        });
        jPanel1.add(AddBTN);
        AddBTN.setBounds(172, 377, 73, 37);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Delivery Date :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(49, 485, 150, 28);
        jPanel1.add(DeDateChooser);
        DeDateChooser.setBounds(210, 490, 220, 30);

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
        ResetBTN.setBounds(560, 540, 87, 37);

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
        SaveBTN.setBounds(680, 540, 79, 37);

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
        jButton1.setBounds(800, 540, 83, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IMG-20190821-WA0058.jpg"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(170, 230, 730, 360);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DescTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescTFActionPerformed

    private void ResetBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBTNActionPerformed
        // TODO add your handling code here:
        OrderNoTF.setText("");
        DescTF.setText("");
        QtyTF.setText("");
    }//GEN-LAST:event_ResetBTNActionPerformed

    boolean add = false;
    private void SaveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBTNActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat();
        String OrDate = dateFormat.format(ODateChooser.getDate());
        String DeDate = dateFormat.format(DeDateChooser.getDate());
        String Cusid = CusIdCMB.getSelectedItem().toString();
        String code = IcodeCMB.getSelectedItem().toString();
        
     if(add == false) {
        AllController.OrderPlace(OrderNoTF.getText(), DescTF.getText(), OrDate, DeDate, Cusid);
        //add == true;
    }                                       

    int x = 0;
    while(x<v.size())
    {
        String ob = (String) v.get(x);
        JOptionPane.showMessageDialog(null, "Display...Cid:" + ob);
        StringTokenizer tn = new StringTokenizer(ob, ",");
        
        while(tn.hasMoreTokens())
        {
            String Icode = tn.nextToken();
            //int Qty = Integer.parseInt(tn.nextToken());
            String Qty = tn.nextToken();
            AllController.OrderTransaction(OrderNoTF.getText(), Icode, Qty);
        }
        x++;
    }
    }//GEN-LAST:event_SaveBTNActionPerformed

    private void AddBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBTNActionPerformed
        // TODO add your handling code here:
         int x = 0, y = 0;
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnCount(0);
        
        model = (DefaultTableModel)jTable1.getModel();
        //model.addRow(new Object[]{icodeCmb.getSelectedItem(),qtyTF.getText()});
       Object[]r = new Object[]{IcodeCMB.getSelectedItem(), QtyTF.getText()};
       model.addRow(r);
       String str = r[x]+","+r[x+1];
        JOptionPane.showMessageDialog(null, "Hiii " + r[x]+ " " + r[x+1]);
       v.add(y, str);
       y++;
    }//GEN-LAST:event_AddBTNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        OrderPlace.getFrames()[1].dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

     public void SearchCustomer(){
        
        try{
           
            ResultSet rs = new DBSearch().SearchCustomer("Select * From Customer");
            
            while(rs.next()) {
                CusIdCMB.addItem(rs.getString("CusId"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void SearchCode(){
        try{
            ResultSet rs = new DBSearch().SearchCode("Select Icode From Item");
            while(rs.next()) {
                IcodeCMB.addItem(rs.getString("Icode"));
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
            java.util.logging.Logger.getLogger(OrderPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderPlace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBTN;
    private javax.swing.JComboBox<String> CusIdCMB;
    private com.toedter.calendar.JDateChooser DeDateChooser;
    private javax.swing.JTextField DescTF;
    private javax.swing.JComboBox<String> IcodeCMB;
    private com.toedter.calendar.JDateChooser ODateChooser;
    private javax.swing.JTextField OrderNoTF;
    private javax.swing.JTextField QtyTF;
    private javax.swing.JButton ResetBTN;
    private javax.swing.JButton SaveBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}