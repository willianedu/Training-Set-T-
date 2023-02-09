package entities;

public class TerceirizadoFuncionario extends Funcionario {
        
	private Double adicionalTaxa;
	
	
	public TerceirizadoFuncionario() {
		super();
	}
	
	public TerceirizadoFuncionario(String nome, Integer horas, Double valorPorHora, Double adicionalTaxa) {
		super(nome, horas, valorPorHora);
		this.adicionalTaxa = adicionalTaxa;
	}

	public Double getAdicionalTaxa() {
		return adicionalTaxa;
	}

	public void setAdicionalTaxa(Double adicionalTaxa) {
		this.adicionalTaxa = adicionalTaxa;
	}
	
    @Override
	public Double pagamento() {
		return super.pagamento() + adicionalTaxa * 1.1;
	}
}