/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utez.demo.repository;

import java.io.Serializable;
import mx.edu.utez.demo.entity.Tienda;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("tiendaRepository")
public interface TiendaRepository extends JpaRepository<Tienda,Serializable>{
    public Tienda findTiendaByIdTienda(Integer idTienda);
    
}
