package stringPractice;

public class StringMethods {

	public static void main(String[] args) {
		String name = "Christian";
		
		//boolean result = name.equals("christian");
		//boolean result = name.equalsIgnoreCase("christian");
		
		//int result = name.length();
		
		// The char goes by index value, so starts at 0. char result = name.charAt(4);
		//int result = name.indexOf('i');
		//int result = name.lastIndexOf('i');
		//boolean result = name.isEmpty();
		//String result = name.toUpperCase();
		//String result = name.toLowerCase();
		String result = name.replace('C', 'B');
		//String result = name.trim(); removes spaces in answer
		
		System.out.println(result);
		
	}
}
