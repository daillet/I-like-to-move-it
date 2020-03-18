package io.github.thomasdaille.interface_exercise.interface_exercise;

public interface MovableObject {

	boolean canAccelerate();
	
	void accelerate();
	
	double getTimeToMove(double x);
	
	void brake();
}
