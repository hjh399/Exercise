import java.util.Scanner;

public class E4_31 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter input
    System.out.print("Enter the initial deposit amount: ");
    double amount = input.nextDouble();
        
    System.out.print("Enter annual percentage yield: ");
    double annualInterestRate = input.nextDouble();
    double monthlyInterestRate = annualInterestRate / 1200;
    
    System.out.print("Enter maturity period (number of months): ");    
    int numberOfMonth = input.nextInt();
    
    double value = amount ;
    
    System.out.println("Month\t\t\tCD Value");
    
    for (int i = 1 ; i <= numberOfMonth ; i ++ )
    {
    	value *= (1 + monthlyInterestRate);
    	System.out.println(i +"\t\t\t" + value );
    	
    }
 
  }
}