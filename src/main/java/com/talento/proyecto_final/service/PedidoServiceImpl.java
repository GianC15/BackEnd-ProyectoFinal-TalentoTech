package com.talento.proyecto_final.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talento.proyecto_final.model.Pedido;
import com.talento.proyecto_final.repository.PedidoRepository;

@Service
public class PedidoServiceImpl implements PedidoService {

    private final PedidoRepository pedidoRepository;

    @Autowired
    public PedidoServiceImpl(PedidoRepository pedidoRepository){
        this.pedidoRepository = pedidoRepository;
    }

    public List<Pedido> listarPedidos(){
        return pedidoRepository.findAll();
    }
    public Optional<Pedido> obtenerPedidoPorId(Long id){
        return pedidoRepository.findById(id);
    }
    public Pedido guardarPedido(Pedido pedido){
        return pedidoRepository.save(pedido);
    }
    public Pedido actualizarPedido(Long id, Pedido pedido){
        pedido.setId(id);
        return pedidoRepository.save(pedido);
    }
    public void eliminarPedido(Long id){
        pedidoRepository.deleteById(id);
    }

}
