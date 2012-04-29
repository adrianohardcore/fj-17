package teste;

import java.util.Calendar;

public class Pagamento {
	private String favorecido;
	private String formaDePagamento;
	
	private DadosDeMovimentacao dadosDeMovimentacao = new DadosDeMovimentacao();	
	private double valor = dadosDeMovimentacao.getValor();
	private Conta conta = dadosDeMovimentacao.getConta();
	private Calendar data = dadosDeMovimentacao.getData(); 	
	private Double Encargos = dadosDeMovimentacao.getEncargos();
	
	
	
	public String getFavorecido() {
		return favorecido;
	}
	public void setFavorecido(String favorecido) {
		this.favorecido = favorecido;
	}
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
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
	
//	public Double getEncargos() {
//		return Encargos;
//	}
}