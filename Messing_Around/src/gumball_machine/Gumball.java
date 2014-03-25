package gumball_machine;

public class Gumball {
	public Gumball() {
		NoQuarter NoQuarter=new NoQuarter();
		HasQuarter HasQuarter=new HasQuarter();
		GumballSold GumballSold=new GumballSold();
		SoldOut SoldOut=new SoldOut();

		boolean quarter=true;
		boolean crank=true;
		int numGumballs=5;
		boolean fill=true;

		if(quarter == true){ 
			NoQuarter.insertQuarter();
			if(crank == true){
				HasQuarter.turnCrank();
				if(numGumballs > 0){
					GumballSold.dispense();
				} else SoldOut.soldOut();
				if(fill == true){
					NoQuarter.insertQuarter();
				} else SoldOut.soldOut();
			} else HasQuarter.ejectQuarter();
		}
	}

	public static void main(String[] args) {
		new Gumball();

	}

}
