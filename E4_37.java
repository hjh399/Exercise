import java.util.Scanner;
public class E4_37 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter the number :");
	  int number = input.nextInt();
	  
	  String number10 = "";
	  
	  while (number != 0)
	  {		  
		  if (number % 2 == 0)
		  {
			  number10 = "0" + number10 ;
		  }
		  else
		  {
			  number10 = "1" + number10 ;			  
		  }		
		  number /= 2 ;
	  }
	  
	  System.out.println(number10);
	  
  }
}