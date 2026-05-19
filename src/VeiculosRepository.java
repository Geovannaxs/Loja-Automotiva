package com.example.crudmvc.repository;

import com.example.crudmvc.model.Veiculos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculosRepository extends JpaRepository<Veiculos, Long> {
}