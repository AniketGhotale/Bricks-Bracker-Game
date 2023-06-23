package brickBraker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame obj=new JFrame();
		Gameplay gameplay = new Gameplay();
		obj.setBounds(10, 10, 708, 600);
		obj.setTitle("Brakeout Ball");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gameplay);

	}

}
