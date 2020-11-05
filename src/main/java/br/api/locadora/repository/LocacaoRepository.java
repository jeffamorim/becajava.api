package br.api.locadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.api.locadora.model.Locacao;

public interface LocacaoRepository extends JpaRepository<Locacao, Long> {

}
