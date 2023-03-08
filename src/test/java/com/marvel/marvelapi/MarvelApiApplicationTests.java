package com.marvel.marvelapi;

import com.marvel.marvelapi.controlador.ControladorHeroe;
import static org.assertj.core.api.Assertions.assertThat;

import com.marvel.marvelapi.modelo.Heroe;
import com.marvel.marvelapi.repositorio.RepositorioHeroe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class MarvelApiApplicationTests {

	@Autowired
	private ControladorHeroe controladorHeroe;

	@Autowired
	private RepositorioHeroe repositorioHeroe;

	private Heroe heroe;

	// La aplicacion esta creando el controlador
	@Test
	@DisplayName("Test 1")
	public void contextLoads() throws Exception {
		assertThat(controladorHeroe).isNotNull();
	}

	// La aplicacion esta creando el respositorio
	@Test
	@DisplayName("Test 2")
	public void Test2(){
		assertThat(repositorioHeroe).isNotNull();
	}

	// Al buscar un heroe por ID y buscar el correspondiente por su nombre, ambos tienen el mismo ID al ser el mismo heroe.
	@Test
	@DisplayName("Test 3")
	public void Test3(){
		Optional<Heroe> heroe1 = repositorioHeroe.findById(1L);
		Optional<Heroe> heroe2 = repositorioHeroe.findByNombre(heroe1.get().getNombre());
		Assertions.assertEquals(heroe1.get().getId(), heroe2.get().getId());
	}



}
