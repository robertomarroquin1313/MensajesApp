/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Classes.MensajesDAO;
import Model.Mensajes;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Roberto Marroquín
 */
public class MensajesService {
    public static void crearMensajeDB() throws ParseException{
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escribe tu mensaje: ");
        String ms = entrada.nextLine();
        
        
        System.out.print("Ingresa tu nombre: ");
        String nom = entrada .nextLine();
        
  
        
       //hacemos setting con los datos requeridos
        Mensajes mensaje = new Mensajes();
        mensaje.setMensaje(ms);
        mensaje.setAutorMensaje(nom);
        mensaje.setFecha( Date.valueOf(LocalDate.now()));
        //Enviamos el Mensaje a la clase DAO para que ejecute el statement
        MensajesDAO.crearMensajeDB(mensaje);
        
        
  
        
        
     
    }
    
    public static void listarMensajeDB(){
        
    }
    public static void borrarMensajeDB(){
        
    }
    public static void editarMensajeDB(){
        
    }
}
