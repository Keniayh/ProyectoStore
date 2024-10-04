package com.store.app_store.domian.entity.fkClass;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Embeddable
public class CompraProductoPk implements Serializable{

    @Column(name = "id_compra")
    private Long idCompra;

    @Column(name = "id_producto")
    private Long idProducto;
}