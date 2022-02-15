package com.pruebatecnica.active.model;

import javax.persistence.*;

@Entity
@Table(name = "sancion")
public class Sancion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "nro_sancion", unique = true)
    private Long nroSancion;

    @ManyToOne
    @JoinColumn(name = "codigo_cliente")
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "nro_alquiler")
    private Alquiler alquiler;

    @Column(name = "tipo_sancion")
    private String tipoSancion;

    @Column(name = "nro_dias_sancion")
    private int nroDiasSancion;

    public Sancion(){

    }

    public Sancion(Long nroSancion, Cliente cliente, Alquiler alquiler, String tipoSancion, int nroDiasSancion) {
        this.nroSancion = nroSancion;
        this.cliente = cliente;
        this.alquiler = alquiler;
        this.tipoSancion = tipoSancion;
        this.nroDiasSancion = nroDiasSancion;
    }

    public Long getNroSancion() {
        return nroSancion;
    }

    public void setNroSancion(Long nroSancion) {
        this.nroSancion = nroSancion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    public String getTipoSancion() {
        return tipoSancion;
    }

    public void setTipoSancion(String tipoSancion) {
        this.tipoSancion = tipoSancion;
    }

    public int getNroDiasSancion() {
        return nroDiasSancion;
    }

    public void setNroDiasSancion(int nroDiasSancion) {
        this.nroDiasSancion = nroDiasSancion;
    }
}
