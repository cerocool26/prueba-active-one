package com.pruebatecnica.active.mapping;

import com.pruebatecnica.active.model.Cliente;
import com.pruebatecnica.active.request.RequestCliente;
import org.springframework.stereotype.Component;

@Component
public class ImplementClienteMapper implements ClienteMapper {

    @Override
    public Cliente getClientForCreated(RequestCliente requestCliente){

        Cliente cliente = new Cliente();

        cliente.setDireccionCliente( requestCliente.getDireccionCliente());
        cliente.setTelefono(requestCliente.getTelefono());
        cliente.setNombre(requestCliente.getNombre());
        cliente.setEmail(requestCliente.getEmail());
        cliente.setNroDni(requestCliente.getNroDni());
        cliente.setFechaNacimiento(requestCliente.getFechaNacimiento());
        cliente.setFechaInscripcion(requestCliente.getFechaInscripcion());
        cliente.setTemaInteres(requestCliente.getTemaInteres());
        cliente.setEstado(requestCliente.getEstado());

        return  cliente;
    }

    @Override
    public Cliente getClientForUpdated(Cliente cliente, RequestCliente requestCliente){
        cliente.setDireccionCliente( requestCliente.getDireccionCliente());
        cliente.setTelefono(requestCliente.getTelefono());
        cliente.setNombre(requestCliente.getNombre());
        cliente.setEmail(requestCliente.getEmail());
        cliente.setNroDni(requestCliente.getNroDni());
        cliente.setFechaNacimiento(requestCliente.getFechaNacimiento());
        cliente.setFechaInscripcion(requestCliente.getFechaInscripcion());
        cliente.setTemaInteres(requestCliente.getTemaInteres());
        cliente.setEstado(requestCliente.getEstado());

        return cliente;
    }

}
