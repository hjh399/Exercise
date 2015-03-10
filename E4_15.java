import java.util.Scanner;

public class E4_15 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter two number: ");
	  int n1 = input.nextInt();
	  int n2 = input.nextInt();
	  int number = (n1 > n2 ? n2 : n1);
	  int commonDivisor = -1;
	  
	  while (commonDivisor < 0)
	  {		  
		  if (n1 % number == 0 && n2 % number == 0)
		  {
			  commonDivisor = number;
		  }
		  number --;
	  }
	  
	  System.out.println("The highest common divisor is " + commonDivisor);	  
  }
}	  