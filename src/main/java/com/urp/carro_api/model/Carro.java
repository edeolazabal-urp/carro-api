package com.urp.carro_api.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carro {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Integer id;
    String marca;
    Date fecha_fabricacion = new Date();
    double precio;
    boolean estado;
}
