package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="Peliculas")//en caso que la tabla sea diferente
public class Pelicula  {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "edad")//no hace falta si se llama igual
	private int edad;
	
    @OneToMany
    @JoinColumn(name="id")
    private List<Sala> sala;
	
	//Constructores
	
	public Pelicula() {
	
	}

	public Pelicula(Long id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sala")
	public List<Sala> getSala() {
		return sala;
	}

	public void setSala(List<Sala> sala) {
		this.sala = sala;
	}

	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}


	
	
	
}
