package com.facturador.FacturadorRest.Controllers;

import com.facturador.FacturadorRest.Dto.request.ListMovementRequest;
import com.facturador.FacturadorRest.Dto.request.MovimientoRequest;
import com.facturador.FacturadorRest.Dto.response.MovementsResponse;
import com.facturador.FacturadorRest.Services.MovimientoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movimientos")
@AllArgsConstructor
public class MovimientoControllers {


    final MovimientoService movimientoService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody MovimientoRequest request) {

        movimientoService.create(request);
    }

    @PostMapping("/batch")
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody ListMovementRequest request) {
        movimientoService.create2(request);
    }

    @GetMapping
    public MovementsResponse getResume(@RequestParam("productId") String id) {
        return movimientoService.getResume(id);
    }
}
