/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Nadeesha
 */
public class AddRecords {
    Statement stmt;
    
    public void Customer(String CusID, String CusName, String Address, String Tel){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO Customer VALUES('"+CusID+"', '"+CusName+"', '"+Address+"', '"+Tel+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void Material(String MatID, String MatName, String Price, String ComID, String SQty){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO Material VALUES('"+MatID+"', '"+MatName+"', '"+Price+"', '"+ComID+"', '"+SQty+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
     public void Component(String ComID, String ComName, String Icode){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO Component VALUES('"+ComID+"', '"+ComName+"', '"+Icode+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
     
      public void Item(String ICode, String IName, String Description, String SPrice){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO Item VALUES('"+ICode+"', '"+IName+"', '"+Description+"', '"+SPrice+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
      
      public void OrderPlace(String OrderNo, String Description, String OrDate, String DeDate, String Cusid){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO OrderPlace VALUES('"+OrderNo+"', '"+Description+"', '"+OrDate+"', '"+DeDate+"', '"+Cusid+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
     public void OrderTransaction(String OrderNo, String ICode, String Qty){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO OrderTransaction VALUES('"+OrderNo+"', '"+ICode+"', '"+Qty+"')");
            
          /*  if(y>0)
            {
                JOptionPane.showMessageDialog(null,"Successfully added.");
            }*/
        }
        catch(Exception e){
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Added Transaction Num already exist. Please enter new Transaction Num.");
        }
    }
     
     public void Supplier(String SupplierID, String SupplierName, String MatId){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO Supplier VALUES('"+SupplierID+"', '"+SupplierName+"', '"+MatId+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
     
    public void Bom(String BomId, String Icode){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO Bom VALUES('"+BomId+"', '"+Icode+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
     
    public void BomTrans(String BomId, String Icode, String MatId, String Qty){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO BomTrans VALUES('"+BomId+"', '"+Icode+"', '"+MatId+"', '"+Qty+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
      
    public void SupplierOrder(String SupplierOId, String MatId, String SupplierId, String ReOQty){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO SupplierOrder VALUES('"+SupplierOId+"', '"+MatId+"', '"+SupplierId+"', '"+ReOQty+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
  /*  public void AvailableOrder(String OrderId, String MatId, String RQty){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO AvailableOrder VALUES('"+OrderId+"', '"+MatId+"', '"+RQty+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }*/
    
    public void Forecast(String ForecastId, String Forecast, String Icode){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO Forecast VALUES('"+ForecastId+"', '"+Forecast+"', '"+Icode+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void WeightForecast(String ForecastId, String Icode, String Forecast){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO WeightForecast VALUES('"+ForecastId+"', '"+Icode+"', '"+Forecast+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
}
