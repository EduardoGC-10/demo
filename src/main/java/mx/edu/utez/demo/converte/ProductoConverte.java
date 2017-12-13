package mx.edu.utez.demo.converte;

import mx.edu.utez.demo.entity.Producto;
import mx.edu.utez.demo.entity.Tienda;
import mx.edu.utez.demo.model.ProductoModel;
import mx.edu.utez.demo.repository.TiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductoConverte {
    
    public Producto convertProductoModelToProducto(ProductoModel productoModel) {
        Producto producto = new Producto();
        producto.setIdProducto(productoModel.getIdProducto());
        producto.setTienda(productoModel.getTienda());
        producto.setNombreProducto(productoModel.getNombreProducto());
        producto.setClaveProducto(productoModel.getClaveProducto());
        producto.setPrecio(productoModel.getPrecio());
        producto.setTipoProducto(productoModel.getTipoProducto());
        return producto;
        
    }
    
    public ProductoModel convertProductoToProductoModel(Producto producto) {
        ProductoModel productoModel = new ProductoModel();
        productoModel.setIdProducto(producto.getIdProducto());
        productoModel.setNombreProducto(producto.getNombreProducto());
        productoModel.setClaveProducto(producto.getClaveProducto());
        productoModel.setPrecio(producto.getPrecio());
        productoModel.setTipoProducto(producto.getTipoProducto());
        productoModel.setTienda(producto.getTienda());
        productoModel.setIdTienda(producto.getTienda().getIdTienda());
        return productoModel;
        
    }
    
}
