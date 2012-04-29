package services;

import java.util.HashMap;

import model.Divida;
import model.Documento;
import model.Pagamento;

public class BalancoEmpresa {
    private HashMap<String, Divida> dividas = new HashMap<String, Divida>(); 
    public void registraDivida(Divida divida) {
        dividas.put(divida.getDoc().getValor(),divida);
    }
    
    public void pagaDivida(Documento doc, Pagamento pagamento) {
        Divida divida = dividas.get(doc);
        if (divida != null) {
            divida.registra(pagamento);
        }
    }
}