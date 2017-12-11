/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utez.demo.repository;

import java.io.Serializable;
import mx.edu.utez.demo.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Alumno
 */
public interface EmpleadoRepository extends JpaRepository<Empleado,Serializable>{
    
    public Empleado findEmpleadoByIdEmpleado(Integer idEmpleado);
    
    
    
}
