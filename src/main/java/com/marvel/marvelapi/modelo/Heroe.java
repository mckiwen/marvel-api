package com.marvel.marvelapi.modelo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "heroe")
@NoArgsConstructor
@Data
public class Heroe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(columnDefinition="TEXT")
    private String descripcion;
    @Column(nullable = false)
    private String imagen;
}
