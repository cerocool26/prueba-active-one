package com.pruebatecnica.active.controller;

import com.pruebatecnica.active.model.Sancion;
import com.pruebatecnica.active.repository.SancionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sancion")
public class SancionController {

    @Autowired
    private SancionRepository sancionRepository;

    public SancionController(SancionRepository sancionRepository) {
        this.sancionRepository = sancionRepository;
    }

    @PostMapping
    public List<Sancion> createSanciones(){
        List<Sancion> sanciones =  sancionRepository.createSancionAllClients();
        return  sanciones;
    }

}
