package com.facturador.FacturadorRest.Controllers;


import com.facturador.FacturadorRest.Models.Cliente;
import com.facturador.FacturadorRest.Services.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteControllers {


    private final ClienteService clienteService;


    public ClienteControllers(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> allCliente() {
        return this.clienteService.findAllClientes();
    }

    @PostMapping

    public Cliente createCliente(@RequestBody Cliente cliente) {
        return this.clienteService.saveCliente(cliente);
    }


    @PutMapping("/update/{id_cliente}")
    public Cliente editCliente(@RequestBody Cliente cliente) {
        return this.clienteService.updateCliente(cliente);
    }

    @DeleteMapping("/{id_cliente}")
    public ResponseEntity<Void> eliminarId(@PathVariable("id_cliente") String id_cliente) {
        this.clienteService.deleteCliente(id_cliente);
        return ResponseEntity.noContent().build();
    }

}
