/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utez.demo.entity;

import java.io.Serializable;
import javax.persistence.Basic;
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
import javax.persistence.Table;

/**
 *
 * @author Alumno
 */
@Entity
@Table(name = "tienda_proveedor")
@NamedQueries({
    @NamedQuery(name = "TiendaProveedor.findAll", query = "SELECT t FROM TiendaProveedor t")})
public class TiendaProveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTienda_Proveedor")
    private Integer idTiendaProveedor;
    @JoinColumn(name = "Proveedor", referencedColumnName = "idProvedor")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Provedor proveedor;
    @JoinColumn(name = "Tienda", referencedColumnName = "idTienda")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tienda tienda;

    public TiendaProveedor() {
    }

    public TiendaProveedor(Integer idTiendaProveedor) {
        this.idTiendaProveedor = idTiendaProveedor;
    }

    public Integer getIdTiendaProveedor() {
        return idTiendaProveedor;
    }

    public void setIdTiendaProveedor(Integer idTiendaProveedor) {
        this.idTiendaProveedor = idTiendaProveedor;
    }

    public Provedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Provedor proveedor) {
        this.proveedor = proveedor;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTiendaProveedor != null ? idTiendaProveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiendaProveedor)) {
            return false;
        }
        TiendaProveedor other = (TiendaProveedor) object;
        if ((this.idTiendaProveedor == null && other.idTiendaProveedor != null) || (this.idTiendaProveedor != null && !this.idTiendaProveedor.equals(other.idTiendaProveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.utez.demo.entity.TiendaProveedor[ idTiendaProveedor=" + idTiendaProveedor + " ]";
    }
    
}
