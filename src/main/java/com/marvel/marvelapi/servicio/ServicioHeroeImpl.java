package com.marvel.marvelapi.servicio;

import com.marvel.marvelapi.modelo.Heroe;
import com.marvel.marvelapi.repositorio.RepositorioHeroe;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ServicioHeroeImpl implements ServicioHeroe{

    private final RepositorioHeroe repositorioHeroe;

    @Override
    public Heroe guardarHeroe(Heroe heroe) {
        return repositorioHeroe.save(heroe);
    }

    @Override
    public Heroe getHeroeId(Long id) {
        return repositorioHeroe.findById(id).orElseThrow(() -> {
            throw new RuntimeException();
        });
    }

    @Override
    public List<Heroe> getHeroeNombre(String nombre) {
        return null;
    }

    //@Override
    //public List<Heroe> getHeroeNombre(String nombre) {
    //    return
    //}
}
