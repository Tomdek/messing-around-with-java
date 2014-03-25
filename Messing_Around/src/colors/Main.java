package colors;

public class Main {

	public void start() {
		AlphaChannelColor acc = new AlphaChannelColor(0, 0, 0, 0);
		System.out.print(acc.getRed() + " " + acc.getGreen() + " " + acc.getBlue() + "\n");
		acc.dissolve();
		System.out.print(acc.getRed() + " " + acc.getGreen() + " " + acc.getBlue());
	}
	
	public static void main(String[] args) {
		new Main().start();

	}

}
