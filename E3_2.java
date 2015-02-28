import java.util.Scanner;

public class E3_2 {
  public static void main(String[] args) {
	  
	  Scanner in = new Scanner(System.in);
	  System.out.print("Enter an integer: ");
	  
	  int number = in.nextInt();	  
	  
	  System.out.println("Is " + number + " an even number? " + (number % 2 == 0));	  
	  
	  
  }  
}

 