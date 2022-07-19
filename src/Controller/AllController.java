/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.AllController.Login;
import Model.DBConnection;
import Model.DBSearch;
import View.Home;
import View.Login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nadeesha
 */
public class AllController {
    public static void Customer(String Cusid, String Name, String Address, String Tel) {
        new Model.AddRecords().Customer(Cusid, Name, Address, Tel);
        JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void Material(String Mid, String Cid, String Name, String Price, String StockQty) {
        new Model.AddRecords().Material(Mid, Cid, Name, Price, StockQty);
        JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void Component(String ComID, String ComName, String Icode) {
        new Model.AddRecords().Component(ComID, ComName, Icode);
        JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void Item(String ICode, String IName, String Description, String SPrice) {
        new Model.AddRecords().Item(ICode, IName, Description, SPrice);
        JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void OrderPlace(String Oid, String Description, String OrDate, String DeDate, String Cusid) {
        new Model.AddRecords().OrderPlace(Oid, Description, OrDate, DeDate, Cusid);
        JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void OrderTransaction(String OrderNo, String ICode, String Qty) {
        new Model.AddRecords().OrderTransaction(OrderNo, ICode, Qty);
        JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void Supplier(String SupplierID, String SupplierName, String MatId) {
        new Model.AddRecords().Supplier(SupplierID, SupplierName, MatId);
        JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void Bom(String BomId, String Icode) {
        new Model.AddRecords().Bom(BomId, Icode);
        JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void BomTrans(String BomId, String Icode, String MatId, String Qty) {
        new Model.AddRecords().BomTrans(BomId, Icode, MatId, Qty);
        JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void SupplierOrder(String SupplierOId, String MatId, String SupplierId, String ReOQty) {
        new Model.AddRecords().SupplierOrder(SupplierOId, MatId, SupplierId, ReOQty);
        JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
    
   /* public static void AvailableOrder(String OrderId, String MatId, String RQty) {
        new Model.AddRecords().AvailableOrder(OrderId, MatId, RQty);
        JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }*/
    
    public static void Forecast(String ForecastId, String Forecast, String Icode) {
        new Model.AddRecords().Forecast(ForecastId, Forecast, Icode);
        JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void WeightForecast(String ForecastId, String Icode, String Forecast) {
        new Model.AddRecords().WeightForecast(ForecastId, Icode, Forecast);
        JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
    
     public static void Login(String UserName, String Pass){
        try {
            String username = null; //initial value of the username
            String password = null; //initial value of the username
            
            ResultSet rs = new DBSearch().SearchLogin(UserName);
            //process the query
            while(rs.next()){
                //assign database username to the variable
                username = rs.getString("UserName");
                //assign database password to the variable
                password = rs.getString("Password");
            }
            if(username != null && password != null){
                if(password.equals(Pass)) {
                    System.out.println("Login Successful!");
                Login.getFrames()[1].dispose();
//Login.getFrames()[1].dispose();
                new Home().setVisible(true);
                
                }
                else {
                    JOptionPane.showMessageDialog(null,"Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE);
            }
            DBConnection.closeCon();
        }
        catch (SQLException ex){
            Logger.getLogger(AllController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Login() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
