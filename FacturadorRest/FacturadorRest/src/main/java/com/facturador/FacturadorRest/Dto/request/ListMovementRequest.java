package com.facturador.FacturadorRest.Dto.request;

import lombok.Data;

import java.util.List;

@Data
public class ListMovementRequest {
    private List<MovimientoRequest> movements;
}
