package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Salas")//en caso que la tabla sea diferente

public class Sala {
	
	//Atributos de entidad cliente
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		@Column(name = "nombre")//no hace falta si se llama igual
		private String nombre;
		
		@ManyToOne
	    @JoinColumn(name="pelicula")
	    private Pelicula pelicula;

		//Constructores
		public Sala() {
			
		}

		public Sala(Long id, String nombre, Pelicula pelicula) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.pelicula = pelicula;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Pelicula getPelicula() {
			return pelicula;
		}

		public void setPelicula(Pelicula pelicula) {
			this.pelicula = pelicula;
		}

		@Override
		public String toString() {
			return "Sala [id=" + id + ", nombre=" + nombre + ", pelicula=" + pelicula + "]";
		}

	

		
}