package com.store.app_store.domian.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_categoria;

    @Column(length = 45)
    private String descripcion;

    @Column
    private boolean estado;

    @JsonIgnore
    @OneToMany(mappedBy = "categorias")
    private List<Producto> productos;
}
