package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI3 implements ActionListener {

	private static JPanel panel;
	private static JFrame frame;
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel succesful;
	
	public static void main(String[] args) {
		
		frame = new JFrame();
		panel = new JPanel();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("Username");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Save");
		button.setBounds(20, 100, 70, 30);
		button.addActionListener(new GUI3());
		panel.add(button);
		
		succesful = new JLabel("");
		succesful.setBounds(105, 100, 340, 30);
		panel.add(succesful);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		
		if(user.equals("Raimundo") && password.equals("memesvida123")) {
			succesful.setText("Login Sucessful!");
		} else {
			succesful.setText("This username and password is wrong!");
		}
		
	}

}
