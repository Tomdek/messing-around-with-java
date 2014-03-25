package iCalculator;

public class ICalculator3 extends ICalculator {
	public ICalculator3() {
		super();
	}
	
	public int div(int value) {
		if(value == 0) {
			System.out.print("ZERO DIVIDE ATTEMPTED");
			return super.getCurrentValue();
		} else {
			return super.div(value);
		}
	}
	
}
/* 
-----------
BRB :D:D:D
-----------
*/ 