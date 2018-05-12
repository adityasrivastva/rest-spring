package com.aditya.techhunt;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Bot extends JFrame {
	private JTextArea chatArea= new JTextArea();
	
	private JTextField chatbox = new JTextField();
	

	public Bot() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(600, 600);
		frame.setTitle("ChatBot");
		frame.add(chatArea);
		frame.add(chatbox);
		//For TextArea 
		chatArea.setSize(500, 400);
		chatArea.setLocation(2,2);
		
		

	}

	public static void main(String[] args) {
		new Bot();

	}

}
