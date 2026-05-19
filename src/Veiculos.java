package com.example.crudmvc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Veiculos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String modelo;
    private Double preco;
    private Integer ano;

    public Veiculos() {
    }

    public Veiculos(String marca, String modelo, Double preco, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.ano = ano;
    }

    public Long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getPreco() {
        return preco;
    }
    public Integer getAno() {
        return ano;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public void setAno(Integer ano) {
            this.ano = ano;
    }
}