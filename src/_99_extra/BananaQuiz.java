
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String name = JOptionPane.showInputDialog(null, "What's your name?");
		String doYou;
		do {
			 doYou = JOptionPane.showInputDialog(null, "Do you like bananas?");
		if (doYou.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "What!? "+name+", you're crazy! No wonder you made that weird program last Sunday!");
		}else if (doYou.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, ""+name+", you're a sensible person.");
			String hobby = JOptionPane.showInputDialog(null, "<html>What's your hobby? <i>better not be not liking bananas</i></html>");
			if (hobby.equalsIgnoreCase("not liking bananas")) {
			JOptionPane.showMessageDialog(null, "<html>GAH! <i>WHY MUST YOU TORMENT ME!?!</i><html>");
		}else {
			JOptionPane.showMessageDialog(null, "Your hobby would be much better with bananas.");
			JOptionPane.showMessageDialog(null, "<html>Oooh... "+hobby+" bananas... <i>I gotta try that sometime</i><html>");
		}
		}else {
			JOptionPane.showMessageDialog(null, "What?");
		}
		
		}while(!doYou.equalsIgnoreCase("yes")&&!doYou.equalsIgnoreCase("no"));
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than "yes?" or "no?"
		//	show a pop up that says "You are bananas!?"
	
	}

}














































