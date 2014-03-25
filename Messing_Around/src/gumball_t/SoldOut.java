package gumball_t;

public class SoldOut {
	private boolean soldOut;
	
	SoldOut() {
		soldOut = false;
	}
	
	public boolean check(int numGumballs) {
		if (numGumballs > 0) {
			soldOut = false;
		} else {
			soldOut = true;
		}
		return soldOut;
	}
	
	public boolean soldOut() {
		return soldOut;
	}
	
}
