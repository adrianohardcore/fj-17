package model;

import services.Pagamentos;

public class Divida {  
    private double total;
    private String credor;   
    private Documento doc;    
    private Pagamentos pagamentos = new Pagamentos();
    
	public double getTotal() {
		return total;
	}
	public String getCredor() {
		return credor;
	}	
	public void setTotal(double total) {
		this.total = total;
	}
	public void setCredor(String credor) {
		this.credor = credor;
	}
	public void registra(Pagamento pagamento) {
		pagamentos.registra(pagamento);				
	}
	public double getValorPagar() {	
		return pagamentos.getValorPago();
	}
	public Documento getDoc() {
		return doc;
	}
	public void setDoc(Documento doc) {
		this.doc = doc;
	}
	
}