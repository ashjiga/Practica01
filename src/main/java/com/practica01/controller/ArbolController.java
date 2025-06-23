package com.practica01.controller;

import com.practica01.service.ArbolService;
import com.practica01.domain.Arbol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/arbol")
public class ArbolController {

    @Autowired
    private ArbolService arbolService;

    // Mostrar listado de árboles
    @GetMapping("/listado")
    public String inicio(Model model) {
        var arboles = arbolService.getArboles();
        model.addAttribute("arboles", arboles);
        return "arbol/listado";
    }

    // Mostrar formulario para crear un nuevo árbol
    @GetMapping("/nuevo")
    public String nuevoArbol(Arbol arbol) {
        return "arbol/modifica";
    }

    // Guardar nuevo árbol o guardar edición
    @PostMapping("/guardar")
    public String guardarArbol(Arbol arbol) {
        arbolService.guardar(arbol);
        return "redirect:/arbol/listado";
    }

    // Editar un árbol (mostrar formulario con datos)
    @GetMapping("/editar/{idArbol}")
    public String editarArbol(Arbol arbol, Model model) {
        arbol = arbolService.encontrarArbol(arbol);
        model.addAttribute("arbol", arbol);
        return "arbol/modifica";
    }

    // Eliminar un árbol
    @GetMapping("/eliminar/{idArbol}")
    public String eliminarArbol(Arbol arbol) {
        arbolService.eliminar(arbol);
        return "redirect:/arbol/listado";
    }
}