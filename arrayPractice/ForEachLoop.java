package arrayPractice;

import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		//Enhanced For Loop; traversing technique through elements in an array
		
		//String[] animals = {"cat","bird","dog","rat"};
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");
		
		for(String i : animals) {
			System.out.println(i);
		}
		}
	}


