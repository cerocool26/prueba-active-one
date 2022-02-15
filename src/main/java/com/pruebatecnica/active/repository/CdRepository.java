package com.pruebatecnica.active.repository;


import com.pruebatecnica.active.model.Cd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CdRepository extends JpaRepository<Cd,Long> {

    @Query("SELECT c FROM Cd AS c WHERE c.nroCd = :nroCd")
    Cd findBynroCd(Long nroCd);
}
