package com.facturador.FacturadorRest.Repositorys;

import com.facturador.FacturadorRest.Models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto , String > { }
