package com.kelvi.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kelvi.cursomc.domain.Cliente;
import com.kelvi.cursomc.repositories.ClienteRepository;
import com.kelvi.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		
		Cliente obj = repo.findOne(id);
		if(obj==null) {
			throw new ObjectNotFoundException("Objeto não encontrado ! Id:"+id
					+ ", Tipo: "+ Cliente.class.getName());
			
		}
		
		return obj;
		
	}

}
