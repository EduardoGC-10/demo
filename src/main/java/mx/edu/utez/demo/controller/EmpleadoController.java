/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utez.demo.controller;

import mx.edu.utez.demo.entity.Empleado;
import mx.edu.utez.demo.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Alumno
 */
@Controller
@RequestMapping("empleado")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;
    
    //@RequestMapping(value="goEmpleado",method=RequestMethod.GET)
    @GetMapping("goEmpleado")
    public String goEmpleado(Model model){
        model.addAttribute("empleado", empleadoService.findAll());
        return "empleado";
    }
    @GetMapping("empleadoForm")
    public String empleadoForm(Model model){
        model.addAttribute("empleadoF", new Empleado());
        return "saveEmpleado";
    };
}
