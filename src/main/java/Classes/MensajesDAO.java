/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Model.Mensajes;
import com.mycompany.mensajesapp.Connection.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Roberto Marroquín
 */
public class MensajesDAO extends Mensajes {
    
    
    public static void crearMensajeDB(Mensajes mensaje){
        Conexion dbConnect = new Conexion();
        
        
        try(Connection cone = dbConnect.get_Connection()){
            
            PreparedStatement ps = null;
            try{
                    String query = "INSERT INTO mensajes (mensaje, autorMensaje,fechaMensaje) VALUES (?,?,?);";
                    ps=cone.prepareStatement(query);
                    ps.setString(1, mensaje.getMensaje());
                    ps.setString(2, mensaje.getAutorMensaje());
                    ps.setDate(3, mensaje.getFecha());
                    ps.executeUpdate();
                    System.out.println("\nEl mensaje se creó correctamente");
            }catch(SQLException e){
                System.out.println(e);
            }
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public static void leerMensajeDB(){
        
    }
    public static void borrarMensajeDB(int idMensaje){
        
    }
    public static void actualizarMensajeDB(Mensajes mensaje){
        
    }
}
