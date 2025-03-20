import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {

		int opcaoDeMes = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 12: "));

		switch (opcaoDeMes) {
		case 1:
			JOptionPane.showMessageDialog(null, "1 - Mês de Janeiro.");
			break;

		case 2:
			JOptionPane.showMessageDialog(null, "2 - Mês de Fevereiro.");
			break;

		case 3:
			JOptionPane.showMessageDialog(null, "3 - Mês de Março.");
			break;

		case 4:
			JOptionPane.showMessageDialog(null, "4 - Mês de Abril.");
			break;

		case 5:
			JOptionPane.showMessageDialog(null, "5 - Mês de Maio.");
			break;

		case 6:
			JOptionPane.showMessageDialog(null, "6 - Mês de Junho.");
			break;

		case 7:
			JOptionPane.showMessageDialog(null, "7 - Mês de Julho.");
			break;

		case 8:
			JOptionPane.showMessageDialog(null, "8 - Mês de Agosto.");
			break;

		case 9:
			JOptionPane.showMessageDialog(null, "9 - Mês de Setembro.");
			break;

		case 10:
			JOptionPane.showMessageDialog(null, "10 - Mês de Outubro.");
			break;

		case 11:
			JOptionPane.showMessageDialog(null, "11 - Mês de Novembro.");
			break;

		case 12:
			JOptionPane.showMessageDialog(null, "12 - Mês de Dezembro.");
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opção Inválida!");
			break;
		}
	}

}
