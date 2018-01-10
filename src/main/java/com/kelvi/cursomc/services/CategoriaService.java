package com.kelvi.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kelvi.cursomc.domain.Categoria;
import com.kelvi.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Categoria obj = repo.findOne(id);
		return obj;
		
	}

}
