/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utez.demo.service.impl;

import java.util.List;
import javax.transaction.Transactional;
import mx.edu.utez.demo.converte.EmpleadoConverter;
import mx.edu.utez.demo.entity.Empleado;
import mx.edu.utez.demo.model.EmpleadoModel;
import mx.edu.utez.demo.repository.EmpleadoRepository;
import mx.edu.utez.demo.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alumno
 */
@Service
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private EmpleadoConverter empleadoConverter;

    @Override
    public List<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    @Override
    public Empleado findEmpleadoByIdEmpleado(Integer idEmpleado) {
        return empleadoRepository.findEmpleadoByIdEmpleado(idEmpleado);
    }

    @Override
    public EmpleadoModel findEmpleadoByIdModel(Integer id) {
        return empleadoConverter.convertEmpleadoToEmpleadoModel(empleadoRepository.findEmpleadoByIdEmpleado(id));
    }

    @Override
    public EmpleadoModel addEmpleado(EmpleadoModel empleadoModel) {
        // TODO Auto-generated method stub

        Empleado empleado = empleadoRepository.save(empleadoConverter.convertEmpleadoModelToEmpleado(empleadoModel));
        
        return empleadoConverter.convertEmpleadoToEmpleadoModel(empleado);

    }

}
