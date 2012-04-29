package model;

import java.util.Calendar;

public class Pagamento {
    private String pagador;
    private Documento doc;
    private double valor;
    private Calendar data;
    
    public String getPagador() {
        return this.pagador;
    }
    public void setPagador(String pagador) {
        this.pagador = pagador;
    }
    public Documento getDoc() {
		return doc;
	}
	public void setDoc(Documento doc) {
		this.doc = doc;
	}    
    public double getValor() {
        return this.valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Calendar getData() {
        return this.data;
    }
    public void setData(Calendar data) {
        this.data = data;
    }    
}