package arrayPractice;

import java.util.ArrayList;


public class ArrayLists {
	public static void main(String[] args) {
		//Array List= a resizable array, that can add and remove elements 
		//If using primitive data types, use wrapper class
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Pizza");
		food.add("Chicken");
		food.add("Hotdog");
		
		food.set(0, "sushi");
		food.remove(2);
		//food.clear();
		
		for(int i=0; i<food.size();i++) {
			
			System.out.println(food.get(i));
		}
		
		
	}
}
