
public class Gerente extends Funcionario {

	public Gerente(Integer codigo, String nome) {
		super(codigo, nome);
	}
	
	@Override
	public double getSalario() {
		double salarioGerente = super.getSalario() * 1.45;
		return salarioGerente;
	}
	
}
