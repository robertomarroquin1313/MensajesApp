/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mensajesapp;

import com.mycompany.mensajesapp.Connection.Conexion;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Roberto Marroquín
 */
public class MensajesApp {
  
    public static void main(String[] args) throws SQLException {
        
        Conexion conn = new Conexion();
        
        try(Connection cnx = conn.get_Connection()){
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
