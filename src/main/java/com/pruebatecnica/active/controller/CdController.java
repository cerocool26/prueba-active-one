package com.pruebatecnica.active.controller;

import com.pruebatecnica.active.model.Cd;
import com.pruebatecnica.active.request.RequestCd;
import com.pruebatecnica.active.service.CdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/cd")
public class CdController {

    @Autowired
    private CdService cdService;

    public CdController(CdService cdService){
        this.cdService = cdService;
    }

    @GetMapping("/")
    public List<Cd> getAllCd(){
        return  cdService.getAllCd();
    }

    @GetMapping("/{nroCd}")
    public Cd getByCode(@PathVariable Long nroCd, HttpServletRequest request){
        return  cdService.getByNroCd( nroCd);
    }

    @PostMapping
    public Cd createCd(@RequestBody RequestCd requestCd, HttpServletRequest request){
        return cdService.createCd(requestCd);
    }

    @DeleteMapping("/{nroCd}")
    public void deleteCliente(@PathVariable Long nroCd, HttpServletRequest request){
        cdService.deleteCd(nroCd);
    }

    @PatchMapping("/{nroCd}")
    public Cd updateCd(@PathVariable Long nroCd,@RequestBody RequestCd requestCd){

        return cdService.updateCd(nroCd,requestCd);
    }
}
