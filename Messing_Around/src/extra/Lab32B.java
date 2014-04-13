package extra;

public class Lab32B extends Lab32 {
	int nextState() {
		switch (super.huidigestaat) {
			case 1: return 1; 
			case 23: return 42; 
			case 3: return 2; 
			case 42: return 45; 
			case 2: return 4; 
			case 34: return 25; 
			case 45: return 5; 
			case 4: return 5; 
			case 25: return 2; 
			case 5: return 5;  
			default: return super.huidigestaat;
		}
	}
}
