import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		
		double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base de um funcionário:"));
		
		double gratificacaoSobreSalarioBase = salarioBase * 0.05;
		double impostoSobreSalarioBase = salarioBase * 0.07;
		
		double salarioAReceber = (salarioBase + gratificacaoSobreSalarioBase) - impostoSobreSalarioBase;
		
		JOptionPane.showMessageDialog(null, "O salario a receber, com + gratificação e - impostos é: " + salarioAReceber + ".");

	}

}
