package gumball_t;

public class HasQuarter {
	private boolean hasQuarter;
	
	public HasQuarter() {
		hasQuarter = false;
	}
	
	public boolean hasQuarter() {
		return hasQuarter;
	}
	
	public void insertQuarter() {
		hasQuarter = true;
	}
	
	public void ejectQuarter() {
		hasQuarter = false;
	}
	
	
}
