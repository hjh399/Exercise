import java.util.Scanner;

public class E5_2 {
  
	/** Main method */
  public static void main(String args[]) {	
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter the number :");
	  int n = input.nextInt();
	  
	  System.out.print(sumDigits(n));
  }
  
  //  sumDigits
  public static int sumDigits(long n) {	  	  	  
	  int sum = 0;
	  
	  while ( n != 0 )
	  {
		  long digit = n % 10;
		  sum += digit;
		  n /= 10;
	  }	  
	  
	  return sum ;
  }  
}