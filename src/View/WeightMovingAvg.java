/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AllController;
import Model.DBSearch;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nadeesha
 */
public class WeightMovingAvg extends javax.swing.JFrame {

    /**
     * Creates new form WeightMovingAvg
     */
    
    Vector v = new Vector();
    int m1, m2, m3;
    
    public WeightMovingAvg() {
        initComponents();
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        IcodeCMB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        oneTF = new javax.swing.JTextField();
        TwoTF = new javax.swing.JTextField();
        ThreeTF = new javax.swing.JTextField();
        ForecastTF = new javax.swing.JTextField();
        CalBTN = new javax.swing.JButton();
        SaveBTN = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        FcastIdTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 255, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Adobe Caslon Pro", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Weight Moving Average");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 30, 500, 80);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Item Code :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 210, 113, 28);

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Month", "Sales"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 290, 300, 130);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Weight Forecast Value : ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 530, 250, 28);

        IcodeCMB.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(IcodeCMB);
        IcodeCMB.setBounds(180, 210, 154, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Weight");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(620, 120, 70, 28);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("1st Period :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(530, 180, 82, 22);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("2nd Period :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(530, 240, 88, 22);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("3rd Period :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(530, 310, 85, 22);

        oneTF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        oneTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneTFActionPerformed(evt);
            }
        });
        jPanel1.add(oneTF);
        oneTF.setBounds(660, 180, 147, 23);

        TwoTF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(TwoTF);
        TwoTF.setBounds(660, 240, 141, 23);

        ThreeTF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ThreeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreeTFActionPerformed(evt);
            }
        });
        jPanel1.add(ThreeTF);
        ThreeTF.setBounds(660, 300, 144, 23);

        ForecastTF.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(ForecastTF);
        ForecastTF.setBounds(320, 530, 190, 40);

        CalBTN.setBackground(new java.awt.Color(0, 0, 0));
        CalBTN.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        CalBTN.setForeground(new java.awt.Color(255, 255, 255));
        CalBTN.setText("Calculate");
        CalBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalBTNActionPerformed(evt);
            }
        });
        jPanel1.add(CalBTN);
        CalBTN.setBounds(80, 460, 129, 37);

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
        SaveBTN.setBounds(550, 580, 79, 37);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Forecast Id :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 140, 120, 28);

        FcastIdTF.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(FcastIdTF);
        FcastIdTF.setBounds(190, 142, 170, 30);

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
        jButton1.setBounds(710, 580, 83, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/13.jpg"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(540, 350, 290, 220);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oneTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oneTFActionPerformed

    private void CalBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalBTNActionPerformed
        // TODO add your handling code here:
          try{
                ResultSet rs = new DBSearch().SearchItem("select OrderPlace.OrDate,sum(OrderTransaction.Qty) from OrderPlace , OrderTransaction where OrderPlace.OrderNo=OrderTransaction.OrderNo  and OrderTransaction.Icode='"+IcodeCMB.getSelectedItem()+"'"+"group by month(OrderPlace.OrDate)");
                DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
            dtm.setRowCount(0);
            Vector v = null;
            //int lastmonth=0; 
            int count=0;
            while(rs.next()){
                String mon=rs.getString(1);
                String q1=rs.getString(2);
                
                v = new Vector();
                //v.add(odate);
                v.add(mon);
                v.add(q1);
                dtm.addRow(v);
                count++;
            }
            rs.first();
            int newcount=count-2;
            rs.absolute(newcount);
            //jTextField5.setText(rs.getString(2));
            m1=Integer.parseInt(rs.getString(2));
            rs.absolute(newcount+1);               
            //jTextField6.setText(rs.getString(2));
            m2=Integer.parseInt(rs.getString(2));
            rs.absolute(newcount+2);
            //jTextField7.setText(rs.getString(2));
            m3=Integer.parseInt(rs.getString(2));
            
            }
            
        catch(Exception e){ 
            System.out.println("");
            e.printStackTrace();
            
        }
         
          float p1 = Float.parseFloat(oneTF.getText());
          float p2 = Float.parseFloat(TwoTF.getText());
          float p3 = Float.parseFloat(ThreeTF.getText());
          float f1 = m1 * (p1/100);
          float f2 = m1 * (p2/100);
          float f3 = m1 * (p3/100);
          
            float Qty = f1+f2+f3;
            ForecastTF.setText(Double.toString(Qty));
   
    }//GEN-LAST:event_CalBTNActionPerformed

    private void SaveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBTNActionPerformed
        // TODO add your handling code here:
        String Icode = IcodeCMB.getSelectedItem().toString();
        AllController.WeightForecast(FcastIdTF.getText(), Icode, ForecastTF.getText());
        ClearField();
    }//GEN-LAST:event_SaveBTNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        WeightMovingAvg.getFrames()[1].dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ThreeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThreeTFActionPerformed

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
            java.util.logging.Logger.getLogger(WeightMovingAvg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WeightMovingAvg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WeightMovingAvg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WeightMovingAvg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WeightMovingAvg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalBTN;
    private javax.swing.JTextField FcastIdTF;
    private javax.swing.JTextField ForecastTF;
    private javax.swing.JComboBox<String> IcodeCMB;
    private javax.swing.JButton SaveBTN;
    private javax.swing.JTextField ThreeTF;
    private javax.swing.JTextField TwoTF;
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
    private javax.swing.JTextField oneTF;
    // End of variables declaration//GEN-END:variables

    private void ClearField() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
