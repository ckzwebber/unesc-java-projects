import javax.swing.JOptionPane;

public class Ex9 {

	public static void main(String[] args) {
	
		double numeroDigitado;
		
		do {
			numeroDigitado = Double.parseDouble(JOptionPane.showInputDialog("Digite um número (negativo para parar): "));
			JOptionPane.showMessageDialog(null, "Número digitado: " + numeroDigitado);
		} while(numeroDigitado > -1); 

	}

}
