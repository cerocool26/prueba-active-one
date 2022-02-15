package com.pruebatecnica.active.request;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class RequestAlquiler {

    private BigDecimal valorAlquiler;

    private LocalDateTime fechaAlquiler;

    private UUID codigoCliente;

    public RequestAlquiler(BigDecimal valorAlquiler, LocalDateTime fechaAlquiler, UUID codigoCliente) {
        this.valorAlquiler = valorAlquiler;
        this.fechaAlquiler = fechaAlquiler;
        this.codigoCliente = codigoCliente;
    }

    public BigDecimal getValorAlquiler() {
        return valorAlquiler;
    }

    public void setValorAlquiler(BigDecimal valorAlquiler) {
        this.valorAlquiler = valorAlquiler;
    }

    public LocalDateTime getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDateTime fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public UUID getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(UUID codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
}
