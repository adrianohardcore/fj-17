package model;

public class Cpf implements Documento{
	private String valor;
	
	public Cpf(String valor) {
        this.valor = valor;
    }

	@Override
	public Boolean ehValido() {
		return true;
	}

	@Override
	public String getValor() {
		return this.valor;
	}
}
