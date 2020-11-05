package br.api.locadora.model;
import javax.persistence.*;


@Entity
public class Locacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private int Qtd_Dias;

	@ManyToOne
	@JoinColumn(name = "VeiculoId")
	private Veiculo Veiculo;

	@ManyToOne
	@JoinColumn(name = "ClienteId")
	private Cliente Cliente;
	
	@ManyToOne
	@JoinColumn(name = "PagamentoId")
	private Pagamento Pagamento;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public int getQtd_Dias() {
		return Qtd_Dias;
	}

	public void setQtd_Dias(int qtd_Dias) {
		Qtd_Dias = qtd_Dias;
	}

	public Veiculo getVeiculo() {
		return Veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		Veiculo = veiculo;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public Pagamento getPagamento() {
		return Pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		Pagamento = pagamento;
	}

	

}
