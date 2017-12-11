/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utez.demo.controller.rest;

import java.util.List;
import mx.edu.utez.demo.entity.Empleado;
import mx.edu.utez.demo.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("empleados")
public class EmpleadoRestController {
    
    @Autowired
    private EmpleadoService empleadoService;
    
    @GetMapping
    public List<Empleado>getAll(){
       return empleadoService.findAll();
    }
    
    @GetMapping ("{id}")
    public Empleado getEmpleadoById(@PathVariable ("id")Integer idEmpleado){
        return empleadoService.findEmpleadoByIdEmpleado(idEmpleado);
    }    
}
