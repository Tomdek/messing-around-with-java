package extra;

public class Lab32A extends Lab32 {
	
	private int huidigestaat;
	
	Lab32A(int staat) {
		huidigestaat = staat; 
	}
	
	int nextState() {
		switch (huidigestaat) {
			case A: return 23;
			case B: return 3; 
			case C: return huidigestaat;
			case D: return 34; 
			case E: return 3; 
			case F: return 4; 
			case G: return 4; 
			case H: return 4; 
			case I: return 3; 
			case J: return 5;  
			default: return huidigestaat;
		}
	}
}
