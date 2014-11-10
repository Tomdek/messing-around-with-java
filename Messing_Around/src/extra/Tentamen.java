/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra;
import java.util.*;
import java.io.PrintStream;

/**
 *
 * @author Charlotte
 */
public class Tentamen {
	
	public static int MAX_AANTAL_STUDENTEN = 9;
	public static int MIN_AANTAL_STUDENTEN = 2;

	private PrintStream pr = new PrintStream(System.out);
	private Scanner sc= new Scanner(System.in);
	
	public void printIntro() {
		pr.println("Dit programma is gemaakt door:");
		pr.println("Charlotte Hanekamp\n"+"IT201\n"+"500699359\n\n");
	}
	
	private String vraagVakNaam() {
		pr.println("Wat is de naam van het vak?");
		return sc.nextLine();
	}
	
	private int vraagHoeveelStudenten() {
		pr.println("Hoeveel studenten volgen dit vak? 2...9");
		return sc.nextInt();
	}
	
	private String[] fillStudentNames(int totalStudents) {
		String[] result = new String[totalStudents];
		// al die shit uit die for loop hierin
		return result;
	}
	
	private double[] fillGrades(int totalStudents) {
		double[] result = new double[totalStudents];
		// al die shit uit die for loop hierin
		return result;
	}
	
	private char[] fillPractica(int totalStudents) {
		char[] result = new char[totalStudents];
		 // al die shit uit die for loop hierin
		return result;
	}
	
	
    public void start() {
    	
        printIntro();
        String vakNaam = vraagVakNaam();
        int totalStudents = vraagHoeveelStudenten();
        
        if((totalStudents>MAX_AANTAL_STUDENTEN)||(totalStudents<MIN_AANTAL_STUDENTEN)){
            System.out.println("ERROR fout getal ingevoerd. Probeer het nog een keer!");
            System.out.println("Hoeveel studenten volgen dit vak?");
            totalStudents=sc.nextInt();
        }
        
        String[] students = fillStudentNames(totalStudents);
        double[] grades = fillGrades(totalStudents);
        char[] practica = fillPractica(totalStudents);
        
        int i;
        double average=0;
        double total=0;
        
        for (i=0;i<totalStudents;i++){
            int j=i+1;
            System.out.println("Naam van student "+j);
            String name=sc.next();
            students[i]=name;
            
            System.out.println("Wat is het cijfer van "+name+". 1...10");
            double grade=sc.nextDouble();
            grades[i]=grade;
            if((grade>10)||(grade<1)){
                System.out.println("ERROR fout getal ingevoerd. Probeer het nog een keer!");
                System.out.println("Wat is het cijfer van "+name);
                grade=sc.nextDouble();
                grades[i]=grade;
            }
            total=total+grade;
            
            System.out.println("Wat is het practicum resultaat van "+name+". v of o");
            String line=sc.next();
            //System.out.println(line);
            char practicum=line.charAt(0);
            System.out.println(practicum);
            practica[i]=practicum;
            if(!(practicum=='v'||practicum=='o')){
                System.out.println("ERROR fout antwoord ingevoerd. Probeer het nog een keer!");
                System.out.println("Wat is het practicum resultaat van "+name+". v of o");
                line=sc.next();
                practicum=line.charAt(0);  
                practica[i]=practicum;
            }
        }
        int geslaagd=0, gezakt=0;
        for (int k=0;k<totalStudents;k++){
            System.out.print(students[k]+" heeft voor programming een "+ grades[k]+" en een "+practica[k]+" gehaald");
            if((grades[k]>=5.5)&&(practica[k]=='v')){
                System.out.println("--> gehaald");
                geslaagd++;
            }else System.out.println("---> gezakt");gezakt++;
        }
        
        average=total/i;
        System.out.println("het gemiddelde cijfer is: "+average);
        if(geslaagd>gezakt){
            System.out.println("Dit vak is best goed gemaakt!");
        }else System.out.println("Dit vak is niet goed gemaakt!");
    }
	
    public static void main(String[] args) {
    	new Tentamen().start();
    }
    
}
