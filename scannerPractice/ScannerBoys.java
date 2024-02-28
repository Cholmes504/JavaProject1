package scannerPractice;

import java.util.Scanner;


public class ScannerBoys {

public static void main (String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("What's your name?");
	String name = scanner.nextLine();
	System.out.println("How old are you?");
	int age = scanner.nextInt()	;
	System.out.println("What's up " + name);
	System.out.println(name + " is " + age + " years old");
	 
	
	
}
	
}
