package extra;

public class Lab32B extends Lab32 {
	
	private int huidigestaat;
	
	Lab32B(int staat) {
		huidigestaat = staat; 
	}
	
	int nextState() {
		switch (huidigestaat) {
			case A: return 1; 
			case B: return 42; 
			case C: return 2; 
			case D: return 45; 
			case E: return 4; 
			case F: return 25; 
			case G: return 5; 
			case H: return 5; 
			case I: return 2; 
			case J: return 5;  
			default: return huidigestaat;
		}
	}
}
