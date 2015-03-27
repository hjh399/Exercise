import java.util.Scanner;
public class E5_4 {
  
	/** Main method */
  public static void main(String args[]) {	
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter a integer :");
	  int number = input.nextInt();	  
	  
	  reverse(number);
  }
  
//	Return the reversal of an integer, i.e. reverse(456) returns 654  
  public static void reverse(int number) {	  	    
	  while ( number != 0 )
	  {
		  int digit = number % 10;
		  System.out.print(digit);
		  number /= 10;
	  }  
  }  
}
