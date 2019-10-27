package _02_Advanced_Robot_Race;

import java.util.Random;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {

	public static void main(String[] args) {
		boolean finished = false;
		Random num = new Random();
		Robot[] jeff = new Robot[5];
		int x = 500;
		for (int i = 0; i < 5; i++) {
			jeff[i] = new Robot(x, 800);
			x += 200;
		}
		while (!finished) {
			
			for(int i = 0; i < 5; i++) {				
				if(jeff[i].getY() <= 0) {
					System.out.println("Robot " + i + " is the winner!");
					finished = true;
				}				
			}
			
			new Thread(() -> jeff[0].move(num.nextInt(200))).start();
			new Thread(() -> jeff[1].move(num.nextInt(200))).start();
			new Thread(() -> jeff[2].move(num.nextInt(200))).start();
			new Thread(() -> jeff[3].move(num.nextInt(200))).start();
			new Thread(() -> jeff[4].move(num.nextInt(200))).start();
		}
	}
	// Re-do the robot race recipe from level 3 module 0.
	// This time, use threads to make all of the robots go at the same time.
	// 1. make a main method
	// 2. create an array of 5 robots.
	// 3. use a for loop to initialize the robots.
	// 4. make each robot start at the bottom of the screen, side by side, facing up
	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.
	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.
	// 7. declare that robot the winner and throw it a party!
	// 8. try different races with different amounts of robots.
	// 9. make the robots race around a circular track.

}