package _03_string_conversion._1_intro;

import java.awt.Dimension;

import javax.swing.JOptionPane;

public class StringConversion {
	public static void main(String[]args) {
		
		String num = JOptionPane.showInputDialog(null, "enter a number");
		int quan = Integer.parseInt(num);
	}
}

