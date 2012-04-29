package teste;

import java.util.Calendar;

public class Deposito {
	private String numeroEnvelope;
	
	private DadosDeMovimentacao dadosDeMovimentacao = new DadosDeMovimentacao();	
	private double valor = dadosDeMovimentacao.getValor();
	private Conta conta = dadosDeMovimentacao.getConta();
	private Calendar data = dadosDeMovimentacao.getData(); 	
	
	public String getNumeroEnvelope() {
		return numeroEnvelope;
	}

	public void setNumeroEnvelope(String numeroEnvelope) {
		this.numeroEnvelope = numeroEnvelope;
	}

	public DadosDeMovimentacao getMovimentacao() {
		return dadosDeMovimentacao;
	}	

	public double getValor() {
		return valor;
	}	

	public Conta getConta() {
		return conta;
	}	

	public Calendar getData() {
		return data;
	}	
}
