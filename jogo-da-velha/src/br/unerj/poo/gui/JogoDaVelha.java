package br.unerj.poo.gui;
        
import java.awt.BorderLayout;

import javax.swing.*;     


public class JogoDaVelha extends Gui {
	
	public void montaTela() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel1 = new JPanel();
		panel1.add(new JButton("0"));
		panel1.add(new JButton("1"));
		panel1.add(new JButton("2"));

		JPanel panel2 = new JPanel();
		panel2.add(new JButton("0"));
		panel2.add(new JButton("1"));
		panel2.add(new JButton("2"));

		JPanel panel3 = new JPanel();
		panel3.add(new JButton("0"));
		panel3.add(new JButton("1"));
		panel3.add(new JButton("2"));

		JPanel panel4 = new JPanel();
		panel4.add(panel1);
		panel4.add(panel2);
		panel4.add(panel3);
		
		
		frame.getContentPane().add(BorderLayout.NORTH, panel4);
		frame.getContentPane().add(BorderLayout.WEST, new JButton("3"));
		frame.getContentPane().add(BorderLayout.CENTER, new JButton("4"));
		frame.getContentPane().add(BorderLayout.EAST, new JButton("5"));
		frame.getContentPane().add(BorderLayout.SOUTH, new JButton("6"));
		frame.getContentPane().add(BorderLayout.SOUTH, new JButton("7"));
		frame.getContentPane().add(BorderLayout.SOUTH, new JButton("8"));


		frame.setSize(300,300);
		frame.setVisible(true);
	}


}
