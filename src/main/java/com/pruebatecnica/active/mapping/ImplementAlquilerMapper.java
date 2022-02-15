package com.pruebatecnica.active.mapping;

import com.pruebatecnica.active.model.Alquiler;
import com.pruebatecnica.active.model.Cliente;
import com.pruebatecnica.active.request.RequestAlquiler;
import org.springframework.stereotype.Component;

@Component
public class ImplementAlquilerMapper implements AlquilerMapper{

    @Override
    public Alquiler getForCreatedAlquiler(RequestAlquiler requestAlquiler, Cliente cliente){
        Alquiler alquiler =  new Alquiler();
        alquiler.getNroAlquiler();
        alquiler.setFechaAlquiler(requestAlquiler.getFechaAlquiler());
        alquiler.setValorAlquiler(requestAlquiler.getValorAlquiler());
        alquiler.setCliente(cliente);

        return alquiler;
    }

    @Override
    public Alquiler getForUpdatedAlquiler(Alquiler alquiler,RequestAlquiler requestAlquiler){

        alquiler.setFechaAlquiler(requestAlquiler.getFechaAlquiler());
        alquiler.setValorAlquiler(requestAlquiler.getValorAlquiler());

        return alquiler;
    }


}
