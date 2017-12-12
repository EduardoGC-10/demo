/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utez.demo.repository;

import java.io.Serializable;
import mx.edu.utez.demo.entity.TipoEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author GABY
 */
@Repository("TipoEmpleadoRepository")
public interface TipoEmpleadoRepository extends JpaRepository<TipoEmpleado,Serializable>{
    public TipoEmpleado findTipoEmpleadoByIdTipoEmpleado(Integer idTipoEmpleado);
}
