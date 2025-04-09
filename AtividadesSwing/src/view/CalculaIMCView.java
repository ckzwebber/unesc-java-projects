package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculaIMCView extends JFrame {

	private JPanel pnlPrincipal;
	private JLabel lblPeso, lblAltura, lblTitulo, lblDescricao, lblKg, lblM;
	private JButton btnCalcular, btnLimpar;
	private JTextField txfPeso, txfAltura;
	
	public CalculaIMCView() {
		setTitle("IMC");
		setSize(400, 600);	
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		componentesCriar();
		setVisible(true);
	}
	
	private void componentesCriar() {
		pnlPrincipal = new JPanel();
		pnlPrincipal.setLayout(null);
		pnlPrincipal.setBounds(0, 0, 600, 75);
		pnlPrincipal.setBackground(new Color(0, 172, 193));
		getContentPane().add(pnlPrincipal);
		
		lblTitulo = new JLabel("Índice de massa corporal (IMC)");
		lblTitulo.setBounds(10, 10, 350, 20);
		lblTitulo.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));
		lblTitulo.setForeground(Color.white);
		pnlPrincipal.add(lblTitulo);
		
		lblDescricao = new JLabel("Uma medida de gordura corporal em adultos");
		lblDescricao.setBounds(10, 40, 350, 20);
		lblDescricao.setForeground(Color.white);
		pnlPrincipal.add(lblDescricao);
		
		lblPeso = new JLabel("Peso");
		lblPeso.setBounds(10, 85, 30, 20);
		lblPeso.setForeground(Color.gray);
		getContentPane().add(lblPeso);
		
		txfPeso = new JTextField();
		txfPeso.setBounds(10, 105, 330, 35);
		getContentPane().add(txfPeso);
		
		lblKg = new JLabel("Kg");
		lblKg.setBounds(360, 103, 20, 20);
		getContentPane().add(lblKg);
		
		lblAltura = new JLabel("Altura");
		lblAltura.setBounds(10, 145, 70, 20);
		lblAltura.setForeground(Color.gray);
		getContentPane().add(lblAltura);
		
		txfAltura = new JTextField();
		txfAltura.setBounds(10, 165, 330, 35);
		getContentPane().add(txfAltura);
		
		lblM = new JLabel("m");
		lblM.setBounds(360, 170, 20, 20);
		getContentPane().add(lblM);
	}
	
}
