package io.github.thomasdaille.interface_exercise.interface_exercise;

public class MovableUser {
	
	public static double getTotalTime(MovableObject movable){
		double time = movable.getTimeToMove(1);
		movable.brake();
		time += movable.getTimeToMove(0.1);
		movable.accelerate();
		time += movable.getTimeToMove(1);
		return time;
	}

	public static void main(String[] args) {
		ConstantSpeedMovable x = new ConstantSpeedMovable(10);
		GenericMovable y = new GenericMovable(5);
		GenericMovable z = new GenericMovable(5);
		
		z.accelerate();
		
		System.out.println("Time to move x : "+x.getTimeToMove(1));
		System.out.println("Time to move y : "+y.getTimeToMove(1));
		System.out.println("Time to move z : "+z.getTimeToMove(1));
		
		System.out.println("Total ttm x : "+getTotalTime(x));
		System.out.println("Total ttm y : "+getTotalTime(y));
		System.out.println("Total ttm z : "+getTotalTime(z));
		
	}

}
