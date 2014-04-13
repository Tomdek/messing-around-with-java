package extra;
//13-4-2014
// Original code by Charlotte Hanekamp @ http://pastebin.com/pnZjApsT
// Modified by Thomas Dekker
public class Lab32 {
	
	public int huidigestaat = 1;

	void start() {
		int a=1;int b=23;int c=3;int d=42;int e=2;int f=34;int g=45;int h=4;int i=25;int j=5;
		String input="abbb";
		for(int k=0;k<input.length();k++){
			if (input.charAt(k)=='a') {
				Lab32A action = new Lab32A();
				huidigestaat = action.nextState();
				//System.out.print(huidigestaat + " a\n");
			} else {
				Lab32B action = new Lab32B();
				huidigestaat = action.nextState();
				//System.out.print(huidigestaat + " b\n");
			}
		}
		if ((huidigestaat==5)||(huidigestaat==25)||(huidigestaat==45)){
			System.out.println("Final state gehaald!");}
		else System.out.println("Final state niet gehaald!");
		System.out.println("Final state: "+huidigestaat);
	}
	
	public static void main(String[] args) {
		new Lab32().start();
	}
	
}