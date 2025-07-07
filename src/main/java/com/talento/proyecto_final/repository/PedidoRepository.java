package com.talento.proyecto_final.repository;

import com.talento.proyecto_final.model.Articulo;
import com.talento.proyecto_final.model.Pedido;

// Importamos JpaRepository, que nos da los métodos CRUD listos
import org.springframework.data.jpa.repository.JpaRepository;

// Importamos la anotación @Repository que marca esta interfaz como componente de acceso a datos
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> { 

    // ===============================================
    // 🚀 MÉTODOS CRUD INCLUIDOS AUTOMÁTICAMENTE
    // ===============================================
    // findAll()                -> Lista todos los artículos
    // findById(Long id)        -> Busca uno por ID
    // save(Articulo a)         -> Inserta o actualiza
    // deleteById(Long id)      -> Elimina por ID
    // count()                  -> Cuenta registros
    // existsById(Long id)      -> Verifica si existe un ID

    // ===============================================
    // 🛠️ MÉTODOS PERSONALIZADOS (se generan por nombre)
    // ===============================================

    // Buscar pedido por dniCliente
    List<Articulo> findBydniCliente(String nombre);
}
