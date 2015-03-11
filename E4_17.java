import java.util.Scanner;

public class E4_17 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter a number: ");
	  int number = input.nextInt();

	  for ( int i = 1; i <= number ; i++)
	  {
		  for (int j = 1 ; j <= number - i ; j ++)
		  {			  
			  System.out.print("\t");			  
		  }
		  
		  for (int k = i ; k > 0 ; k --)
		  { 
		      System.out.print(k + "\t");          
		  }
		  
		  for (int k = 2 ; k <= i ; k ++)
		  { 
		      System.out.print(k + "\t");          
		  }
		  System.out.println(" ");
	  }

  }
}	  