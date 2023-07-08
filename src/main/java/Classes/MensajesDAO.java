/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Model.Mensajes;
import com.mycompany.mensajesapp.Connection.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        Conexion dbConnect = new Conexion();
        
        
        try(Connection cone = dbConnect.get_Connection()){
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            String query = "select * from mensajes";
            ps = cone.prepareStatement(query);
            rs=ps.executeQuery();
                    
                    
            while(rs.next()){
                System.out.println("Id: "+rs.getInt("idMensaje")+"\n"
                + "Mensaje: "+rs.getString("mensaje")+"\n"
                + "Autor: "+rs.getString("autorMensaje")+"\n"
                + "Fecha: "+rs.getDate("fechaMensaje")+"\n");
            }
           
            
            
        }catch(SQLException e){
            System.out.println("Ocurrio un error: "+e);
        }
    }
    public static void borrarMensajeDB(int idMensaje){
         Conexion dbConnect = new Conexion();
         
         try(Connection cone = dbConnect.get_Connection()){
            
             PreparedStatement ps = null;
             
             try{
                    String query = "delete from mensajes where idMensaje=?";
                    ps=cone.prepareStatement(query);
                    ps.setInt(1, idMensaje);
                    ps.executeUpdate();
                    System.out.println("El mensaje ha sido borrado.\n");
            }catch(SQLException e){
                System.out.println(e);
            }

         }catch(SQLException e){
            System.out.println("Ocurrio un error: "+e);
        }
    }
    public static void actualizarMensajeDB(Mensajes mensaje){
        Conexion dbConnect = new Conexion();

        try(Connection cone = dbConnect.get_Connection()){
            
            PreparedStatement ps=null;
            
            try{
                String query = "update mensajes set mensaje = ? where idMensaje = ?";
                ps=cone.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setInt(2, mensaje.getIdMensaje());
                ps.executeUpdate();
                System.out.println("El mensaje se actualizo correctamente.");
            }catch(SQLException ex){
                System.out.println("El mensaje no se actualizo. "+ex);
            }
        }catch(SQLException e){
            System.out.println("Ocurrio un error: "+e);
        }
    }
}
