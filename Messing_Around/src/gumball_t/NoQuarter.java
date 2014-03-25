package gumball_t;

import java.util.Scanner;

public class NoQuarter {
	public static int MAX_NUMBER_OF_GUMBALLS = 3;
	
	Scanner sc = new Scanner(System.in);
	HasQuarter hasQuarter = new HasQuarter();
	GumballSold gumballSold = new GumballSold(MAX_NUMBER_OF_GUMBALLS);
	
	public void main() {
		System.out.print(
				"----------------------------------------------------------------------------\n" + 
				"- WELCOME to V.I.S.A.G.E the Virtual Interactive Simulated Gumballmachine. -\n" + 
				"----------------------------------------------------------------------------\n"
		);
		boolean loop = true;
		while (loop) {
			
			System.out.print("V.I.S.A.G.E has " + gumballSold.numGumballs() + " gumballs remaining.\n");
			
			if (hasQuarter.hasQuarter()) {
				System.out.print("Turn crank or Eject quarter? (t/e): ");
				String input = sc.next();
				if (input.equals("t")) { //CRANK
					System.out.print("Turning Crank\n");
					gumballSold.turnCrank();
					hasQuarter.ejectQuarter();
				} else { //EJECT
					System.out.print("Ejecting Quarter\n");
					hasQuarter.ejectQuarter();
				}
			} else {
				System.out.print("No quarter.\n"+"Would you like to insert a quarter? (y/n): ");
				String input = sc.next();
				if (input.equals("y")) {
					hasQuarter.insertQuarter();
				} else {
					System.out.print("*A quarter rolls down*\n" + "V.I.S.A.G.E is shutting down.\n");
					hasQuarter.ejectQuarter();
					loop = false;
				}
			}
		} 
	}

	public static void main(String[] args) {
		new NoQuarter().main();
	}

}
