package com.pruebatecnica.active.request;

public class RequestCd {
    private Long codigoTitulo;

    private String condicion;

    private String ubicacion;

    private String estado;

    public RequestCd(Long codigoTitulo, String condicion, String ubicacion, String estado) {
        this.codigoTitulo = codigoTitulo;
        this.condicion = condicion;
        this.ubicacion = ubicacion;
        this.estado = estado;
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
