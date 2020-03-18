package io.github.thomasdaille.interface_exercise.interface_exercise;

public class GenericMovable implements MovableObject {
	
	private double speed;
	
	public GenericMovable(double speed) {
		this.speed = speed;
	}

	@Override
	public boolean canAccelerate() {
		return true;
	}

	@Override
	public void accelerate() {
		speed++;
	}

	@Override
	public double getTimeToMove(double distance) {
		return (distance/speed) * 60;
	}
	
    @Override
    public String toString() {
        return "GenericMovable{" + "speed=" + this.speed + '}';
    }

	@Override
	public void brake() {
		speed--;
	}

}
