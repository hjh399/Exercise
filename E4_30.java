import java.util.Scanner;

public class E4_30 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter input
    System.out.print("Enter the money: ");
    System.out.print("Enter the interest: ");
    System.out.print("Enter the number of months: ");    
    double number = input.nextDouble();
    int interest = input.nextInt();
    int numberOfMonth = input.nextInt();
    
    double amount = number;
    
    for (int i = 1 ; i <= numberOfMonth ; i ++ , amount += number  )
    {
    	amount *= (1 + interest / 100.0 / 12);    	    	
    }
    
    System.out.println("after " + numberOfMonth + " months,the amount is " + ( amount - number ) );

    
    
    
  }
}