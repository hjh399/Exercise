import java.util.Scanner;

public class E5_6 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter the number : ");
	  int number = input.nextInt();
	  
	  displayPattern(number);
	}
  
  public static void displayPattern(int n) {
	  for (int i = 1 ; i <= n ; i ++)
	  {
	      // Print spaces
		  for (int j = i ; j < n ; j ++)
		  {			   			  
			  System.out.print("    ");			  
		  }

		  // Print numbers
		  for (int j = i ; j > 0 ; j --)
		  {			   			  
			  System.out.printf("%4d",j);			  
		  }
		  
		  System.out.println();		  
	  }	  
	}  
} 