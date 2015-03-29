import java.util.Scanner;

public class E5_7 {
  public static void main(String[] args) {
	  int year = 1;
	  int i;
	  
	  Scanner input = new Scanner(System.in);
	  System.out.print("The amount invested: ");
	  double investmentAmount = input.nextDouble();
	  System.out.print("Annual interest rate: ");
	  double annuallyInterestRate = input.nextDouble();	  
	  double monthlyInterestRate = annuallyInterestRate / 12;
	  
	  System.out.println("Year\t\t\tFuture Value");
	  for (i = 1 ; i <= year ; i ++ )
	  {	  
	  System.out.println(i + "\t\t\t" + futureInvestmentValue(investmentAmount, annuallyInterestRate, i));
	  }
	  
	}
  
  public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
	  double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate / 100.0 ) , years * 12); 
	  return futureInvestmentValue;
	}  
} 