package com.pruebatecnica.active.service;


import com.pruebatecnica.active.mapping.CdMapper;
import com.pruebatecnica.active.model.Cd;
import com.pruebatecnica.active.model.Cliente;
import com.pruebatecnica.active.repository.CdRepository;
import com.pruebatecnica.active.request.RequestCd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CdService {

    @Autowired
    private CdRepository cdRepository;

    @Autowired
    private CdMapper cdMapper;

    public CdService(CdRepository cdRepository, CdMapper cdMapper){
        this.cdRepository = cdRepository;
        this.cdMapper = cdMapper;
    }

    public List<Cd> getAllCd(){
        return cdRepository.findAll();
    }

    public Cd getByNroCd(Long nroCd){
        return cdRepository.findBynroCd(nroCd);
    }

    public Cd createCd(RequestCd requestCd){
        return  cdRepository.save(cdMapper.getCdForCreated(requestCd));
    }

    public void deleteCd(Long nroCd){
        Cd cd =cdRepository.findBynroCd(nroCd);
        cdRepository.delete(cd);
    }

    public Cd updateCd(Long nroCd ,RequestCd requestCd){
        Cd cd = cdRepository.getById(nroCd);

        return cdRepository.save(cdMapper.getCdForUpdated(cd,requestCd));
    }
}
