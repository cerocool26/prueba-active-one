package com.pruebatecnica.active.repository;


import com.pruebatecnica.active.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    @Query("SELECT c FROM Cliente AS c WHERE c.codigoCliente = :code")
    Cliente findByCodeCliente(UUID code);
}
