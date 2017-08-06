package day3;

import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	
	JOptionPane.showMessageDialog(null, "Hi, this is a quick questionaire for government purposes. Whats your name?");
	String name = JOptionPane.showInputDialog("What is your name?");
	String age = JOptionPane.showInputDialog("Hi! How old are you? " + name);
	JOptionPane.showInputDialog("Great! What is the color of your hair?");
	JOptionPane.showMessageDialog(null, "Awesome you just finished the questionaire! Thank You for your time!");
	String adress = JOptionPane.showInputDialog("To thank you for finishing this survey we want to send a prize to your house. What is your adress?");
	JOptionPane.showInputDialog("So just to verify your name is " + name +" your age is "+ age +" and you adress is " + adress);
	JOptionPane.showMessageDialog(null, "Thanks again now I will make sure to watch you at ALL times");
}
}
