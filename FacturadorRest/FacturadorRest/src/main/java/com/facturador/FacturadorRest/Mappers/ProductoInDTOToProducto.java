package com.facturador.FacturadorRest.Mappers;

import com.facturador.FacturadorRest.Dto.ProductoDTO;
import com.facturador.FacturadorRest.Models.Producto;
import org.springframework.stereotype.Component;

@Component
public class ProductoInDTOToProducto implements IMapper<ProductoDTO, Producto> {


    public Producto map(ProductoDTO in){

        Producto producto = new Producto();

        producto.setId_producto(in.getId_producto());
        producto.setNombre_producto(in.getNombre_producto());
        producto.setPrecio(in.getPrecio());
        producto.setStock(0);

        return producto;
    }

}
