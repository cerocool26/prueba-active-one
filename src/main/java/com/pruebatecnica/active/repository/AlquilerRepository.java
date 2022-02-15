package com.pruebatecnica.active.repository;


import com.pruebatecnica.active.model.Alquiler;
import com.pruebatecnica.active.model.Cd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AlquilerRepository extends JpaRepository<Alquiler,Long> {

    @Query("SELECT a FROM Alquiler AS a WHERE a.nroAlquiler = :nroAlquiler")
    Alquiler findBynroAlquiler(Long nroAlquiler);
}
