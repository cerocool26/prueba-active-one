package com.pruebatecnica.active.service;

import com.pruebatecnica.active.mapping.AlquilerMapper;
import com.pruebatecnica.active.model.Alquiler;
import com.pruebatecnica.active.model.Cliente;
import com.pruebatecnica.active.repository.AlquilerRepository;
import com.pruebatecnica.active.repository.ClienteRepository;
import com.pruebatecnica.active.request.RequestAlquiler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlquilerService {

    @Autowired
    private AlquilerRepository alquilerRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private AlquilerMapper alquilerMapper;

    public AlquilerService(AlquilerRepository alquilerRepository, ClienteRepository clienteRepository){
        this.alquilerRepository = alquilerRepository;
    }

    public List<Alquiler> getAllAlquiler(){
        return alquilerRepository.findAll();
    }

    public Alquiler getByNroAlquiler(Long nroAlquiler){
        return  alquilerRepository.getById(nroAlquiler);
    }

    public Alquiler createdAlquiler(RequestAlquiler requestAlquiler){
        Cliente cliente = clienteRepository.findByCodeCliente(requestAlquiler.getCodigoCliente());

        return alquilerRepository.save(alquilerMapper.getForCreatedAlquiler(requestAlquiler,cliente));
    }

    public void deleteAlquiler(Long nroAlquiler){
        Alquiler alquiler = alquilerRepository.findBynroAlquiler(nroAlquiler);
        alquilerRepository.delete(alquiler);
    }

    public Alquiler updatedAlquiler(Long nroAlquiler,RequestAlquiler requestAlquiler){
        Alquiler alquiler = alquilerRepository.findBynroAlquiler(nroAlquiler);
        return alquilerRepository.save(alquilerMapper.getForUpdatedAlquiler(alquiler,requestAlquiler));
    }

}
