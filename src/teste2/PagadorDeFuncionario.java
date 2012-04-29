package teste2;

public class PagadorDeFuncionario {	
	public void paga(FuncionarioInterface funcionarioI){		
		funcionarioI.Pagar(funcionarioI.getSalario() + funcionarioI.getBonus());		
	}
}
