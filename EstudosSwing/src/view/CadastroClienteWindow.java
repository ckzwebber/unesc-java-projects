package view;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CadastroClienteWindow extends JFrame {

	private JLabel lblNome, lblCPF;
	private JTextField txfNome, txfCPF;
	private JButton btnSalvar;
	
	
	public CadastroClienteWindow() {
		setTitle("Cadastro de Cliente");
		setSize(500, 400);
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		componentesCriar();
		setVisible(true);
	}
	
	private void componentesCriar() {
		lblNome = new JLabel("Nome: ");
		lblNome.setBounds(10, 10, 50, 25);
		getContentPane().add(lblNome);
		
		txfNome = new JTextField();
		txfNome.setBounds(65, 10, 250, 25);
		getContentPane().add(txfNome);
		
		lblCPF = new JLabel("CPF: ");
		lblCPF.setBounds(10, 45, 50, 25);
		getContentPane().add(lblCPF);
		
		txfCPF = new JTextField();
		txfCPF.setBounds(65, 45, 250, 25);
		getContentPane().add(txfCPF);
		
		btnSalvar = new JButton(new AbstractAction("SALVAR") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (txfNome.getText().isEmpty()) {
					JOptionPane.showMessageDialog(txfNome, "Campo nome é obrigatório!");
					txfNome.requestFocus();
					return;
				}
				
				if(txfCPF.getText().isEmpty()) {
					JOptionPane.showMessageDialog(txfCPF, "Campo CPF é obrigatório!");
					txfCPF.requestFocus();
					return;
				}
				
				JOptionPane.showMessageDialog(btnSalvar, "Cliente Salvo!");
				
			}
		});
		btnSalvar.setBounds(65, 80, 250, 25);
		getContentPane().add(btnSalvar);
		
	}
	
}
