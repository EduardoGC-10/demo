package mx.edu.utez.demo.service;

import java.util.List;
import mx.edu.utez.demo.entity.Producto;
import mx.edu.utez.demo.model.ProductoModel;

public interface ProductoService {

    public List<Producto> findAll();

    public Producto findProductoByIdProducto(Integer idProducto);

    public abstract ProductoModel addProducto(ProductoModel productoModel);

    public abstract ProductoModel findProductoByIdModel(Integer idProducto);

    public void removeProducto(int idProducto);

}
