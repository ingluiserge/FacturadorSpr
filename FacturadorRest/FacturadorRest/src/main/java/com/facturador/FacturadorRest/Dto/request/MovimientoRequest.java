package com.facturador.FacturadorRest.Dto.request;

import lombok.Data;

@Data
public class MovimientoRequest {
    private String idProducto;
    private int tipo;
    private int cantidad;
}
