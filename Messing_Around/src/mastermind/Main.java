package mastermind;

import java.util.Scanner;

public class Main {
	//Written by Thomas Dekker
	//Source code found at: https://github.com/Tomdek/messing-around-with-java/blob/master/Messing_Around/src/mastermind/Main.java
	public static final int MAX_NR_OF_TURNS = 10;
	public static final int RED = 1;
	public static final int WHITE = 2;
	public static final int YELLOW = 3;
	public static final int GREEN = 4;
	public static final int PURPLE = 5;
	public static final int ORANGE = 6;
	public static final int MAGENTA = 7;
	public static final int BLUE = 8;
	
	private Scanner sc = new Scanner(System.in);
	private String overview = "Overview of colours: red, white, yellow, green, purple, orange, magenta, blue.\n";
	
	private void gameOver(boolean hasWon) {
		if (hasWon) {
			System.out.print(" ---------------- \n|    You won!    |\n|Congratulations!|\n ---------------- \n");
		} else {
			System.out.print(" ---------------- \n|   Game Over    |\n ---------------- \n");
		}
		System.out.print("Press Enter to play again.");
		sc.nextLine();
		start();
	}
	
	private void visualize(Code[] attempts, int[][] feedback) {
		//TODO visualize the entire board (including all past turns)
	}
	
	private Code askAttempt() {
		Code result = new Code(false);
		boolean validCode = false;

		while(!validCode) {
			System.out.print(overview);
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
	
	void printStartingMessage() {
		String s1 = "Welcome to Text-Mastermind. The rules are simple:\n";
		String s2 = "It is your job to break the secret colour-code within " + MAX_NR_OF_TURNS + " turns.\n";
		String s3 = "To do this, you enter a sequence of 4 colours and press return.\n";
		String s4 = "Feedback will then be given through the colours Red and White.\n";
		String s5 = "White means a colour is correct, red means a colour is correct and correctly placed.\n";
		String s6 = "The order of the feedback does necesserily not correspond to the order of the code.\n";
		String s7 = "The total number of colours is 8 and each colour can only exist once in a code.\n";
		String s8 = "To enter a code simply type the first letter of each colour.\n";
		String s9 = "EXAMPLE: to enter \"Red Green Blue White\" you type: r g b w\n";
		String s10 = "GOOD LUCK!\n";
		String br = "\n";
		System.out.print(s1 + s2 + s3 + s4 + s5 + s6 + s7 + br + s8 + s9 + s10);
	}
	
	void start() {
		printStartingMessage();
		
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
