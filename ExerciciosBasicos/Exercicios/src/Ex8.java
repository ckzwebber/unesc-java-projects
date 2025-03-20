import javax.swing.JOptionPane;

public class Ex8 {

	public static void main(String[] args) {
		
		
		int somaDeImpares = 0;
		
		for(int i = 250; i <= 500; i++)
		{
			if(i % 2 != 0)
			{
				// JOptionPane.showMessageDialog(null, i); Para não ter que ficar dando ok, usei System.out.println
				System.out.println("Número Impar: " + i);
				somaDeImpares += i;
			}
		}
		
		JOptionPane.showMessageDialog(null, "A soma dos números impares de 250 a 500 é: " + somaDeImpares);

	}

}
