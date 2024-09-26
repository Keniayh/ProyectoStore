package com.store.app_store.domian.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "compras")
public class Compra {
    @Id
    @Column(name = "id_compra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCompra;

    @Column(name = "id_cliente", length = 20)
    private int idCliente;

    @Column
    private Date fecha;

    @Column(name = "medio_pago", length = 1)
    private String medioPago;

    @Column
    private String comentario;

    @Column(length = 1)
    private String estado;

    @ManyToOne
    private Cliente clientes;
}
