package polyPractice;

public class PolyPractice {

	public static void main(String[] args) {
		
		Car car = new Car();
		Bicycle bicyle = new Bicycle();
		Boat boat = new Boat();
		
		Vehicle[] racers = {car,bicyle,boat};
		
		for(Vehicle x : racers) {
			x.go();
			
			
		}
	}
}
