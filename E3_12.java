import java.util.Scanner; 

public class E3_12 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter a integer :");
	  int number = input.nextInt();
	  
	  if (number % 5 == 0 && number % 6 == 0)
	  {
		  System.out.printf("%d is divisible by both 5 and 6" , number);
	  }
	  else if (number % 5 == 0 || number % 6 == 0)
	  {
		  System.out.printf("%d is divisible by 5 or 6,but not both" , number);
	  }
	  else
	  {
		  System.out.printf("%d is not divisible by either 5 or 6" , number);
	  }
  }
}

