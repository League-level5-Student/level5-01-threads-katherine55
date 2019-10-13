package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot blue = new Robot(300, 400);
		Robot black = new Robot(800, 400);
		Robot red = new Robot(1300, 400);		
		Robot yellow = new Robot(550, 600);
		Robot green = new Robot(1050, 600);
		
		blue.setPenColor(Color.blue);
		black.setPenColor(Color.black);
		red.setPenColor(Color.red);
		yellow.setPenColor(Color.yellow);
		green.setPenColor(Color.green);
		
		blue.penDown();
		black.penDown();
		red.penDown();
		yellow.penDown();
		green.penDown();
		
		blue.setAngle(90);
		black.setAngle(90);
		red.setAngle(90);
		yellow.setAngle(90);
		green.setAngle(90);
		
		Thread a = new Thread(()-> corcleTime(blue));
		Thread b = new Thread(()-> corcleTime(black));
		Thread c = new Thread(()-> corcleTime(red));
		Thread d = new Thread(()-> corcleTime(yellow));
		Thread e = new Thread(()-> corcleTime(green));
		
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
		
	}
	
	static void corcleTime(Robot bot) {	
		for(int i = 0; i < 360; i++) {
			bot.move(3);
			bot.turn(-1);
		}	
	}	
}

