package extra;

import java.util.Scanner;

//13-4-2014
// Original code by Charlotte Hanekamp @ http://pastebin.com/pnZjApsT
// Modified by Thomas Dekker
public class Lab32 {
	
	public static final int A=1;
	public static final int B=23;
	public static final int C=3;
	public static final int D=42;
	public static final int E=2;
	public static final int F=34;
	public static final int G=45;
	public static final int H=4;
	public static final int I=25;
	public static final int J=5;
	
	public int huidigestaat = A;
	private Scanner in = new Scanner(System.in);
	
	void start() {
		System.out.print("Starting state: " + A + "\ninput: " );
		String input= in.nextLine();
		for(int k=0;k<input.length();k++) {
			if (input.charAt(k)=='a') {
				Lab32A action = new Lab32A(huidigestaat);
				huidigestaat = action.nextState();
			} else {
				Lab32B action = new Lab32B(huidigestaat);
				huidigestaat = action.nextState();
			}
		}
		if ((huidigestaat==J)||(huidigestaat==I)||(huidigestaat==G)){
			System.out.println("Final state gehaald!");
		} else {
			System.out.println("Final state niet gehaald!");
		}
		System.out.println("Final state: "+huidigestaat);
	}
	
	public static void main(String[] args) {
		new Lab32().start();
	}
	
}