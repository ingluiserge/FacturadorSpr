package com.facturador.FacturadorRest.Services;

import com.facturador.FacturadorRest.Dto.ProductoDTO;
import com.facturador.FacturadorRest.Dto.request.ListMovementRequest;
import com.facturador.FacturadorRest.Dto.request.MovimientoRequest;
import com.facturador.FacturadorRest.Dto.response.MovementResponse;
import com.facturador.FacturadorRest.Dto.response.MovementsResponse;
import com.facturador.FacturadorRest.Mappers.MovimientoMapper;
import com.facturador.FacturadorRest.Models.Movimiento;
import com.facturador.FacturadorRest.Models.Producto;
import com.facturador.FacturadorRest.Repositorys.MovementResponseRepository;
import com.facturador.FacturadorRest.Repositorys.MovimientoRepository;
import com.facturador.FacturadorRest.Repositorys.ProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MovimientoService {

    final private MovimientoRepository movimientoRepository;
    final private MovementResponseRepository movementResponseRepository;
    final private ProductoRepository productoRepository;
    final private MovimientoMapper movimientoMapper;


    public void create(MovimientoRequest request) {

        movimientoRepository.save(movimientoMapper.map(request));
    }

  /*
  public void create2(ListMovementRequest request) {
        request.getMovements().stream()
              .map(movimientoMapper::map) //
            .forEach(movimientoRepository::save);
}
*/
   // public Movimiento kreate(MovimientoRequest movimientoRequest){

     //   Movimiento movimiento =movimientoMapper.map(movimientoRequest);
       // return this.movimientoRepository.save(movimientoRequest);

      //return  this.movimientoRepository.save(movimientoMapper.map(movimientoRequest));
    //}



    public void create2(ListMovementRequest request) {

        for (MovimientoRequest movimientoRequest : request.getMovements()) {
            Movimiento movimiento = movimientoMapper.map(movimientoRequest);

            var producto = productoRepository.findById(movimiento.getIdProducto());

            if(producto.isPresent()) {
                var validProduct = producto.get();
                var multiplicador = movimiento.getTipo() == 2 ? 1 : -1; // elvis
                validProduct.setStock(validProduct.getStock() + (movimiento.getCantidad() * multiplicador));
                productoRepository.save(validProduct);
            }

            movimientoRepository.save(movimiento);
        }
    }

    public MovementsResponse getResume(String id) {
        return MovementsResponse.builder()
                .movements(movementResponseRepository.getResume(id))
                .build();
    }
}
