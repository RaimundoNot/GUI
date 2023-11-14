package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI2 implements ActionListener {
	int count = 0;
	JFrame frame;
	JPanel panel;
	JLabel label;

	public GUI2() {

		frame = new JFrame("My First Gui");

		panel = new JPanel();

		label = new JLabel("Numbers of the clicks : 0");

		JButton button = new JButton("Click me");

		frame.setSize(220, 220);
		panel.setLayout(null);
		frame.setLocationRelativeTo(null);

		label.setBounds(20, 20, 300, 20);
		button.setBounds(20, 40, 100, 40);

		button.addActionListener(this);

		panel.add(label);
		panel.add(button);

		frame.setVisible(true);
		frame.getContentPane().add(panel);

	}

	public static void main(String[] args) {

		new GUI2();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Numbers of the clicks : " + count);

	}

}
