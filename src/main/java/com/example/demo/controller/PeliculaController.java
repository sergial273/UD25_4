package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Pelicula;
import com.example.demo.service.PeliculaServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculaController {

	@Autowired
	PeliculaServiceImpl PeliculaServideImpl;
	
	@GetMapping("/peliculas")
	public List<Pelicula> listarPeliculas(){
		return PeliculaServideImpl.listarPeliculas();
	}
	
	@PostMapping("/peliculas")
	public Pelicula salvarPelicula(@RequestBody Pelicula Pelicula) {
		
		return PeliculaServideImpl.guardarPeliculas(Pelicula);
	}
	
	@GetMapping("/peliculas/{id}")
	public Pelicula PeliculaXID(@PathVariable(name="id") Long id) {
		
		Pelicula Pelicula_xid= new Pelicula();
		
		Pelicula_xid=PeliculaServideImpl.PeliculaXID(id);
		
		System.out.println("Pelicula XID: "+Pelicula_xid);
		
		return Pelicula_xid;
	}
	
	@PutMapping("/peliculas/{id}")
	public Pelicula actualizarPelicula(@PathVariable(name="id")Long id,@RequestBody Pelicula Pelicula) {
		
		Pelicula Pelicula_seleccionado= new Pelicula();
		Pelicula Pelicula_actualizado= new Pelicula();
		
		Pelicula_seleccionado= PeliculaServideImpl.PeliculaXID(id);
		
		Pelicula_seleccionado.setNombre(Pelicula.getNombre());
		Pelicula_seleccionado.setEdad(Pelicula.getEdad());
		
		Pelicula_actualizado = PeliculaServideImpl.actualizarPelicula(Pelicula_seleccionado);
		
		System.out.println("El Pelicula actualizado es: "+ Pelicula_actualizado);
		
		return Pelicula_actualizado;
	}
	
	@DeleteMapping("/peliculas/{id}")
	public void eliminarPelicula(@PathVariable(name="id")Long id) {
		PeliculaServideImpl.eliminarPelicula(id);
	}
	
}
