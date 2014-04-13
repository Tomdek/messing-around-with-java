package extra;

public class Lab32A extends Lab32 {
	
	private int huidigestaat;
	
	Lab32A(int staat) {
		huidigestaat = staat; 
	}
	
	int nextState() {
		switch (huidigestaat) {
			case A: return B;
			case B: return C; 
			case C: return C;
			case D: return F; 
			case E: return C; 
			case F: return H; 
			case G: return H; 
			case H: return H; 
			case I: return I; 
			case J: return J;  
			default: return huidigestaat;
		}
	}
}
