
package mx.edu.utez.demo.repository;

import java.io.Serializable;
import mx.edu.utez.demo.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ProductoRepository")
public interface ProductoRepository extends JpaRepository<Producto,Serializable>{
     public Producto findProductoByIdProducto(Integer idProducto);
    
}
