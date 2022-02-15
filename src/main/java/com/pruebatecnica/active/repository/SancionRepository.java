package com.pruebatecnica.active.repository;

import com.pruebatecnica.active.model.Sancion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SancionRepository extends JpaRepository<Sancion,Long> {


    @Query(value = "select createsancion()", nativeQuery = true)
    List<Sancion> createSancionAllClients();

}
