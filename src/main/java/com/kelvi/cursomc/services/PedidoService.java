package com.kelvi.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kelvi.cursomc.domain.Pedido;
import com.kelvi.cursomc.repositories.PedidoRepository;
import com.kelvi.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		
		Pedido obj = repo.findOne(id);
		if(obj==null) {
			throw new ObjectNotFoundException("Objeto não encontrado ! Id:"+id
					+ ", Tipo: "+ Pedido.class.getName());
			
		}
		
		return obj;
		
	}

}
