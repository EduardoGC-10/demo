package mx.edu.utez.demo.model;

import mx.edu.utez.demo.entity.Tienda;

public class ProductoModel {

    private int idProducto;
    private String nombreProducto;
    private String tipoProducto;
    private String claveProducto;
    private double precio;
    private int idTienda;
    private Tienda tienda;

    public ProductoModel() {
        super();
    }

    public ProductoModel(int idProducto, String nombreProducto, String tipoProducto, String claveProducto, double precio, int idTienda, Tienda tienda) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.tipoProducto = tipoProducto;
        this.claveProducto = claveProducto;
        this.precio = precio;
        this.idTienda = idTienda;
        this.tienda = tienda;
    }

    

    
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getClaveProducto() {
        return claveProducto;
    }

    public void setClaveProducto(String claveProducto) {
        this.claveProducto = claveProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }


}
