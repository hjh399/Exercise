import java.util.Scanner;
public class E5_5 {
  
	/** Main method */
  public static void main(String args[]) {	
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter three number :");
	  double num1 = input.nextInt();
	  double num2 = input.nextInt();
	  double num3 = input.nextInt();	  
	  
	  displaySortedNumbers(num1, num2, num3);
  }
  
//	Return the reversal of an integer, i.e. reverse(456) returns 654  
  public static void displaySortedNumbers(double num1, double num2, double num3) {	  	    
	  double temp = 0;
	  if (num1 > num2)
		{
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
	  if (num1 > num3)
		{
		  	temp = num1;
		  	num1 = num3;
			num3 = temp;
		}
	  if (num2 > num3)
		{
		  	temp = num2;
		  	num2 = num3;
			num3 = temp;
		}
	  System.out.print(num1 + " " + num2 + " " + num3);

  }  
}
