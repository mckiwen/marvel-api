package com.marvel.marvelapi.modelo;

import jakarta.persistence.*;

@Entity
@Table
public class Heroe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nombre;
}
