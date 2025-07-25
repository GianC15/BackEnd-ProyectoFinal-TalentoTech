package com.talento.proyecto_final.model;

import jakarta.persistence.*;

// Indica que esta clase es una entidad JPA
@Entity
@Table(name = "articulo") // Mapea a la tabla "articulo"
public class Articulo {

    @Id // Clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincremental
    private Long id;
    private String nombre;
    private Double precio;
    private String imagen;

    public Articulo() {}

    public Articulo(Long id, String nombre, Double precio, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }
    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }
}