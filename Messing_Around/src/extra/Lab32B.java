package extra;

public class Lab32B extends Lab32 {
	
	private int huidigestaat;
	
	Lab32B(int staat) {
		huidigestaat = staat; 
	}
	
	int nextState() {
		switch (huidigestaat) {
			case A: return A; 
			case B: return D; 
			case C: return E; 
			case D: return G; 
			case E: return H; 
			case F: return I; 
			case G: return J; 
			case H: return J; 
			case I: return E; 
			case J: return J;  
			default: return huidigestaat;
		}
	}
}
