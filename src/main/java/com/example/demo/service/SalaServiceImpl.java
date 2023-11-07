package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISalaDAO;
import com.example.demo.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService{

	@Autowired
	ISalaDAO iFabricanteDAO;
	
	@Override
	public List<Sala> listarSalas() {
		
		return iFabricanteDAO.findAll();
	}
	
	@Override
	public Sala guardarSalas(Sala video) {
		
		return iFabricanteDAO.save(video);
	}

	@Override
	public Sala SalaXID(Long id) {
		
		return iFabricanteDAO.findById(id).get();
	}

	@Override
	public Sala actualizarSala(Sala video) {
		
		return iFabricanteDAO.save(video);
	}

	@Override
	public void eliminarSala(Long id) {
		
		iFabricanteDAO.deleteById(id);
		
	}
}