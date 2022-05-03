package com.facturador.FacturadorRest.Controllers;


import com.facturador.FacturadorRest.Dto.ProductoDTO;
import com.facturador.FacturadorRest.Models.Producto;
import com.facturador.FacturadorRest.Services.ProductoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoControllers {

    private final ProductoService productoService;


    public ProductoControllers(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> allProductos() {
        return this.productoService.allProduct();
    }

    @PostMapping
    public Producto saveProducto(@RequestBody ProductoDTO productoDTO) {
        return this.productoService.createdProducto(productoDTO);
    }

    @DeleteMapping("/{id_producto}")
    public ResponseEntity<Void> deleteId(@PathVariable("id_producto") String id_producto) {
        this.productoService.deletedById(id_producto);
        return ResponseEntity.noContent().build();
    }
}
