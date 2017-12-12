/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utez.demo.service;

import java.util.List;
import mx.edu.utez.demo.entity.Tienda;

/**
 *
 * @author GABY
 */
public interface TiendaService {
    public List<Tienda>findAll();
    
    public Tienda findTiendaByIdTienda(Integer idTienda);
//    public abstract EmpleadoModel addEmpleado(EmpleadoModel empleadoModel);
//    public abstract EmpleadoModel findEmpleadoByIdModel(Integer idEmpleado);
    
}
