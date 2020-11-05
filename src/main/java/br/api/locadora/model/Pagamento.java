package br.api.locadora.model;


import javax.persistence.*;

@Entity
public class Pagamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private double Valor;
	private String Forma_Pagamento;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) {
		Valor = valor;
	}
	public String getForma_Pagamento() {
		return Forma_Pagamento;
	}
	public void setForma_Pagamento(String forma_Pagamento) {
		Forma_Pagamento = forma_Pagamento;
	}

	
}
