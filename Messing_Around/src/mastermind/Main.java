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
	
	private void gameOver(boolean hasWon, Code secretCode) {
		if (hasWon) {
			System.out.print(" ---------------- \n|    You won!    |\n|Congratulations!|\n ---------------- \n");
		} else {
			System.out.print(" ---------------------\n|      Game Over      |\n|The correct code was:|\n|      |");
			printAttempt(secretCode);
			System.out.print("      |\n ---------------------\n");
		}
		System.out.print("Press Enter to play again.");
		sc.nextLine();
		start();
	}
	
	private void printAttempt(Code attempt) {
		for (int i = 0; i < 4; i++) { //print attempt
				switch (attempt.getColour(i)) {
				case RED: System.out.print("R|"); break;
				case WHITE: System.out.print("W|"); break;
				case YELLOW: System.out.print("Y|"); break;
				case GREEN: System.out.print("G|"); break;
				case PURPLE: System.out.print("P|"); break;
				case ORANGE: System.out.print("O|"); break;
				case MAGENTA: System.out.print("M|"); break;
				case BLUE: System.out.print("B|"); break;
				default: System.out.print(" |"); break;
				}
			}
	}
	
	private void printFeedback(Code feedback) {
		for (int i = 0; i < 4; i++) { //print feedback
				switch (feedback.getColour(i)) {
				case RED: System.out.print("R|"); break;
				case WHITE: System.out.print("W|"); break;
				default: System.out.print(" |"); break;
				}
			}
	}
	
	private void visualize(Code[] attempts, Code[] feedback, int turn) {
		//TODO visualize the entire board (including all past turns)
		String header = "|CODES   |:|FEEDBACK|\n";
		String footer = "||_________________||\n";
		
		System.out.print(header); // start of board
		for (int i = 0; i < turn; i++) { //one loop per attempt to print full board history
			System.out.print(i+1 + "|"); //print turn number
			printAttempt(attempts[i]);
			System.out.print(":|"); //bit in between code and feedback
			printFeedback(feedback[i]);
			System.out.print("|\n"); //end of line
		}
		System.out.print(footer); //end of board
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
		Code[] feedback = new Code[MAX_NR_OF_TURNS];
		int turn = 0;
		boolean hasWon = false;
		
		while(turn < MAX_NR_OF_TURNS && !hasWon) {
			attempts[turn] = askAttempt();
			feedback[turn] = secretCode.compare(attempts[turn]);
			
			hasWon = true;
			for(int i = 0; i < 4; i++) {
				if(feedback[turn].getColour(i) != RED) {
					hasWon = false;
				}
			}
			
			turn++;
			visualize(attempts, feedback, turn);
		}
		
		gameOver(hasWon, secretCode);
		
	}
	
	public static void main(String[] args) {
		new Main().start();

	}

}
