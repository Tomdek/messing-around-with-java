package gumball_t;

public class GumballSold {
	private int numGumballs;
	private SoldOut soldOut = new SoldOut();
	
	public GumballSold(int amount) {
		numGumballs = amount;
	}
	
	public void turnCrank() {
		if (!soldOut.check(numGumballs)) {
			dispense();
		} else {
			System.out.print("Out of Gumballs. \n" + "A request has been sent to refill the machine.\n");
			fill(3);
		}
	}
	
	public void fill(int amount) {
		numGumballs += amount;
	}
	
	private void dispense() {
		System.out.print("*A gumball rolls down.*\n");
		numGumballs -= 1;
	}
	
	public int numGumballs() {
		return numGumballs;
	}
	
}
