package com.eymatsuda.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eymatsuda.cursomc.domain.Categoria;
import com.eymatsuda.cursomc.repositories.CategoriaRepository;

@Repository
public class CategoriaServico {
	
	@Autowired
	CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj= repo.findById(id);
		return obj.orElse(null);
	}
}
