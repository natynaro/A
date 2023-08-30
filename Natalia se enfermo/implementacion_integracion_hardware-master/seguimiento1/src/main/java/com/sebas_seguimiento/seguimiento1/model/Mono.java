package com.sebas_seguimiento.seguimiento1.model;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="monos")
public class Mono implements Comparable<Mono>, Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Column
    private String Familia;

    public void setFamilia(String Familia) {
        this.Familia = Familia;
    }

    public String getFamilia() {
        return Familia;
    }

    @Column
    private String descripcion;

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Column
    private String habilidades;

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getHabilidades() {
        return habilidades;
    }

    @Override
    public int compareTo(Mono arg0) {
        return this.nombre.compareTo(arg0.nombre);
    }
}
