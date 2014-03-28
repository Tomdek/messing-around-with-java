package mastermind;

import java.util.ArrayList;
import java.util.Collections;

public class Code {
	//written by Thomas Dekker
	private int[] colours = new int[4];
	private int length;
	
	public Code(int c1, int c2, int c3, int c4) { //initiate with colours
		colours[0] = c1;
		colours[1] = c2;
		colours[2] = c3;
		colours[3] = c4;
		length = 4;
	}
	
	public Code(boolean random) { //initiate either random or empty
		if(random) { //creates 4 unique numbers
			ArrayList<Integer> numbers = new ArrayList<>();
			
			for(int i = 1; i <= 8; i++) {
				numbers.add(i);
			}
			
			Collections.shuffle(numbers);
			colours[0] = numbers.get(1);
			colours[1] = numbers.get(2);
			colours[2] = numbers.get(3);
			colours[3] = numbers.get(4);
			
		} else {
			colours[0] = 0;
			colours[1] = 0;
			colours[2] = 0;
			colours[3] = 0;
			length = 0;
		}
		
	}
	
	public int getLength() {
		return length;
	}
	
	public int setNextColour(int colour) {
		if(length >= 4) {
			return length;
		} else {
			colours[length] = colour;
			length++;
			return length;
		}
	}
	
	public int getColour(int position) {
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
