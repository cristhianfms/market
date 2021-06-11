package com.cfms.market.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
@Getter
@Setter
public class Cliente {

    @Id
    private String id;
    private String nombre;
    private String apellidos;
    private Integer celular;
    private String direccion;

    @Column(name = "correo_electronico")
    private String correoElectronico;
}
