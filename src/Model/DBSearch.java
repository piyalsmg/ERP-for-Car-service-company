/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Nadeesha
 */
public class DBSearch {
    
    private Statement stmt;
    private ResultSet rs;
    
  public ResultSet SearchCode(String c) throws Exception{
        return DBConnection.getStatementConnection().executeQuery(c);
  }
  
   public ResultSet SearchMid(String c) throws Exception{
        return DBConnection.getStatementConnection().executeQuery(c);
  }
  
   public ResultSet SearchBom(String c) throws Exception{
        return DBConnection.getStatementConnection().executeQuery(c);
  }
   
  public ResultSet SearchItem(String c) throws Exception{
        return DBConnection.getStatementConnection().executeQuery(c);
  }
   
    public ResultSet SearchCustomer(String c) throws Exception{
        return DBConnection.getStatementConnection().executeQuery(c);
  }
    
     public static int getMquantity(String c) throws Exception{
        return DBConnection.getStatementConnection().executeUpdate(c);
  }
    
     public ResultSet SearchOrder(String c) throws Exception{
        return DBConnection.getStatementConnection().executeQuery(c);
  }
     
      public ResultSet SearchSup(String c) throws Exception{
        return DBConnection.getStatementConnection().executeQuery(c);
  }
      
       public ResultSet SearchLogin(String UserName){
        
        try{
            stmt = DBConnection.getStatementConnection();
            String username = UserName;
            
            //execute the query
            rs = stmt.executeQuery("SELECT * FROM Login where UserName='" + username + "'");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
      
}
