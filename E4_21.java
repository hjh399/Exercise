import java.util.Scanner;

public class E4_21 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("Loan Amount: ");
	  int amount = input.nextInt();
	  System.out.print("Number of years: ");
	  int years = input.nextInt();
	  
	  System.out.println("Interest Rate\t\tMonthly Payment\t\tTotal Payment \n");
	  
	  for (double rate = 5 ; rate <=8 ; rate += 0.125)
	  {
		  System.out.print(rate + "%\t\t\t" );
		  
		  double monthlyInterestRate = rate / 1200;
		  double monthlyPayment = amount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
		  System.out.printf("%1.2f \t\t\t",monthlyPayment);
		  
		  double totalPayment = monthlyPayment * years * 12;
		  System.out.printf("%1.2f \n",totalPayment);
		  
	  }
  }
}