
package mx.edu.utez.demo.service.impl;

import java.util.List;
import javax.transaction.Transactional;
import mx.edu.utez.demo.entity.Tienda;
import mx.edu.utez.demo.repository.TiendaRepository;

import mx.edu.utez.demo.service.TiendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TiendaServiceImpl implements TiendaService{
     @Autowired
    private TiendaRepository tiendaRepository;

    @Override
    public List<Tienda> findAll() {
       return tiendaRepository.findAll();
    }

    @Override
    public Tienda findTiendaByIdTienda(Integer idTienda) {
        return tiendaRepository.findTiendaByIdTienda(idTienda);
    }
    
}
