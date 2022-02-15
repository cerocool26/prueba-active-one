package com.pruebatecnica.active.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "detalle_alquiler")
public class DetalleAlquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item" , unique = true)
    private Long item;

    @Column(name = "dias_prestamo")
    private int diasPrestamo;

    @Column(name = "fecha_devolucion")
    private LocalDateTime fechaDevolucion;

    @ManyToOne
    @JoinColumn(name = "nro_alquiler")
    private Alquiler alquiler;

    @ManyToOne
    @JoinColumn(name = "nro_cd")
    private Cd cd;

    public DetalleAlquiler(){

    }

    public DetalleAlquiler(Long item, int diasPrestamo, LocalDateTime fechaDevolucion, Alquiler alquiler, Cd cd) {
        this.item = item;
        this.diasPrestamo = diasPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.alquiler = alquiler;
        this.cd = cd;
    }

    public Long getItem() {
        return item;
    }

    public void setItem(Long item) {
        this.item = item;
    }

    public int getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(int diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }

    public LocalDateTime getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDateTime fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    public Cd getCd() {
        return cd;
    }

    public void setCd(Cd cd) {
        this.cd = cd;
    }
}

