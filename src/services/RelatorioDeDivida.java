package services;


import java.text.NumberFormat;
import java.util.Locale;

import model.Divida;
import model.Pagamento;

public class RelatorioDeDivida {
	private final Divida divida;

	public RelatorioDeDivida(Divida divida){
		this.divida = divida;		
	}
	
	public void geraRelatorio(NumberFormat formatador){
		System.out.println("Credor: " + divida.getCredor());
		System.out.println("Cnpj Credor: " + divida.getDoc());
		System.out.println("Valor a Pagar: " + formatador.format(divida.getValorPagar()));
		System.out.println("Total Dívida: " + formatador.format(divida.getTotal()));
	}
	
	public static void main(String[] args) {
		Divida divida = new Divida();
		divida.setCredor("Credor 1 ");
		divida.setTotal(100);
		//divida.getCnpjCredor().setValor("00.000.000/0009-05");
		//divida.setDoc("");
		Pagamento pagamento = new Pagamento();
		pagamento.setPagador("Pagador");
		//pagamento.setCnpjPagador("00.000.000/0001-01");
		
		
		pagamento.setValor(20);
		
		divida.registra(pagamento);		
		RelatorioDeDivida relatorioDeDivida = new RelatorioDeDivida(divida);
		NumberFormat pt_BR = NumberFormat.getCurrencyInstance(new Locale("pt","BR"));
		NumberFormat en_US = NumberFormat.getCurrencyInstance(new Locale("en","US"));
		relatorioDeDivida.geraRelatorio(pt_BR);
		relatorioDeDivida.geraRelatorio(en_US);				
	}
}
