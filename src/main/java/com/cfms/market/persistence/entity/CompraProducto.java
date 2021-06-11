package com.cfms.market.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "compras_productos")
@Getter
@Setter
public class CompraProducto {

    @EmbeddedId
    private CompraProductoPK id;

    private Integer cantidad;
    private Long total;
    private String estado;
}
