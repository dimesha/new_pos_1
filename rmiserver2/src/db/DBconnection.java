/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dimesha
 */
public class DBconnection {
private static DBconnection dBconnection;
private Connection connection;
   private DBconnection() {
    try {
        Class.forName("com.mysql.jdbc.Driver");
      
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
   public  static DBconnection getinstance(){
       if (dBconnection==null) {
           dBconnection=new DBconnection();
       }
       return dBconnection;
   } 
    
   public Connection getcoConnection(){
       return connection;
   }
}
