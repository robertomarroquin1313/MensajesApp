/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajesapp.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Roberto Marroquín
 */
public class Conexion {
    public Connection get_Connection(){
        Connection connection = null;
        
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes","root","1425368dd");
            
            if(connection !=null){
                System.out.println("Conexion Exitosa");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return connection;
    }
    
}
