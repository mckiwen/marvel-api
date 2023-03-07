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
    public Optional<Heroe> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Heroe> findByNombre(String nombre) {
        return Optional.empty();
    }



    //@Override
    //public List<Heroe> getHeroeNombre(String nombre) {
    //    return
    //}
}
