package main;

import java.awt.Frame;

import javax.swing.JFrame;

import network.GameClient;

public class Main {
	
	public Main(){
		JFrame frame = new JFrame("Client");
		frame.setSize(600, 400);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		new GameClient();
	}
	
	public static void main(String[] args){
		new Main();
		
	}
}
