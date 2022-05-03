package com.facturador.FacturadorRest.Repositorys;

import com.facturador.FacturadorRest.Models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente , String> { }
