package com.marvel.marvelapi.repositorio;

import com.marvel.marvelapi.modelo.Heroe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioHeroe extends JpaRepository<Heroe, Long> {
}
