package com.pruebatecnica.active.service;

import com.pruebatecnica.active.mapping.ClienteMapper;
import com.pruebatecnica.active.model.Cliente;
import com.pruebatecnica.active.repository.ClienteRepository;
import com.pruebatecnica.active.request.RequestCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    @Autowired
    private ClienteMapper clienteMapper;



    public ClienteService(ClienteRepository clienteRepository,ClienteMapper clienteMapper){
        this.clienteRepository = clienteRepository;
        this.clienteMapper =  clienteMapper;
    }


    public List<Cliente> getAllClientes(){
        return clienteRepository.findAll();
    }

    public Cliente getByCode(UUID code){
       return clienteRepository.findByCodeCliente(code);
    }

    public Cliente createCliente(RequestCliente requestCliente){

        return clienteRepository.save(clienteMapper.getClientForCreated(requestCliente));
    }

    public void deleteCliente(UUID code){
       Cliente cliente =clienteRepository.findByCodeCliente(code);
       clienteRepository.delete(cliente);
    }

    public Cliente updateCliente(UUID code,RequestCliente requestCliente){
        Cliente cliente = clienteRepository.findByCodeCliente(code);

        return clienteRepository.save(clienteMapper.getClientForUpdated(cliente,requestCliente));

    }

}
