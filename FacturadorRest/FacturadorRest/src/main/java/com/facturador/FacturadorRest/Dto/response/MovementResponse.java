package com.facturador.FacturadorRest.Dto.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class MovementResponse {

    @Id
    private int id;
    private String productDescription;
    private int cantidad;
}
