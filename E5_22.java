import java.util.Scanner;

public class E5_22 {
  public static void main(String[] args) {
	  System.out.print("Enter a number: ");
	  Scanner input = new Scanner(System.in);
	  double number = input.nextDouble();
	  
	  System.out.print("The square root of the number is " + guess(number));
  } 
  
  public static double guess(double num) {
	  double lastGuess = 1;
	  double nextGuess = 0;
	  nextGuess = (lastGuess + (num / lastGuess)) / 2;
	  
	  while (Math.abs(nextGuess - lastGuess) > 0.0001)
	  {
		  lastGuess = nextGuess;
		  nextGuess = (lastGuess + (num / lastGuess)) / 2;
	  }
	  
	  return nextGuess;
  }
} 