package com.main;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Window {
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setBounds(350,15,800,800);
		jf.setTitle("Double Pendulum");
		jf.setResizable(false);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		System system=new System(jf.getWidth(),jf.getHeight());
		jf.add(system);
		jf.setVisible(true);
		
	}
}
