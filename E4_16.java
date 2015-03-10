import java.util.Scanner;

public class E4_16 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter a number: ");
	  int number = input.nextInt();
	  
	  while (number % 2 == 0)
	  {
		  System.out.print(2 + ",");
		  number /= 2;
	  }
	  while (number % 3 == 0)
	  {
		  System.out.print(3 + ",");
		  number /= 3;
	  }
	  while (number % 5 == 0)
	  {
		  System.out.print(5 + ",");
		  number /= 5;
	  }
	  while (number % 7 == 0)
	  {
		  System.out.print(7 + ",");
		  number /= 7;
	  }		  
	  if (number != 1)
	  {
		  System.out.print(number);  
	  }
//	    // Find all the smallest factors of the integer
//	    System.out.println("The factors for " + number + " is");
//	    int factor = 2;
//	    while (factor <= number) {
//	      if (number % factor == 0) {
//	        number = number / factor;
//	        System.out.println(factor);
//	      }
//	      else {
//	        factor++;
//	      }	  
  }
}	  