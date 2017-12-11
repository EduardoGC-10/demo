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
@Table(name = "tienda")
@NamedQueries({
    @NamedQuery(name = "Tienda.findAll", query = "SELECT t FROM Tienda t")})
public class Tienda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTienda")
    private Integer idTienda;
    @Size(max = 45)
    @Column(name = "Direccion")
    private String direccion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tienda", fetch = FetchType.LAZY)
    private List<Empleado> empleadoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tienda", fetch = FetchType.LAZY)
    private List<Caja> cajaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tienda", fetch = FetchType.LAZY)
    private List<Producto> productoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tienda", fetch = FetchType.LAZY)
    private List<TiendaProveedor> tiendaProveedorList;

    public Tienda() {
    }

    public Tienda(Integer idTienda) {
        this.idTienda = idTienda;
    }

    public Integer getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(Integer idTienda) {
        this.idTienda = idTienda;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    public List<Caja> getCajaList() {
        return cajaList;
    }

    public void setCajaList(List<Caja> cajaList) {
        this.cajaList = cajaList;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    public List<TiendaProveedor> getTiendaProveedorList() {
        return tiendaProveedorList;
    }

    public void setTiendaProveedorList(List<TiendaProveedor> tiendaProveedorList) {
        this.tiendaProveedorList = tiendaProveedorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTienda != null ? idTienda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tienda)) {
            return false;
        }
        Tienda other = (Tienda) object;
        if ((this.idTienda == null && other.idTienda != null) || (this.idTienda != null && !this.idTienda.equals(other.idTienda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.utez.demo.entity.Tienda[ idTienda=" + idTienda + " ]";
    }
    
}
