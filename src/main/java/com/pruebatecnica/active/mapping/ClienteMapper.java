package com.pruebatecnica.active.mapping;


import com.pruebatecnica.active.model.Cliente;
import com.pruebatecnica.active.request.RequestCliente;

public interface ClienteMapper {

    Cliente getClientForCreated(RequestCliente requestCliente);

    Cliente getClientForUpdated(Cliente cliente , RequestCliente requestCliente);
}
