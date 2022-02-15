package com.pruebatecnica.active.mapping;

import com.pruebatecnica.active.model.Cd;
import com.pruebatecnica.active.request.RequestCd;
import org.springframework.stereotype.Component;

@Component
public class ImplementCdMapper implements CdMapper {

    @Override
    public Cd getCdForCreated(RequestCd requestCd){
        Cd cd  =  new Cd() ;
        cd.getNroCd();
        cd.setCodigoTitulo(requestCd.getCodigoTitulo());
        cd.setCondicion(requestCd.getCondicion());
        cd.setUbicacion(requestCd.getUbicacion());
        cd.setEstado(requestCd.getEstado());

        return cd;
    }

    @Override
    public Cd getCdForUpdated(Cd cd, RequestCd requestCd){
        cd.setCodigoTitulo(requestCd.getCodigoTitulo());
        cd.setCondicion(requestCd.getCondicion());
        cd.setUbicacion(requestCd.getUbicacion());
        cd.setEstado(requestCd.getEstado());

        return  cd;
    }

}
