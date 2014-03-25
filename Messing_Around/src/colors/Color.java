package colors;

public class Color {
	private int red = 1;
	private int green = 2;
	private int blue = 3;
	
	public Color(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	public int getRed() {
		return red;
	}
	
	public int getGreen() {
		return green;
	}
	
	public int getBlue() {
		return blue;
	}
	
	protected void setRed(int value) {
		red = value;
	}
	
	protected void setGreen(int value) { 
		green = value;
	}
	
	protected void setBlue(int value) { 
		blue = value;
	}
}
