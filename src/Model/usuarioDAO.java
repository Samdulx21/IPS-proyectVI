/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.CallableStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Connection;

/**
 *
 * @author Millow
 */
public class usuarioDAO {
    
    Conexion conexion;
    
    public usuarioDAO (){
    
        conexion = new Conexion();
    }
    
     public ArrayList<Usuario> consultarlogin (String user, String pass){
          
          ArrayList listUser = new ArrayList();
          Usuario usuario;
          try {
              
              Connection accesoDB = conexion.getConexion();
              CallableStatement cs = accesoDB.prepareCall("{call LOGIN_CONSULTAR(?,?)}");
              cs.setString(1, user);
              cs.setString(2,pass);
              System.out.println(user+""+pass);
              ResultSet rs = cs.executeQuery();
              
              usuario = new Usuario();
              while (rs.next()){
                  usuario.setIdUser(rs.getInt("IdUSuario"));
                  usuario.setLoginUser(rs.getString("nombreUsuario"));
                  usuario.setUserPass(rs.getNString("claveUsuario"));
                  listUser.add(usuario);
              }
              
          } catch (Exception e){
              System.out.println(e.getMessage());
          }
          return listUser;
         }

}


