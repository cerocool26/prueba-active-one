package com.pruebatecnica.active.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @Column(name = "codigo_cliente", nullable = false, unique = true)
    private UUID codigoCliente = UUID.randomUUID();

    @Column(name = "direccion_cliente")
    private String direccionCliente;

    private Long telefono;

    private String nombre;

    private String email;

    @Column(name = "numero_dni")
    private String nroDni;

    @Column(name = "fecha_nacimiento")
    private LocalDateTime fechaNacimiento;

    @Column(name = "fecha_inscripcion")
    private LocalDateTime fechaInscripcion = LocalDateTime.now(ZoneOffset.UTC);

    @Column(name = "tema_interes")
    private String temaInteres;

    private String estado;

    @OneToMany(mappedBy="cliente")
    private Set<Alquiler> alquieres;

    @OneToMany(mappedBy="cliente" )
    private Set<Sancion> sanciones;



    public Cliente(){

    }

    public Cliente(UUID codigoCliente, String direccionCliente, Long telefono, String nombre, String email, String nroDni, LocalDateTime fechaNacimiento, LocalDateTime fechaInscripcion, String temaInteres, String estado) {
        this.codigoCliente = codigoCliente;
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

    public UUID getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(UUID codigoCliente) {
        this.codigoCliente = codigoCliente;
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

    @Override
    public String toString() {
        return "Cliente{" +
                "codigoCliente=" + codigoCliente +
                ", direccionCliente='" + direccionCliente + '\'' +
                ", telefono=" + telefono +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", nroDni='" + nroDni + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", fechaInscripcion=" + fechaInscripcion +
                ", temaInteres='" + temaInteres + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
