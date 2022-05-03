package com.facturador.FacturadorRest.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "producto")

public class Producto {

    @Id
    private String id_producto;
    private String nombre_producto;
    private int precio;
    private int stock;

}
