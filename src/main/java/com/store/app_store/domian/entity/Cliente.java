package com.store.app_store.domian.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @Column(length = 20)
    private String id;

    @Column(length = 40, nullable = true)
    private String nombre;

    @Column(length = 100, nullable = true)
    private String apellidos;

    @Column(precision = 10, scale = 0)
    private double celular;

    @Column(length = 80)
    private double direccion;

    @Column(name = "correo_electronico", length = 70)
    private double correoElec;

    @OneToMany(mappedBy = "clientes")
    @JsonIgnore
    private List<Compra> compras;

    public Cliente() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getCelular() {
        return celular;
    }

    public void setCelular(double celular) {
        this.celular = celular;
    }

    public double getDireccion() {
        return direccion;
    }

    public void setDireccion(double direccion) {
        this.direccion = direccion;
    }

    public double getCorreoElec() {
        return correoElec;
    }

    public void setCorreoElec(double correoElec) {
        this.correoElec = correoElec;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }
}
