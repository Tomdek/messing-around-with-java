package mastermind;

public class Main {
	public static final int MAX_NR_OF_TURNS = 10;
	public static final int RED = 1;
	public static final int WHITE = 2;
	public static final int YELLOW = 3;
	public static final int GREEN = 4;
	public static final int PURPLE = 5;
	public static final int ORANGE = 6;
	public static final int MAGENTA = 7;
	public static final int BLUE = 8;
	
	private void gameOver(boolean hasWon) {
		//TODO game over screen: if haswon==true then player won!
	}
	
	private void visualize(Code[] attempts, int[][] feedback) {
		//TODO visualize it somehow
	}
	
	private Code askAttempt() {
		Code result = new Code();
		//TODO Get user input and convert to Code object
		return result;
	}
	
	void start() {
		Code secretCode = new Code();
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
