
public class Telefonista extends Funcionario {
	
	public Telefonista(Integer codigo, String nome) {
		super(codigo, nome);
	}
	
	@Override
	public double getSalario() {
		double salarioTelefonista = super.getSalario() * 1.10;
		return salarioTelefonista;
	}
}
