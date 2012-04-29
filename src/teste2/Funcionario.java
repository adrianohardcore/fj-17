package teste2;

public class Funcionario implements FuncionarioInterface{
	private int salario;
	private int bonus;
	
	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public int Pagar(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
