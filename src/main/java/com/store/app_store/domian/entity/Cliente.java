package com.store.app_store.domian.entity;

import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
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
    private String direccion;

    @Column(name = "correo_electronico", length = 70)
    private String correoElec;

    @OneToMany(mappedBy = "clientes")
    private List<Compra> compras;
}
