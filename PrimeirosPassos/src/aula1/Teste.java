package aula1;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do aluno"));
		
		JOptionPane.showMessageDialog(null, "O nome do aluno é: " + nome + ". A idade dele é: " + idade + ". \nA altura dele é: " + altura);
		
		if(altura >= 1.85 && idade >= 18)
		{
			JOptionPane.showMessageDialog(null, "O aluno " + nome + " pode entrar no time de basquete!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "O aluno " + nome + " não pode entrar =(.");
		}
		
	}

}
