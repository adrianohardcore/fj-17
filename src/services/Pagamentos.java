package services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

import model.Documento;
import model.Pagamento;

public class Pagamentos implements Iterable<Pagamento>{
	
	private Collection<Pagamento> pagamentos = new ArrayList<Pagamento>();	
	private double valorPago;	
    public Collection<Pagamento> pagamentosAntesDe(Calendar data) {
    	Collection<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this) {
            if (pagamento.getData().before(data)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public Collection<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
    	Collection<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this) {
            if (pagamento.getValor() > valorMinimo) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public Collection<Pagamento> pagamentosDo(Documento doc) {
    	Collection<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this) {
            if (pagamento.getDoc().equals(doc)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    
    private void paga(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor invalido para pagamento");
        }
        if (valor > 100) {
            valor = valor - 8;
        }
        this.valorPago += valor;        
    }
    
    public void registra(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        paga(pagamento.getValor());
    }   
    
    public double getValorPago() {
        return this.valorPago;
    }
	@Override
	public Iterator<Pagamento> iterator() {
		return this.iterator();		
	}     

}
