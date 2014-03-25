package dwellings;

public class Window {
	private int width;
	private int height;
	private int xPos;
	private int yPos;
	
	public Window(int width, int height, int  xPos, int yPos) {
		this.width = width;
		this.height = height;
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public String toString() {
		return "A " + width + "x" + height + " window at " + xPos + "," + yPos;
	}
	
}
