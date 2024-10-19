/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.model;

import principal.model.Asignatura;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Asus Vivobook
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String gmail;  
    private String codigo;
    private String programa;
    private Asignatura asignatura;

    public Estudiante(String nombre, String apellido, String gmail, int id, String codigo, String programa, Asignatura asignatura) throws Exception {
            if(nombre == null || nombre.trim().isEmpty()){
            throw new Exception("EL nombre es requirido");
             
            }
            
            if(apellido == null || apellido.trim().isEmpty()){
         throw new Exception("EL apellido es requirido");
         }
            
           
             if(gmail == null || gmail.trim().isEmpty()){
         throw new Exception("EL gmail es requirido");
         }
             
              if(codigo == null || codigo.trim().isEmpty()){
         throw new Exception("EL id es requirido");
         }
              
             if(programa == null || programa.trim().isEmpty()){
         throw new Exception("EL gmail es requirido");
         }
         
        
        
        
            if(asignatura == null){
                throw new Exception("La asignatura  es requerida");
            
            }
        
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.gmail = gmail;
        this.codigo = codigo;
        this.programa = programa;
        this.asignatura = asignatura;
    }
    
    
    
    
   
    /**
     * @return the nombre
     */
    private String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    private String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the gmail
     */
    private String getGmail() {
        return gmail;
    }

    /**
     * @param gmail the gmail to set
     */
    private void setGmail(String gmail) {
        this.gmail = gmail;
    }

    /**
     * @return the codigo
     */
    private String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    private void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
     
}
