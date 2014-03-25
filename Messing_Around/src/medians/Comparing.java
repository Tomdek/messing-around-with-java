package medians;

//import java.util.Arrays;

public class Comparing {
	//String[] x = new String[] {"Bob", "Carol", "Ted", "Alice", "Fred"}; //as ex. 1
	String[] x = new String[] {"Bob", "Carol", "Ted", "Alice", "Fred", "Sue"}; //as ex. 2
	Comparable m = 0;

	void main() {
		
		
		java.util.Arrays.sort(x);
		m = x[(x.length / 2)];
		
		
	}
	
	public static void main(String[] args) {
		new Comparing().main();

	}

}
