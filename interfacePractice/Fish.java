package interfacePractice;

public class Fish implements Predator,Prey{

	public void hunt() {
		System.out.println("The Fish is hunting is hunting smaller fish");
		
	}
	public void flee() {
		System.out.println("The Fish is fleeing from a bigger fish");
	}
}