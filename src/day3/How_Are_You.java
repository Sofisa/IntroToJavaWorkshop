package day3;

import javax.swing.JOptionPane;

public class How_Are_You {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("Whats your name?");
	JOptionPane.showMessageDialog(null, "hello" + name);
}
}
