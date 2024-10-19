/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.model;

import java.util.Date;

/**
 *
 * @author Asus Vivobook
 */
public class ComenTario {
    private String  texto;
    private Date fechayhora;
    private String autor;
    private String Reacion;
      

   
       
    public ComenTario(){
        
        
        this.texto = texto;
        this.fechayhora = fechayhora;
        this.autor = autor;
        this.Reacion = Reacion;
    }

    /**
     * @return the texto
     */
    private String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    private void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * @return the fechayhora
     */
    private Date getFechayhora() {
        return fechayhora;
    }

    /**
     * @param fechayhora the fechayhora to set
     */
    private void setFechayhora(Date fechayhora) {
        this.fechayhora = fechayhora;
    }

    /**
     * @return the autor
     */
    private String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    private void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the Reacion
     */
    private String getReacion() {
        return Reacion;
    }

    /**
     * @param Reacion the Reacion to set
     */
    private void setReacion(String Reacion) {
        this.Reacion = Reacion;
    }
    
}

