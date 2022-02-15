package com.pruebatecnica.active.model;


import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "cd")
public class Cd {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "nro_cd",unique = true)
    private Long nroCd;

    @Column(name = "codigo_titulo")
    private Long codigoTitulo;

    private String condicion;

    private String ubicacion;

    private String estado;

    @OneToMany(mappedBy="cd")
    private Set<DetalleAlquiler> detalleAlquileres;



    public Cd(){

    }

    public Cd(Long nroCd,Long codigoTitulo, String condicion, String ubicacion, String estado) {
        this.nroCd = nroCd;
        this.codigoTitulo = codigoTitulo;
        this.condicion = condicion;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    public Long getNroCd (){
        return nroCd;
    }

    public Long getCodigoTitulo() {
        return codigoTitulo;
    }

    public void setCodigoTitulo(Long codigoTitulo) {
        this.codigoTitulo = codigoTitulo;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
