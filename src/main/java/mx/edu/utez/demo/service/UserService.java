
package mx.edu.utez.demo.service;

import java.util.List;
import mx.edu.utez.demo.entity.User;
import mx.edu.utez.demo.model.UsuariosModel;

public interface UserService {
     public List<User>findAll();
     /*aqui no tien id*/
    public User findUserBy(Integer idEmpleado);
    public abstract UsuariosModel addEmpleado(UsuariosModel User);
    /*aqui no tien id*/
    public abstract UsuariosModel findEmpleadoByIdModel(Integer idEmpleado);
    /*aqui no tien id*/
    public void removeUsuario(int idEmpleado);
    
}
