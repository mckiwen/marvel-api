package com.marvel.marvelapi.servicio;

import com.marvel.marvelapi.modelo.Heroe;

import java.util.List;
import java.util.Optional;

public interface ServicioHeroe {
    Heroe guardarHeroe(Heroe heroe);

    Optional<Heroe> findById(Long id);
    Optional<Heroe> findByNombre(String nombre);
}

