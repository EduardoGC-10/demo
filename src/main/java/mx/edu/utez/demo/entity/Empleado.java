/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utez.demo.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Alumno
 */
@Entity
@Table(name = "empleado")
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e")})
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEmpleado")
    private Integer idEmpleado;
    @Size(max = 45)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "Apellido1")
    private String apellido1;
    @Size(max = 45)
    @Column(name = "Apellido2")
    private String apellido2;
    @Column(name = "Telefono")
    private Integer telefono;
    @Column(name = "Sueldo")
    private Integer sueldo;
    @JoinColumn(name = "Tienda", referencedColumnName = "idTienda")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tienda tienda;
    @JoinColumn(name = "TipoEmpleado", referencedColumnName = "idTipoEmpleado")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tipoempleado tipoEmpleado;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleado", fetch = FetchType.LAZY)
    private List<Caja> cajaList;

    public Empleado() {
    }

    public Empleado(Integer idEmpleado,String nombre,String apellido1,String apellido2,Integer telefono,Integer sueldo) {
        this.idEmpleado = idEmpleado;
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.telefono=telefono;
        this.sueldo=sueldo;
        
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
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

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public Tipoempleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(Tipoempleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public List<Caja> getCajaList() {
        return cajaList;
    }

    public void setCajaList(List<Caja> cajaList) {
        this.cajaList = cajaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleado != null ? idEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.idEmpleado == null && other.idEmpleado != null) || (this.idEmpleado != null && !this.idEmpleado.equals(other.idEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.utez.demo.entity.Empleado[ idEmpleado=" + idEmpleado + ", nombre=" + nombre +", apellido1=" + apellido1 +", apellido2="+ apellido2 +" ]";
    }
    
}
