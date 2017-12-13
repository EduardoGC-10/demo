/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utez.demo.converte;

import mx.edu.utez.demo.entity.Empleado;
import mx.edu.utez.demo.entity.Tienda;
import mx.edu.utez.demo.entity.TipoEmpleado;
import mx.edu.utez.demo.model.EmpleadoModel;
import mx.edu.utez.demo.repository.TiendaRepository;
import mx.edu.utez.demo.repository.TipoEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author usuario
 */
@Component
public class EmpleadoConverter {
    @Autowired
    private TipoEmpleadoRepository tipoEmpleadoRepository;

    @Autowired
    private TiendaRepository tiendaRepository;

    public Empleado convertEmpleadoModelToEmpleado(EmpleadoModel empleadoModel) {

        Empleado empleado = new Empleado();
        //Buscamos los objetos de la llaves foraneas
        
        Tienda tienda= tiendaRepository.findTiendaByIdTienda(empleadoModel.getTienda());
        
        TipoEmpleado tipoEmpleado=tipoEmpleadoRepository.findTipoEmpleadoByIdTipoEmpleado(empleadoModel.getTipoEmpleado());
        empleado.setIdEmpleado(empleadoModel.getId());
        empleado.setNombre(empleadoModel.getNombre());
        empleado.setApellido1(empleadoModel.getApellido1());
        empleado.setApellido2(empleadoModel.getApellido2());
        empleado.setTelefono(empleadoModel.getTelefono());
        empleado.setSueldo(empleadoModel.getSueldo());
        empleado.setTienda(tienda);
        empleado.setTipoEmpleado(tipoEmpleado);
        
        return empleado;
    }
    public EmpleadoModel convertEmpleadoToEmpleadoModel(Empleado empleado) {

        EmpleadoModel empleadoModel = new EmpleadoModel();
        empleadoModel.setId(empleado.getIdEmpleado());
        empleadoModel.setNombre(empleado.getNombre());
        empleadoModel.setApellido1(empleado.getApellido1());
        empleadoModel.setApellido2(empleado.getApellido2());
        empleadoModel.setTelefono(empleado.getTelefono());
        empleadoModel.setSueldo(empleado.getSueldo());
        empleadoModel.setTienda(empleado.getTienda().getIdTienda());
        empleadoModel.setTipoEmpleado(empleado.getTipoEmpleado().getIdTipoEmpleado());
        return empleadoModel;
    }

}
