import java.util.Scanner;

public class E4_41 {
  public static void main(String args[]) {
	  
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter the number :");
	  
	  int number = input.nextInt();
	  int max = number ;
	  int count = 1 ;
	  
	  while ( number != 0 )
	  {
		  if ( number > max )
		  {
			  max = number;
			  count = 1 ;
			  			 
		  }
		  
		  else if ( number == max)
		  {
			  count ++ ;
		  }
		  
		  number = input.nextInt();
	  }	  	  	  
	  
	  System.out.println("The largest number is " + max);
	  System.out.println("The occurrence count of the largest number is " + count);
  } 
}