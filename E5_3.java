import java.util.Scanner;
public class E5_3 {
  
	/** Main method */
  public static void main(String args[]) {	
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter a integer :");
	  int number = input.nextInt();	  
	  
	  if (isPalindrome(number))
		  System.out.println(number + " is palindrome");
	  else
		  System.out.println(number + " is not palindrome");
	  
  }
  
//	Return the reversal of an integer, i.e. reverse(456) returns 654  
  public static int reverse(int number) {	  
	  String sum = "";	  
	  while ( number != 0 )
	  {
		  int digit = number % 10;
		  sum = sum + digit;
		  number /= 10;
	  }		
	  int reverse = Integer.parseInt(sum);
	  return reverse;
  }
  
//  Return true if number is palindrome
  public static boolean isPalindrome(int number) {	  	
	  return (reverse(number) == number)? true : false;		  
  }
}