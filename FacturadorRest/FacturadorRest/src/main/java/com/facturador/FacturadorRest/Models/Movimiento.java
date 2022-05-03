package com.facturador.FacturadorRest.Models;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "movimiento")
@Builder
public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "id_producto")
    private String idProducto;

    private int tipo;

    private int cantidad;
}
