
package mx.edu.utez.demo.service;

import java.util.List;
import mx.edu.utez.demo.entity.Empleado;
import mx.edu.utez.demo.model.EmpleadoModel;

public interface EmpleadoService {
    public List<Empleado>findAll();
    public Empleado findEmpleadoByIdEmpleado(Integer idEmpleado);
    public abstract EmpleadoModel addEmpleado(EmpleadoModel empleadoModel);
    public abstract EmpleadoModel findEmpleadoByIdModel(Integer idEmpleado);
    
    public void removeEmpleado(int idEmpleado);
}
