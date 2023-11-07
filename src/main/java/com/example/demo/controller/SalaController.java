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

import com.example.demo.dto.Sala;
import com.example.demo.service.SalaServiceImpl;

@RestController
@RequestMapping("/api")
public class SalaController {

	@Autowired
	SalaServiceImpl SalaServideImpl;
	
	@GetMapping("/salas")
	public List<Sala> listarSalas(){
		return SalaServideImpl.listarSalas();
	}
	
	@PostMapping("/salass")
	public Sala salvarSala(@RequestBody Sala Sala) {
		
		return SalaServideImpl.guardarSalas(Sala);
	}
	
	@GetMapping("/salas/{id}")
	public Sala SalaXID(@PathVariable(name="id") Long id) {
		
		Sala Sala_xid= new Sala();
		
		Sala_xid=SalaServideImpl.SalaXID(id);
		
		System.out.println("Sala XID: "+Sala_xid);
		
		return Sala_xid;
	}
	
	@PutMapping("/salas/{id}")
	public Sala actualizarSala(@PathVariable(name="id")Long id,@RequestBody Sala Sala) {
		
		Sala Sala_seleccionado= new Sala();
		Sala Sala_actualizado= new Sala();
		
		Sala_seleccionado= SalaServideImpl.SalaXID(id);
		
		Sala_seleccionado.setNombre(Sala.getNombre());
		Sala_seleccionado.setPelicula(Sala.getPelicula());
		
		Sala_actualizado = SalaServideImpl.actualizarSala(Sala_seleccionado);
		
		System.out.println("El Sala actualizado es: "+ Sala_actualizado);
		
		return Sala_actualizado;
	}
	
	@DeleteMapping("/salas/{id}")
	public void eliminarSala(@PathVariable(name="id")Long id) {
		SalaServideImpl.eliminarSala(id);
	}
	
}
