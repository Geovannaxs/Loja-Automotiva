package com.example.crudmvc.service;

import com.example.crudmvc.model.Veiculos;
import com.example.crudmvc.repository.VeiculosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculosService {

    private final VeiculosRepository veiculosRepository;

    public VeiculosService(VeiculosRepository veiculosRepository) {
        this.veiculosRepository = veiculosRepository;
    }

    public List<Veiculos> listarTodos() {
        return veiculosRepository.findAll();
    }

    public Veiculos salvar(Veiculos veiculos) {
        return veiculosRepository.save(veiculos);
    }

    public Veiculos buscarPorId(Long id) {
        return veiculosRepository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        veiculosRepository.deleteById(id);
    }
}