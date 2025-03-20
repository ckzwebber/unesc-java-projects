
public class Vendedor extends Funcionario{
	
	public Vendedor(Integer codigo, String nome)
	{
		super(codigo, nome);	
	}
	
	@Override
	public double getSalario() {
		double salarioVendedor = super.getSalario() * 1.25;
		return salarioVendedor;
	}
	
}
