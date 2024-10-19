/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.model.infrestruturas.Repositories;

import java.util.ArrayList;
import java.util.List;
import principal.model.Asignatura;
import principal.model.business.interfaces.Repositories.IAsignaturaRepository;





/**
 *
 * @author Estudiante
 */
public abstract class AsignaturaRepository  implements  IAsignaturaRepository {
    
    public static  List<Asignatura> asignaturaDb;
    private Asignatura roleFound;

    public AsignaturaRepository() {
        
        createAsignaturaDb();
    }
    
    
    private  void  createAsignaturaDb(){
        
        if(asignaturaDb == null){ 
            
            asignaturaDb = new ArrayList<>();
            
            
        
        
        }
    
    
    }

  
      @Override
    public Asignatura findAsignaturaById(int asignaturaId) throws Exception {
      if(asignaturaDb.isEmpty()){
          throw new Exception ("La Asignatura"+asignaturaId+"no existe");
          
      
      
      }   
      
      Asignatura  roleFound == null;
      for(Asignatura r :asignaturaDb  ){
          
          if (r.getId() == asignaturaId ){
               roleFound = r;
              
              break;
           
           
          
          }
      
      } 
      
      if(roleFound == null ){ 
          throw new Exception ("La Asignatura"+asignaturaId+"no existe");
      
      
      }   
      
      return roleFound;


    }

    @Override
    public Asignatura findAsignaturaByCalculo(String calculo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Asignatura findAsignaturaByfisicaMecanica(String fisicaMecanica) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Asignatura findAsignaturaByprclaseyobjeto(String prclaseyobjeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Asignatura findAsignaturaByestadistica(int estadistica) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int saveAsignatura(Asignatura asignatura) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editAsignatura(Asignatura asignatura) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int deleteAsignatura(int asignaturaId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Asignatura> getAsignaturaAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
