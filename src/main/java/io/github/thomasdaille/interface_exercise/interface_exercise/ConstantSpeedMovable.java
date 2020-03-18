package io.github.thomasdaille.interface_exercise.interface_exercise;

public class ConstantSpeedMovable implements MovableObject {
	
	private double constant_speed;
	
	public ConstantSpeedMovable(double constant_speed) {
		this.constant_speed = constant_speed;
	}

	@Override
	public boolean canAccelerate() {
		return false;
	}

	@Override
	public void accelerate() {
				
	}

	@Override
    public double getTimeToMove(final double distance) {
        return (distance / constant_speed) * 60;
    }
	
    @Override
    public String toString() {
        return "ConstantSpeedMovable{" + "speed=" + this.constant_speed + '}';
    }

	@Override
	public void brake() {
		
	}
	
}
