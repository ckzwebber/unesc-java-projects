
public class TesteFolhaPagamento {

	public static void main(String[] args) {
		
		Telefonista telefonista = new Telefonista(1, "Arthur");
		Vendedor vendedor = new Vendedor(2, "Carlos");
		Gerente gerente = new Gerente(3, "Gerente");
		
		
		System.out.println(telefonista.imprimirFolhaPagamento());
		System.out.println(vendedor.imprimirFolhaPagamento());
		System.out.println(gerente.imprimirFolhaPagamento());


	}

}
