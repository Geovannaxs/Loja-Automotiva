package com.example.crudmvc.controller;

import com.example.crudmvc.model.Veiculos;
import com.example.crudmvc.service.VeiculosService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class VeiculosController {

    private final VeiculosService veiculosService;

    public VeiculosController(VeiculosService veiculosService) {
        this.veiculosService = veiculosService;
    }

    @GetMapping("/")
    public String inicio() {
        return "redirect:/veiculos";
    }

    @GetMapping("/veiculos")
    public String listar(Model model) {
        model.addAttribute("veiculos", veiculosService.listarTodos());
        return "listar";
    }

    @GetMapping("/veiculos/novo")
    public String novoFormulario(Model model) {
        model.addAttribute("veiculos", new Veiculos());
        return "formulario";
    }

    @PostMapping("/veiculos/salvar")
    public String salvar(@ModelAttribute Veiculos veiculos) {
        veiculosService.salvar(veiculos);
        return "redirect:/veiculos";
    }

    @GetMapping("/veiculos/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Veiculos veiculos = veiculosService.buscarPorId(id);
        model.addAttribute("veiculos", veiculos);
        return "formulario";
    }

    @GetMapping("/veiculos/deletar/{id}")
    public String deletar(@PathVariable Long id) {
        veiculosService.deletar(id);
        return "redirect:/veiculos";
    }

    @GetMapping("/veiculos/detalhes/{id}")
    public String detalhes(@PathVariable Long id, Model model) {
        Veiculos veiculos = veiculosService.buscarPorId(id);
        model.addAttribute("veiculos", veiculos);
        return "detalhes";
    }
}