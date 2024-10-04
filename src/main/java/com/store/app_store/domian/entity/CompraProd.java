package com.store.app_store.domian.entity;

import com.store.app_store.domian.entity.fkClass.CompraProductoPk;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "compras_productos")
public class CompraProd {
    @EmbeddedId
    CompraProductoPk id;

    @Column
    private int cantidad;

    @Column
    private float total;

    @Column
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;
}
