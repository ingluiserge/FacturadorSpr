package com.facturador.FacturadorRest.Models;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Cliente {

    @Id
    private String id_cliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;
}
