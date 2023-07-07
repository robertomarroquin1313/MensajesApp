/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mensajesapp;

import Service.MensajesService;
import com.mycompany.mensajesapp.Connection.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Roberto Marroquín
 */
public class MensajesApp {
  
    public static void main(String[] args) throws SQLException {
        
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        
        
        do{
            System.out.println("-----MENU-----");
            System.out.println("APLICACION DE MENSAJES");
            System.out.println("--------------");
            System.out.println("1. Crear mensajes\n"
                    + "2. Listar mensajes\n"
                    + "3. Editar mensaje\n"
                    + "4. Eliminar mensaje\n"
                    + "5. Salir de la aplicacion\n");
            
            op = entrada.nextInt();
            
            
            switch(op){
                case 1:
                    MensajesService.crearMensajeDB();
                    break;  
                case 2:
                    MensajesService.editarMensajeDB();
                    break;
                case 3:
                    MensajesService.editarMensajeDB();
                    break;
                case 4:
                    MensajesService.borrarMensajeDB();
                    break;
                default:
            }
        }while(op!=5);
        
    }
    
}
