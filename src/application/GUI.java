package application;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	int count = 0;
	JLabel jl;
	JFrame frame;
	JPanel painel;
	
	public GUI() {
		frame = new JFrame();
		
		JButton bt = new JButton("Click Me");
		jl = new JLabel("Numbers of clicks: 0");
		
		
		bt.addActionListener(this);

		
		painel = new JPanel();
		painel.setBorder(BorderFactory.createEmptyBorder(120, 120, 90, 10));
		painel.setLayout(new GridLayout(0,1));
		painel.add(bt);
		painel.add(jl);
		
	
		frame.add(painel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our First GUI");
		frame.pack();
		frame.setVisible(true);
		//frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		bt.setBounds(20, 180, 100, 30);
		
	}

	public static void main(String[] args) {
		new GUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count ++;
		jl.setText("Numbers of clicks: "+count);
	}

}
