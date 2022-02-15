package com.pruebatecnica.active.mapping;

import com.pruebatecnica.active.model.Alquiler;
import com.pruebatecnica.active.model.Cliente;
import com.pruebatecnica.active.request.RequestAlquiler;

public interface AlquilerMapper {
    Alquiler getForCreatedAlquiler(RequestAlquiler requestAlquiler, Cliente cliente);

    Alquiler getForUpdatedAlquiler(Alquiler alquiler, RequestAlquiler requestAlquiler);

}
