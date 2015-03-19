import java.util.Scanner;
public class E4_36 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter the ISBN :");
	  String number = input.nextLine();
	  int isbn = Integer.parseInt(number);
	  
	  int d10 = 0;
	  for (int i = 9 ; i > 1 ; i --)
	  {
		  int d = isbn % 10;
		  isbn /= 10;
		  d10 += d * i;
	  }	  	  	  
	  d10 %= 11;
	  
	  if (d10 == 10)
	  {
		  System.out.println("ISBN number is " + number+"X");
	  }
	  else
	  {
		  System.out.printf("ISBN number is %s%d",number, d10);		  
	  }	  
  }
}