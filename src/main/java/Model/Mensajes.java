/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author Roberto Marroquín
 */
public class Mensajes {
    private int idMensaje;
    private String mensaje;
    private String autorMensaje;
    private Date fecha;
    
    
    public Mensajes(){
        
    }
    
     public Mensajes(String mensaje, String autorMensaje, Date fecha) {
        this.mensaje = mensaje;
        this.autorMensaje = autorMensaje;
        this.fecha = fecha;
    }

    
    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutorMensaje() {
        return autorMensaje;
    }

    public void setAutorMensaje(String autorMensaje) {
        this.autorMensaje = autorMensaje;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

   

    
}
