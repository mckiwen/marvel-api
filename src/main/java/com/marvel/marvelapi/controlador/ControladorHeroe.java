package com.marvel.marvelapi.controlador;

import com.marvel.marvelapi.modelo.Heroe;
import com.marvel.marvelapi.repositorio.RepositorioHeroe;
import com.marvel.marvelapi.servicio.ServicioHeroe;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/heroes")
@RequiredArgsConstructor
public class ControladorHeroe {

    @Autowired
    private RepositorioHeroe repositorioHeroe;


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
