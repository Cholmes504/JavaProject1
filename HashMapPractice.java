package practiceProblem;

import java.util.HashMap;




public class HashMapPractice {

	
	public static void main(String[] args) {

		HashMap<String,String> countries = new HashMap<String,String>();
		
		//add a key and value 
		countries.put("USA", "Washington D.C.");
		countries.put("India", "New Delhi");
		countries.put("Russia", "Moscow");
		countries.put("China", "Beijing");
		
		
		
		for(String i : countries.keySet()) {
			
			System.out.print(i+"\t"+"= ");
			System.out.println(countries.get(i));
		}
		
		//countries.replace("USA", "Detroit");
		
		//countries.clear();
		
		//System.out.println(countries.containsKey("Russia"));
		
		//System.out.println(countries);
		
		//System.out.println(countries.size());
		
		
		
	}

}
