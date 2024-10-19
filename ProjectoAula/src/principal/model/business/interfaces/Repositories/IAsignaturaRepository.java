/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package principal.model.business.interfaces.Repositories;

import java.util.List;
import principal.model.Asignatura;

/**
 *
 * @author Estudiante
 */
public interface IAsignaturaRepository {
    
    public Asignatura findAsignaturaById(int asignaturaId) throws Exception;
    public Asignatura findAsignaturaByCalculo(String calculo) throws Exception;
    public Asignatura findAsignaturaByfisicaMecanica(String  fisicaMecanica) throws Exception;
    public Asignatura findAsignaturaByprclaseyobjeto(String prclaseyobjeto) throws Exception;
    public Asignatura findAsignaturaByestadistica(int estadistica) throws Exception;
    public int  saveAsignatura(Asignatura asignatura) throws Exception;
    public void  editAsignatura(Asignatura asignatura) throws Exception;
    public int  deleteAsignatura(int asignaturaId) throws Exception;
    public List <Asignatura> getAsignaturaAll() throws Exception;
    
}