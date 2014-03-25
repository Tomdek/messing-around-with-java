package vehicles;

public class Vehicle {
	private double maxSpeed;
	protected double currentSpeed;
	
	public Vehicle(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void accelerate() {
		currentSpeed++;
	}
	
	public double getCurrentSpeed() {
		return currentSpeed;
	}
	
	public double getMaxSpeed() {
		return maxSpeed;
	}
	
	public void pedalToTheMetal() {
		while(currentSpeed < maxSpeed) {
			accelerate();
		}
	}
}
