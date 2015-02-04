import java.util.Scanner;

public class E2_9 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.print( "Enter an amount in double, for example 1156: ");
    int remainingAmount = input.nextInt();          
      
    int numberOfOneDollars = remainingAmount / 100;
    remainingAmount = remainingAmount % 100;


    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;


    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;


    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;
    
    int numberOfPennies = remainingAmount;

    String output = "Your amount consists of \n" +
      "\t" + numberOfOneDollars + " dollars\n" +
      "\t" + numberOfQuarters + " quarters\n" +
      "\t" + numberOfDimes + " dimes\n" +
      "\t" + numberOfNickels + " nickels\n" +
      "\t" + numberOfPennies + " pennies";
    System.out.println(output);
  }
}
