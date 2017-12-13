package mx.edu.utez.demo.service.impl;

import java.util.List;
import javax.transaction.Transactional;
import mx.edu.utez.demo.converte.ProductoConverte;
import mx.edu.utez.demo.entity.Producto;
import mx.edu.utez.demo.model.ProductoModel;
import mx.edu.utez.demo.repository.ProductoRepository;
import mx.edu.utez.demo.repository.TiendaRepository;
import mx.edu.utez.demo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private ProductoConverte productoConverter;

    @Autowired
    private TiendaRepository tiendaRepository;

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public void removeProducto(int idProducto) {
        Producto producto = findProductoByIdProducto(idProducto);
        if (producto != null) {
            productoRepository.delete(idProducto);
        }
    }

    @Override
    public Producto findProductoByIdProducto(Integer idProducto) {
        return productoRepository.findProductoByIdProducto(idProducto);
    }

    @Override
    public ProductoModel addProducto(ProductoModel productoModel) {
        Producto producto = productoConverter.convertProductoModelToProducto(productoModel);
        producto.setTienda(tiendaRepository.findOne(productoModel.getIdTienda()));
        productoRepository.save(producto);
        return productoConverter.convertProductoToProductoModel(producto);
    }

    @Override
    public ProductoModel findProductoByIdModel(Integer id) {
        return productoConverter.convertProductoToProductoModel(productoRepository.findProductoByIdProducto(id));
    }

}
