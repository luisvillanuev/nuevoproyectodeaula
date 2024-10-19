/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.model;

import  java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Asus Vivobook
 */
public class Asignatura {

    public static boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   private int id;
   private String Calculo;
   private String fisicaMecanica;
   private String prclaseyobjeto;
   private String estadistica;
   private List<Estudiante> estudiante;
   
   private static  AtomicInteger  incrementid;  
    
   
    /**
     *
     */
     public Asignatura(){
       
       id = getincrementid(); 
        
   
   
   }

    public Asignatura(String Calculo, String fisicaMecanica, String prclaseyobjeto, String estadistica) throws Exception {
        
        
        if(Calculo == null || Calculo.trim().isEmpty()){
         throw new Exception("EL Calculo es requirido");  
         }
        
        if(fisicaMecanica == null || fisicaMecanica.trim().isEmpty()){
         throw new Exception("EL fisicaMecanica es requirido");
         }
        if(prclaseyobjeto == null || prclaseyobjeto.trim().isEmpty()){
         throw new Exception("EL prclaseyobjeto es requirido");
         }
        if( estadistica== null || estadistica.trim().isEmpty()){
         throw new Exception("EL estadistica es requirido");
         }
         
         
        this.Calculo = Calculo;
        this.fisicaMecanica = fisicaMecanica;
        this.prclaseyobjeto = prclaseyobjeto;
        this.estadistica = estadistica;
        id = getincrementid();
    }

    
  
   
   
   
   
   
    public String getCalculo() {
        return Calculo;
    }

    /**
     * @param Calculo the Calculo to set
     */
    private void setCalculo(String Calculo) {
        this.Calculo = Calculo;
    }

            /**
     * @return the fisicaMecanica
     */
    private String getFisicaMecanica() {
        return fisicaMecanica;
    }

    /**
     * @param fisicaMecanica the fisicaMecanica to set
     */
    private void setFisicaMecanica(String fisicaMecanica) {
        this.fisicaMecanica = fisicaMecanica;
    }

    /**
     * @return the prclaseyobjeto
     */
    private String getPrclaseyobjeto() {
        return prclaseyobjeto;
    }

    /**
     * @param prclaseyobjeto the prclaseyobjeto to set
     */
    private void setPrclaseyobjeto(String prclaseyobjeto) {
        this.prclaseyobjeto = prclaseyobjeto;
    }

    /**
     * @return the estadistica
     */
    private String getEstadistica() {
        return estadistica;
    }

    /**
     * @param estadistica the estadistica to set
     */
    private void setEstadistica(String estadistica) {
        this.estadistica = estadistica;
    }
           
           
       
       private  int getincrementid(){
           
           if(incrementid ==  null) {
           
           incrementid = new AtomicInteger(1);
           
    
       }
       
        return incrementid.incrementAndGet(); 
       
           
       
       
       }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getfisicaMecanica() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
   
   
        
}