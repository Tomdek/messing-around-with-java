package mastermind;

public class Code {
	
	private int[] colours = new int[4];
	
	public Code(int c1, int c2, int c3, int c4) {
		colours[0] = c1;
		colours[1] = c2;
		colours[2] = c3;
		colours[3] = c4;
	}
	
	public Code() {
		//generate random code
	}
	
	private int getColour(int position) {
		return colours[position];
	}
	
	public int[] compare(Code code) {
		int counter = 0;
		int[] result = new int[4];
		
		//check correctly placed colours.
		for(int i = 0; i < colours.length; i++) {
			if(code.getColour(i) == colours[i]) {
				result[counter] = Main.RED;
				counter += 1;
			}
		}
		
		//check if colour exists in code.
		for(int i = 0; i < colours.length; i++) {
			for(int j = 0; j < colours.length; j++) {
				if(i != j && code.getColour(i) == colours[j]) {
					result[counter] = Main.WHITE;
					counter += 1;
				}
			}
		}
		
		return result;
	}
}
