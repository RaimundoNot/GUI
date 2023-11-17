package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIfreestyle implements ActionListener {

	private static JFrame frame;
	private static JPanel panel;
	private static JTextField textName;
	private static JTextField textAge;
	private static JButton salvar;
	private static JButton listar;
	
	//ArrayList<GUIfreestyle> list = new ArrayList<GUIfreestyle>();
	
	public GUIfreestyle () {
		
		
		
		frame = new JFrame("Cadastro");
		panel = new JPanel();
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		
		panel.setLayout(null);
		
		JLabel labelName = new JLabel("Username");
		labelName.setBounds(10, 20, 130, 40);
		panel.add(labelName);
		
		textName = new JTextField();
		textName.setBounds(80, 32, 130, 20);
		panel.add(textName);
		
		JLabel labelAge = new JLabel("Age");
		labelAge.setBounds(10, 50, 130, 40);
		panel.add(labelAge);
		
		textAge = new JTextField();
		textAge.setBounds(80, 62, 130, 20);
		panel.add(textAge);
		
		salvar = new JButton("Salvar");
		salvar.setBounds(10, 110, 80, 20);
		salvar.addActionListener(this);
		panel.add(salvar);
		
		listar = new JButton("Listar");
		listar.setBounds(110, 110, 80, 20);
		listar.addActionListener(this);
		panel.add(listar);
		
		frame.getContentPane().add(panel);
	}
	
	public static void main(String[] args) {

		new GUIfreestyle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == salvar) {
			textName.getText();
			Integer.parseInt(textAge.getText());
			JOptionPane.showMessageDialog(null, "Objeto Cadastrado com sucesso !");
			//textName.setText("");
			//textAge.setText("");
		}
		if (e.getSource() == listar) {
			JOptionPane.showMessageDialog(null, "##OBJETO CADASTRADO##\nNome: "
			+ textName.getText() 
			+"\nIdade: "
			+textAge.getText());
			textName.setText("");
			textAge.setText("");
		}
		
		
	}
}
