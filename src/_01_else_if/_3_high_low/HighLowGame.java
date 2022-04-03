
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 1. Ask the user for a guess using a pop-up window, and save their response 
		int maxValue = 10;
		int minValue = 0;
		int random = new Random().nextInt(maxValue);
		for(int a = 0; a < 10; a++) {
		String guess = JOptionPane.showInputDialog(null,"Guess a number between "+minValue+" to "+maxValue+".");
		// 3. Change this line to give you a random number between 1 - 10. 
		
		
		// 2. Print out the random variable above
		//System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		
			
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int guessTwo = Integer.parseInt(guess);
			// 5. if the guess is correct
				// 6. Win
		if (guessTwo > maxValue) {
			JOptionPane.showMessageDialog(null, "??? I said one to ten!");
		}else if (guessTwo < minValue) {
			JOptionPane.showMessageDialog(null, "??? I said one to ten!");
		}else if (guessTwo==random) {
				JOptionPane.showMessageDialog(null, "Congratulations! You got the number!");
				System.exit(0);
				
			}else if (guessTwo>random) {
				JOptionPane.showMessageDialog(null, "Wrong! Your guess was too high. :(");
				
			}else if (guessTwo<random) {
				JOptionPane.showMessageDialog(null, "Wrong! Your guess was too low. :(");
				
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "The answer was "+random+".");
		
			// 7. if the guess is high
			// 8. Tell them it's too high
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			
				
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


