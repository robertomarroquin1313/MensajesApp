/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Roberto Marroquín
 */
public class Mensajes {
    private int idMensaje;
    private String mensaje;
    private String autorMensaje;
    private String fecha;
    
    
    public Mensajes(){
        
    }
    
     public Mensajes(String mensaje, String autorMensaje, String fecha) {
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

   

    
}
