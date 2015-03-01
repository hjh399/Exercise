import java.util.Scanner;

public class E3_7 {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Receive the amount
    System.out.print(
      "Enter an amount in double, for example 11.56: ");
    double amount = input.nextDouble();

    int remainingAmount = (int)(amount * 100);

    // Find the number of one dollars
    int numberOfOneDollars = remainingAmount / 100;
    remainingAmount = remainingAmount % 100;
    

    // Find the number of quarters in the remaining amount
    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;

    // Find the number of dimes in the remaining amount
    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;

    // Find the number of nickels in the remaining amount
    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;

    // Find the number of pennies in the remaining amount
    int numberOfPennies = remainingAmount;

    // Display results
    String dollar = "dollars";
    String quarter = "quarters";
    String dime = "dimes";
    String nickel = "nickels";
    String penny = "pennies";
    if (numberOfOneDollars == 1 )
    {
    	dollar = "dollar";
    }
    if (numberOfQuarters == 1 )
    {
    	quarter = "quarter";
    }
    if (numberOfDimes == 1 )
    {
    	dime = "dime";
    }
    if (numberOfNickels == 1 )
    {
    	nickel = "nickel";
    }
    if (numberOfPennies == 1 )
    {
    	penny = "penny";
    }
    
    String output = "Your amount " + amount + " consists of \n" +
      "\t" + numberOfOneDollars + dollar +"\n" +
      "\t" + numberOfQuarters + quarter +"\n" +
      "\t" + numberOfDimes + dime + "\n" +
      "\t" + numberOfNickels + nickel + "\n" +
      "\t" + numberOfPennies + penny;
    System.out.println(output);
  }
}
