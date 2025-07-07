package com.talento.proyecto_final.service;

import com.talento.proyecto_final.model.Pedido;
import java.util.List;
import java.util.Optional;

public interface PedidoService {
    List<Pedido> listarPedidos();
    Optional<Pedido> obtenerPedidoPorId(Long id);
    Pedido guardarPedido(Pedido pedido);
    Pedido actualizarPedido(Long id, Pedido pedido);
    void eliminarPedido(Long id);
}
