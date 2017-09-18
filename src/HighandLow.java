
import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighandLow {

	public static void main(String[] args) {
			// 3. Change this line to give you a random number between 1 - 100. 
			int random = new Random().nextInt(100);
			// 2. Print out the random variable above
			System.out.println(random);
			// 11. do the following 10 times
			for (int i = 10; i < args.length; i++) {
				
			
				// 1. ask the user for a guess using a pop-up window, and save their response 
String answer = JOptionPane.showInputDialog("Guess a number between 1 and a 100");
				// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int number = Integer.parseInt(answer);
				// 5. if the guess is correct
		if (number == random) {
			JOptionPane.showMessageDialog(null, "YOU WIN");
			
		}
					// 6. win
				// 7. if the guess is high
		if (number>random) {
			JOptionPane.showMessageDialog(null, "the number you typed is to highhh");
		}
					// 8. tell them it's too high
				// 9. if the guess is low
		if(number<random) {
			JOptionPane.showMessageDialog(null, "the number you typed is to low");
			
			
		}
					// 10. tell them it's too low

			// 12. tell them they lose
		}

}
}
