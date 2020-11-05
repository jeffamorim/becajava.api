package br.api.locadora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.api.locadora.model.Cliente;
import br.api.locadora.repository.ClienteRepository;

@Service
public class ClienteService {
	
	final ClienteRepository _repository;
	
	@Autowired
	public ClienteService(ClienteRepository repository) {
		_repository = repository;
	}
	
	public void inserir(Cliente cliente) {
		cliente.setId(new Long(0));
		_repository.save(cliente);
	}
	
	public List<Cliente> listar(){
		return _repository.findAll();
	}
}
