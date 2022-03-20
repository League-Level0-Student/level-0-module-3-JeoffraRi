
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		
		//1. Create a new Robot
		Robot robot = new Robot("vic");
		int robX = robot.getX();
	    int robY = robot.getY();
	    System.out.println(robX);
	    System.out.println(robY);//robot.hide();
		robot.setSpeed(30);
		//robot.move(200);
		//robot.show();
		robot.penDown();
		robot.setPenWidth(10);
		//robot.turn(145);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		for (int a = 0; a < 1000; a++) {
		String answer = JOptionPane.showInputDialog(null,"What color should this star be? \n(Green, Red, Blue, Navy, Yellow, Orange)");
		if(answer.equals("Green")) {
			robot.setPenColor(0, 115, 0);
		}else if (answer.equals("Red")) {
			robot.setPenColor(245, 0, 0);
		}else if (answer.equals("Blue")) {
			robot.setPenColor(0, 89, 255);
		}else if (answer.equals("Navy"))	{
			robot.setPenColor(20, 26, 122);
		}else if (answer.equals("Yellow")) {
			robot.setPenColor(255, 225, 0);
		}else if (answer.equals("Orange")) {
			robot.setPenColor(255, 119, 0);
		}
		
		for (int i = 0; i < 5; i++) {
		robot.turn(144);
		robot.move(400);
		
		}
		
		robot.setX(400);
		robot.setY(300);
		robot.hide();
		}
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
