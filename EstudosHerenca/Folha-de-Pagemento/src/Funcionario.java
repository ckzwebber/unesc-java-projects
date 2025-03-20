
public class Funcionario extends Pessoa {
	
	public Funcionario() {
		
	}
	
	public Funcionario(Integer codigo, String nome) {
		super(codigo, nome);
	}
	
	public double getSalario() {
		double salarioPadrao = 2000.00;
		return salarioPadrao;
	}
	
	public String imprimirFolhaPagamento() {
		return "Folha do Funcionário: \n"
				+ "Código: " + getCodigo() + "\n"
				+ "Nome: " + getNome() + "\n" 
				+ "Salário: " + getSalario() + "\n";
	}
}
