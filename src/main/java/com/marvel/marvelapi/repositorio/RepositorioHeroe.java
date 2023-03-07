package com.marvel.marvelapi.repositorio;

import com.marvel.marvelapi.modelo.Heroe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepositorioHeroe extends JpaRepository<Heroe, Long> {
    Optional<Heroe> findById(Long id);
    Optional<Heroe> findByNombre(String nombre);
}
