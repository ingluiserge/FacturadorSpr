package com.facturador.FacturadorRest.Services;

import com.facturador.FacturadorRest.Repositorys.ClienteRepository;
import org.springframework.stereotype.Service;
import com.facturador.FacturadorRest.Models.Cliente;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {


    private final ClienteRepository Repository;

    public ClienteService(ClienteRepository repository) {

        Repository = repository;
    }


    public List<Cliente> findAllClientes() {
        return this.Repository.findAll();

    }

    public Cliente saveCliente(Cliente cliente) {

        return this.Repository.save(cliente);
    }

    public Cliente updateCliente(Cliente cliente) {

        if (cliente.getId_cliente() != null && Repository.existsById(cliente.getId_cliente())) {
            return Repository.save(cliente);
        }
        return null;
    }

    public void deleteCliente(String id_cliente) {

        Optional<Cliente> optionalCliente = this.Repository.findById(id_cliente);
        if (optionalCliente.isEmpty()) {

            throw new RuntimeException("no existe el cliente");

        }
        this.Repository.deleteById(id_cliente);
    }
}
