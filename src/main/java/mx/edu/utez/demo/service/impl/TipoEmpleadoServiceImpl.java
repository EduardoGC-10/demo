/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utez.demo.service.impl;

import java.util.List;
import javax.transaction.Transactional;
import mx.edu.utez.demo.entity.TipoEmpleado;
import mx.edu.utez.demo.repository.TipoEmpleadoRepository;
import mx.edu.utez.demo.service.TipoEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author GABY
 */
@Service
@Transactional
public class TipoEmpleadoServiceImpl implements TipoEmpleadoService {

    @Autowired
    private TipoEmpleadoRepository tipoEmpleadoRepository;

    @Override
    public List<TipoEmpleado> findAll() {
        return tipoEmpleadoRepository.findAll();
    }

    @Override
    public TipoEmpleado findTipoEmpleadoByIdTipoEmpleado(Integer idTipoEmpleado) {
        return tipoEmpleadoRepository.findTipoEmpleadoByIdTipoEmpleado(idTipoEmpleado);
    }

}
