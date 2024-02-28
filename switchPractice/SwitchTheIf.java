package switchPractice;

import java.util.Scanner;

public class SwitchTheIf {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What day is it?");
		
		String day = scanner.next();
		
		switch(day) {
		case "Sunday" : System.out.println("Sunday Funday");
		break;
		case "Monday" : System.out.println("ughhhh");
		break;
		case "Tuesday" : System.out.println("Tacoooo Tueeesdayyy!");
		break;
		case "Wednesday" : System.out.println("Hump DAY");
		break;
		case "Thursday" : System.out.println("Thirsty Thursday!");
		break;
		case "Friday" : System.out.println("Ladies and Gentlemen, the Weekend");
		break;
		case "Saturday" : System.out.println("For The Bois");
		break;
		default: System.out.println("That isn't a day! Come on now bruh!");
		}
		
	}

}
