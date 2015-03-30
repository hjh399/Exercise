import java.util.Scanner;

public class E2_13 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter investment amount:");		
		double investmentAmount = input.nextDouble();
		
		
		System.out.print("Enter monthly interest rate:");
		double monthlyInterestRate = input.nextDouble();
		double annuallyInterestRate= monthlyInterestRate / 12;
		

		System.out.print("Enter number of years:");
		int years = input.nextInt();
		
		double futureInvestmentValue = investmentAmount * Math.pow((1 + annuallyInterestRate / 100.0 ) , years * 12);
		System.out.printf("%2.2f",futureInvestmentValue);
	}
}
