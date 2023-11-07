package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Pelicula;


public interface IPeliculaService {

	//Metodos del CRUD
		public List<Pelicula> listarPeliculas(); //Listar All 
		
		public Pelicula guardarPeliculas(Pelicula video);	//Guarda un Pelicula CREATE
		
		public Pelicula PeliculaXID(Long id); //Leer datos de un Pelicula READ
		
		public Pelicula actualizarPelicula(Pelicula video); //Actualiza datos del Pelicula UPDATE
		
		public void eliminarPelicula(Long id);// Elimina el Pelicula DELETE
}