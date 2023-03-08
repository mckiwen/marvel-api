package com.marvel.marvelapi.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.marvel.marvelapi.modelo.Heroe;
import com.marvel.marvelapi.repositorio.RepositorioHeroe;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;
@Controller
@RequestMapping("/heroes")
@RequiredArgsConstructor
public class ControladorHeroe {

    @Autowired
    private RepositorioHeroe repositorioHeroe;

    @RequestMapping("/")
    public String index(Model model) {
        List<Heroe> heroes = repositorioHeroe.findAll();
        model.addAttribute("heroes", heroes);
        return "index";
    }

    @GetMapping("/{id}")
    public ResponseEntity<Heroe> getHeroeById(@PathVariable Long id) {
        Optional<Heroe> heroe = repositorioHeroe.findById(id);
        if (heroe.isPresent()) {
            return ResponseEntity.ok(heroe.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(params = {"nombre"})
    public ResponseEntity getHeroeByNombre(@RequestParam String nombre) {
        Optional<Heroe> heroe = repositorioHeroe.findByNombre(nombre);
        if (heroe.isPresent()) {
            return ResponseEntity.ok(heroe.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
