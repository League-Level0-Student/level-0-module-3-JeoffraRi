
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		
		// 1. Set the X position of the robot so that it starts on the left. 
		rob.setX(100);
		// You also need to show the robot to see the result of this line.
        rob.show();
        rob.penDown();
        rob.setSpeed(25);
        rob.turn(45);
		// 2. Make the robot draw a star shape. Hint: angle=144.
        for (int a = 0; a<5; a++) {
        	rob.move(300);
        	rob.turn(144);
        }
		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
