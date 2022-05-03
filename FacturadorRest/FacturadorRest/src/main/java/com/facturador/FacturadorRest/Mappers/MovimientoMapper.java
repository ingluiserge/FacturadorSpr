package com.facturador.FacturadorRest.Mappers;

import com.facturador.FacturadorRest.Dto.request.MovimientoRequest;
import com.facturador.FacturadorRest.Models.Movimiento;
import org.springframework.stereotype.Component;

@Component
public class MovimientoMapper implements IMapper<MovimientoRequest, Movimiento>{

    @Override
    public Movimiento map(MovimientoRequest in) {
        return Movimiento.builder()
                .id(0)
                .idProducto(in.getIdProducto())
                .tipo(in.getTipo())
                .cantidad(in.getCantidad())
                .build();
    }
}
