import java.util.Scanner;

import javax.swing.JOptionPane;

public class E2_13 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter investment amount:");		
		double investmentAmount = input.nextDouble();
		
		
		System.out.print("Enter monthly interest rate:");
		double annuallyInterestRate = input.nextDouble();
		

		System.out.print("Enter number of years:");
		int years = input.nextInt();
		
		double futureInvestmentValue = investmentAmount * Math.pow((1 + annuallyInterestRate / 100.0 ) , years);
		System.out.println("Accumulated value is " + (int)(futureInvestmentValue * 100) / 100.0);

	}
}
