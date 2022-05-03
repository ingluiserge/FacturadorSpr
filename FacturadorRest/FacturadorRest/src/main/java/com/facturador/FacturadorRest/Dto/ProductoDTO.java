package com.facturador.FacturadorRest.Dto;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class ProductoDTO {


    private String id_producto;
    private String nombre_producto;
    private int precio;
    private int stock;



}
