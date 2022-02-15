package com.pruebatecnica.active.controller;

import com.pruebatecnica.active.model.Cliente;
import com.pruebatecnica.active.request.RequestCliente;
import com.pruebatecnica.active.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @GetMapping("/")
    public List<Cliente> getAllClientes(){
        return  clienteService.getAllClientes();
    }

    @GetMapping("/{code}")
    public Cliente getByCode(@PathVariable String code, HttpServletRequest request){
        return  clienteService.getByCode(UUID.fromString(code));
    }

    @PostMapping
    public Cliente createCliente(@RequestBody RequestCliente requestCliente, HttpServletRequest request){
        return clienteService.createCliente(requestCliente);
    }

    @DeleteMapping("/{code}")
    public void deleteCliente(@PathVariable String code, HttpServletRequest request){
        clienteService.deleteCliente(UUID.fromString(code));
    }

    @PatchMapping("/{code}")
    public Cliente updateCliente(@PathVariable String code,@RequestBody RequestCliente requestCliente){

        return clienteService.updateCliente(UUID.fromString(code),requestCliente);
    }

}
