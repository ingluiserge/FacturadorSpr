package com.facturador.FacturadorRest.Dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class MovementsResponse {
    private List<MovementResponse> movements;
}
