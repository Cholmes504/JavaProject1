package basicGUI;

import javax.swing.JOptionPane;


public class GUI {
	public static void main(String [] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		//JOptionPane.showMessageDialog(null, "Who is this?");
		
		if(name.equalsIgnoreCase("Aileen")) {
			JOptionPane.showMessageDialog(null, "You are so beautiful! I love you");
		}
		
		else if(name != "Aileen") {
			JOptionPane.showMessageDialog(null, "Hello " + name);
		}
		
		
		
		
		
		//String name = JOptionPane.showInputDialog("Enter your name");
		//JOptionPane.showMessageDialog(null, "Hello " + name);
		
		//int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		//JOptionPane.showMessageDialog(null, "You are " + age + " years old!");

		//JOptionPane.showMessageDialog(null, name + " is " + age + " years old");
	}
}
