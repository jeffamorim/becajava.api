package br.api.locadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.api.locadora.model.Locacao;
import br.api.locadora.service.LocacaoService;

@RestController
@RequestMapping("/locacoes")
public class LocacaoController {
	
	private final LocacaoService _service;
	
	@Autowired
	public LocacaoController(LocacaoService service) {
		_service = service;
	}
	
	@PostMapping
	public ResponseEntity inserir (@RequestBody Locacao locacao) {
		_service.inserir(locacao);
		return ResponseEntity.status(HttpStatus.CREATED).body("Locação cadastrada");
	}
	
	@GetMapping
	public ResponseEntity listar() {
		
			Iterable<Locacao> locacoes = _service.listar();
		return ResponseEntity.status(HttpStatus.OK).body(locacoes);
	}

}
