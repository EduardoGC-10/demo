
package mx.edu.utez.demo.service;

import java.util.List;
import mx.edu.utez.demo.entity.User;
import mx.edu.utez.demo.model.UsuariosModel;

public interface UserService {    
    public List<User>findAll();
     /*aqui no tien id*/
    public User findUserBy(Integer idUsuario);
    public abstract UsuariosModel addUsuario(UsuariosModel User);
    /*aqui no tien id*/
    public abstract UsuariosModel findUsuarioByIdModel(Integer idUsuario);
    /*aqui no tien id*/
    public void removeUsuario(String username);
    
}
