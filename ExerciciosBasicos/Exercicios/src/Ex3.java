import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		
		double mediaAluno = Double.parseDouble(JOptionPane.showInputDialog("Digite a média do aluno: "));
		
		if(mediaAluno < 7)
		{
			JOptionPane.showMessageDialog(null, "Você precisa estudar mais!");
		} 
		else if(mediaAluno == 7)
		{
			JOptionPane.showMessageDialog(null, "Você foi aprovado!");
		}
		else if(mediaAluno < 8)
		{
			JOptionPane.showMessageDialog(null, "Parabéns, suas notas ficaram acima da média!");
		} 
		else if(mediaAluno < 9)
		{
			JOptionPane.showMessageDialog(null, "Parabéns, sua média ficou próxima da nota máxima!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Parabéns, você é um excelente aluno!");
		}

	}

}
