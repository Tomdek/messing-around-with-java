package colors;

public class AlphaChannelColor extends Color {
	private int alpha;
	
	public AlphaChannelColor(int red, int green, int blue, int alpha) {
		super(red, green, blue);
		this.alpha = alpha;
		
	}
	
	public int getAlpha() {
		return alpha;
	}
	
	public void dissolve() {
		alpha += 1;
		super.setRed(super.getRed() + 1);
		super.setGreen(super.getGreen() + 1);
		super.setBlue(super.getBlue() + 1);
	}
	
}
