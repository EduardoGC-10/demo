
package mx.edu.utez.demo.model;

import mx.edu.utez.demo.entity.Tienda;
import mx.edu.utez.demo.entity.TipoEmpleado;


public class EmpleadoModel {
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Integer telefono;
    private Integer sueldo;
    private int tienda;
    private int tipoEmpleado;

    public EmpleadoModel() {
        super();
    }

    public EmpleadoModel(int id, String nombre, String apellido1, String apellido2, Integer telefono, Integer sueldo, int tienda, int tipoEmpleado) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.tienda = tienda;
        this.tipoEmpleado = tipoEmpleado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public int getTienda() {
        return tienda;
    }

    public void setTienda(int tienda) {
        this.tienda = tienda;
    }

    public int getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(int tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    
}