package com.talento.proyecto_final.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name ="pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // ID del pedido

    @Column(name = "dniCliente")  // Forzar el nombre exacto en MySQL
    private String dniCliente;
    private double total; // Total del pedido
    private LocalDate fecha; // Fecha del pedido

    // Constructor para inicializar el pedido   
    public Pedido(Long ID, String dniCliente) {
        this.id = ID;
        this.dniCliente = dniCliente;
        this.total = 0;
        this.fecha = LocalDate.now();
    }

    public Pedido(){};

    public Double getTotal() {return total;}    
    public Long getID() {return id;}
    public String getDniCliente() {return dniCliente;}
    public LocalDate getFecha() {return fecha;}
    public void setId(Long id){this.id = id;}
    public void setDniCliente(String dniCliente){this.dniCliente = dniCliente;}
    public void setTotal(double total){this.total = total;}
    public void setFecha(LocalDate fecha){this.fecha = fecha;}
}

