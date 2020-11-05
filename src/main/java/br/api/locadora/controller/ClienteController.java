package br.api.locadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.api.locadora.model.Cliente;
import br.api.locadora.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	private final ClienteService _service;
	
	@Autowired
	public ClienteController(ClienteService service) {
		_service = service;
	}
	
	@PostMapping
	public ResponseEntity inserir (@RequestBody Cliente cliente) {
		_service.inserir(cliente);
		return ResponseEntity.status(HttpStatus.CREATED).body("Cliente Cadastrado");
	}
	
	@GetMapping
	public ResponseEntity listar() {
		
			Iterable<Cliente> clientes = _service.listar();
		return ResponseEntity.status(HttpStatus.OK).body(clientes);
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity atualizar(@RequestBody Cliente cliente, @PathVariable Long id) {
	    return ResponseEntity.status(HttpStatus.OK).body(cliente);
	    
	    }
	
	@DeleteMapping(path = "/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
	
}
