import java.util.Scanner;

import javax.swing.JOptionPane;

public class E2_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of water in kilograms: ");
		double amount = input.nextDouble();
		
		System.out.print("Enter the inital temperature: ");
		double initialTemperature = input.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		
		double q = amount * ( finalTemperature - initialTemperature ) * 4184 ;
		
		System.out.println("The energy needed is " + q);
	}
}
 