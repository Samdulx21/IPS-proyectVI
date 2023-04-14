/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Millow
 */
public class Conexion {
    
     String bd = "users";
     String login = "root";
     String password = "";
     String url = "jdbc:mysql://localhost:3306/"+bd;
     String driver = "com.mysql.cj.jdbc.Driver";
     
     
     public Conexion (){
         
     }
    
     public Connection getConexion(){
         
         Connection con = null;
         try {
             Class.forName(driver);
             con = DriverManager.getConnection(url, login, password);
         } catch (Exception e) {
             
         } 
         if (con != null){
             System.out.println("Conexcion Exitosa");
         }
         else{
             System.out.println("ERROR EN LA BASE DE DATOS");
         }
         return con;
         
     }
    
    
    
}
