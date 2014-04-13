package extra;

public class Lab32A extends Lab32 {
	int nextState() {		
		switch (super.huidigestaat) {
			case 1: return 23;
			case 23: return 3; 
			case 3: return super.huidigestaat;
			case 42: return 34; 
			case 2: return 3; 
			case 34: return 4; 
			case 45: return 4; 
			case 4: return 4; 
			case 25: return 3; 
			case 5: return 5;  
			default: return super.huidigestaat;
		}
	}
}
