package iCalculator;

public class ICalculator {
	private int currentValue;
	
	public ICalculator() {
		currentValue = 0;
	}
	
	public int div(int value) {
		currentValue /= value;
		return currentValue;
	}
	
	public int getCurrentValue() {
		return currentValue;
	}
}
