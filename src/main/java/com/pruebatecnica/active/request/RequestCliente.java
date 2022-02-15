package com.pruebatecnica.active.request;

import java.time.LocalDateTime;

public class RequestCliente {

    private String direccionCliente;

    private Long telefono;

    private String nombre;

    private String email;

    private String nroDni;

    private LocalDateTime fechaNacimiento;

    private LocalDateTime fechaInscripcion;

    private String temaInteres;

    private String estado;

    public RequestCliente(String direccionCliente, Long telefono, String nombre, String email, String nroDni, LocalDateTime fechaNacimiento, LocalDateTime fechaInscripcion, String temaInteres, String estado) {
        this.direccionCliente = direccionCliente;
        this.telefono = telefono;
        this.nombre = nombre;
        this.email = email;
        this.nroDni = nroDni;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaInscripcion = fechaInscripcion;
        this.temaInteres = temaInteres;
        this.estado = estado;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNroDni() {
        return nroDni;
    }

    public void setNroDni(String nroDni) {
        this.nroDni = nroDni;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDateTime getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDateTime fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getTemaInteres() {
        return temaInteres;
    }

    public void setTemaInteres(String temaInteres) {
        this.temaInteres = temaInteres;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
