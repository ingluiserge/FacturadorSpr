package com.facturador.FacturadorRest.Services;


import com.facturador.FacturadorRest.Dto.ProductoDTO;
import com.facturador.FacturadorRest.Mappers.ProductoInDTOToProducto;
import com.facturador.FacturadorRest.Models.Producto;
import com.facturador.FacturadorRest.Repositorys.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductoService {

    private  final ProductoRepository repository;
    private final ProductoInDTOToProducto mapper;

    public ProductoService(ProductoRepository repository, ProductoInDTOToProducto mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    public List<Producto> allProduct(){

        return this.repository.findAll();
    }

    public Producto createdProducto(ProductoDTO productoDTO){
       // Producto producto = mapper.map(productoDTO);
        //return this.repository.save(producto);

        return  this.repository.save(mapper.map(productoDTO));

    }

    public void deletedById(String id_producto) {
        Optional<Producto> optionalProducto = this.repository.findById(id_producto);
        if (optionalProducto.isEmpty()){

            throw new RuntimeException("no existe el producto");

        }
        this.repository.deleteById(id_producto);

    }
}
