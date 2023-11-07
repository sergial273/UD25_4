package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Sala;


public interface ISalaService {

	//Metodos del CRUD
		public List<Sala> listarSalas(); //Listar All 
		
		public Sala guardarSalas(Sala video);	//Guarda un Sala CREATE
		
		public Sala SalaXID(Long id); //Leer datos de un Sala READ
		
		public Sala actualizarSala(Sala video); //Actualiza datos del Sala UPDATE
		
		public void eliminarSala(Long id);// Elimina el Sala DELETE
}
