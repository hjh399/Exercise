import java.util.Scanner;

public class E4_22 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Loan Amount: ");
	  int amount = input.nextInt();
	  double balance = amount ;
	  
	  System.out.print("Number of years: ");
	  int years = input.nextInt();
	  System.out.print("Annual Interest Rate: ");
	  double rate = input.nextInt();

	  double monthlyInterestRate = rate / 1200;
	  
	  double monthlyPayment = amount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
	  System.out.println("Monthly Payment: " + monthlyPayment);
	  
	  double totalPayment = monthlyPayment * years * 12;
	  System.out.println("Total Payment: " + totalPayment);
  
	  System.out.println("Payment#\tInterest\t\tPrincipal\t\tBalance \n");
	  
	  for ( int month = 1 ; month <= years * 12 ; month ++)
	  {
		  System.out.print(month + "\t\t" );
		  
		  double interest = monthlyInterestRate * balance;
		  System.out.printf("%1.2f \t\t\t",interest);		  
		  
		  double principal = monthlyPayment - interest;
		  System.out.printf("%1.2f \t\t\t",principal);

		  balance -= principal;
		  System.out.printf("%1.2f \n",balance);
		  
		  principal -= interest;
		  
	  }
  }
}