package com.marvel.marvelapi.controlador;

import com.marvel.marvelapi.modelo.Heroe;
import com.marvel.marvelapi.servicio.ServicioHeroe;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/heroes")
@RequiredArgsConstructor
public class Controlador {

    private final ServicioHeroe servicioHeroe;
    @PostMapping
    public ResponseEntity guardarHeroe(@RequestBody Heroe heroe){
        return new ResponseEntity(servicioHeroe.guardarHeroe(heroe), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity getHeroeId(@PathVariable Long id){
        return new ResponseEntity(servicioHeroe.getHeroeId(id), HttpStatus.OK);
    }
}
