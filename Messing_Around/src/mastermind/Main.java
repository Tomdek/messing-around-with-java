package mastermind;

import java.util.Scanner;

public class Main {
	//written by Thomas Dekker
	public static final int MAX_NR_OF_TURNS = 10;
	public static final int RED = 1;
	public static final int WHITE = 2;
	public static final int YELLOW = 3;
	public static final int GREEN = 4;
	public static final int PURPLE = 5;
	public static final int ORANGE = 6;
	public static final int MAGENTA = 7;
	public static final int BLUE = 8;
	
	Scanner sc = new Scanner(System.in);
	
	private void gameOver(boolean hasWon) {
		//TODO game over screen: if haswon==true then player won!
	}
	
	private void visualize(Code[] attempts, int[][] feedback) {
		//TODO visualize it somehow
	}
	
	private Code askAttempt() {
		Code result = new Code(false);
		boolean validCode = false;

		while(!validCode) {
			System.out.print("Your code: ");
			String input = sc.nextLine();
			char[] tokens = input.toLowerCase().trim().toCharArray();

			for (int i = 0; i < tokens.length; i++) {
				switch (tokens[i]) {
				case 'r': result.setNextColour(RED); break;
				case 'w': result.setNextColour(WHITE); break;
				case 'y': result.setNextColour(YELLOW); break;
				case 'g': result.setNextColour(GREEN); break;
				case 'p': result.setNextColour(PURPLE); break;
				case 'o': result.setNextColour(ORANGE); break;
				case 'm': result.setNextColour(MAGENTA); break;
				case 'b': result.setNextColour(BLUE); break;
				default: break;
				}
			}
			validCode = result.getLength() == 4;
		}
		return result;
	}
	
	void start() {
		Code secretCode = new Code(true);
		Code[] attempts = new Code[MAX_NR_OF_TURNS];
		int[][] feedback = new int[MAX_NR_OF_TURNS][4];
		int turn = 0;
		boolean hasWon = false;
		
		while(turn < MAX_NR_OF_TURNS && !hasWon) {
			attempts[turn] = askAttempt();
			feedback[turn] = secretCode.compare(attempts[turn]);
			
			visualize(attempts, feedback);
			
			hasWon = true;
			for(int i = 0; i < 4; i++) {
				if(feedback[turn][i] != RED) {
					hasWon = false;
				}
			}
			
			turn += 1;
		}
		
		gameOver(hasWon);
		
	}
	
	public static void main(String[] args) {
		new Main().start();
		

	}

}
