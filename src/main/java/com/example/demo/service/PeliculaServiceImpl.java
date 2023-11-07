package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPeliculaDAO;
import com.example.demo.dto.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService{

	@Autowired
	IPeliculaDAO iFabricanteDAO;
	
	@Override
	public List<Pelicula> listarPeliculas() {
		
		return iFabricanteDAO.findAll();
	}
	
	@Override
	public Pelicula guardarPeliculas(Pelicula video) {
		
		return iFabricanteDAO.save(video);
	}

	@Override
	public Pelicula PeliculaXID(Long id) {
		
		return iFabricanteDAO.findById(id).get();
	}

	@Override
	public Pelicula actualizarPelicula(Pelicula video) {
		
		return iFabricanteDAO.save(video);
	}

	@Override
	public void eliminarPelicula(Long id) {
		
		iFabricanteDAO.deleteById(id);
		
	}
}