package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot budgie = new Robot();
budgie.penDown();
for (int i = 0; i < args.length; i++) {
	budgie.move(100);
	budgie.turn(90)
}

	
		
		
	}
}
