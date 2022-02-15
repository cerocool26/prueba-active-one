package com.pruebatecnica.active.controller;

import com.pruebatecnica.active.model.Alquiler;
import com.pruebatecnica.active.request.RequestAlquiler;
import com.pruebatecnica.active.service.AlquilerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/alquiler")
public class AlquilerController {
    @Autowired
    private AlquilerService alquilerService;

    public AlquilerController(AlquilerService alquilerService){
        this.alquilerService = alquilerService;
    }

    @GetMapping("/")
    public List<Alquiler> getAllAlquiler(){
        return  alquilerService.getAllAlquiler();
    }

    @GetMapping("/{nroAlquiler}")
    public Alquiler getByNroAlquiler(@PathVariable Long nroAlquiler, HttpServletRequest request) {
        return alquilerService.getByNroAlquiler(nroAlquiler);
    }

    @PostMapping()
    public Alquiler createAlquiler(@RequestBody RequestAlquiler requestAlquiler, HttpServletRequest request){
        return alquilerService.createdAlquiler(requestAlquiler);
    }

    @DeleteMapping("/{nroAlquiler}")
    public void deleteAlquiler(@PathVariable Long nroAlquiler, HttpServletRequest request){
        alquilerService.deleteAlquiler(nroAlquiler);
    }

    @PatchMapping("/{nroAlquiler}")
    public Alquiler updateCd(@PathVariable Long nroAlquiler,@RequestBody RequestAlquiler requestAlquiler){

        return alquilerService.updatedAlquiler(nroAlquiler,requestAlquiler);
    }
}
