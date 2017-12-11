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
@Table(name = "provedor")
@NamedQueries({
    @NamedQuery(name = "Provedor.findAll", query = "SELECT p FROM Provedor p")})
public class Provedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProvedor")
    private Integer idProvedor;
    @Size(max = 45)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "Empresa")
    private String empresa;
    @Size(max = 45)
    @Column(name = "Telefono")
    private String telefono;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proveedor", fetch = FetchType.LAZY)
    private List<TiendaProveedor> tiendaProveedorList;

    public Provedor() {
    }

    public Provedor(Integer idProvedor) {
        this.idProvedor = idProvedor;
    }

    public Integer getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(Integer idProvedor) {
        this.idProvedor = idProvedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
        hash += (idProvedor != null ? idProvedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Provedor)) {
            return false;
        }
        Provedor other = (Provedor) object;
        if ((this.idProvedor == null && other.idProvedor != null) || (this.idProvedor != null && !this.idProvedor.equals(other.idProvedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.utez.demo.entity.Provedor[ idProvedor=" + idProvedor + " ]";
    }
    
}
