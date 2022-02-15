package com.pruebatecnica.active.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "alquiler")
public class Alquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "nro_alquiler", unique = true)
    private Long nroAlquiler;

    @Column(name = "fecha_alquiler")
    private LocalDateTime fechaAlquiler;

    @Column(name = "valor_alquiler")
    private BigDecimal valorAlquiler;

    @ManyToOne
    @JoinColumn(name = "codigo_cliente")
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "nro_sancion")
    private Sancion sancion;

    @OneToMany(mappedBy="alquiler")
    private Set<DetalleAlquiler> detalleAlquileres;



    public Alquiler(){

    }

    public Alquiler(Long nroAlquiler, LocalDateTime fechaAlquiler, BigDecimal valorAlquiler, Cliente cliente, Sancion sancion) {
        this.nroAlquiler = nroAlquiler;
        this.fechaAlquiler = fechaAlquiler;
        this.valorAlquiler = valorAlquiler;
        this.cliente = cliente;
        this.sancion = sancion;
    }

    public Long getNroAlquiler() {
        return nroAlquiler;
    }

    public void setNroAlquiler(Long nroAlquiler) {
        this.nroAlquiler = nroAlquiler;
    }

    public LocalDateTime getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDateTime fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public BigDecimal getValorAlquiler() {
        return valorAlquiler;
    }

    public void setValorAlquiler(BigDecimal valorAlquiler) {
        this.valorAlquiler = valorAlquiler;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sancion getSancion() {
        return sancion;
    }

    public void setSancion(Sancion sancion) {
        this.sancion = sancion;
    }
}
