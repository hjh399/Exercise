import java.util.Scanner;
public class E3_9 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  String number = input.nextLine();
	  int isbn = Integer.parseInt(number);
	  
	  int d9 = isbn % 10;
	  
	  isbn /= 10;
	  int d8 = isbn % 10;
	  
	  isbn /= 10;
	  int d7 = isbn % 10;
	  
	  isbn /= 10;
	  int d6 = isbn % 10;
	  
	  isbn /= 10;
	  int d5 = isbn % 10;
	  
	  isbn /= 10;
	  int d4 = isbn % 10;
	  
	  isbn /= 10;
	  int d3 = isbn % 10;
	  
	  isbn /= 10;
	  int d2 = isbn % 10;
	  
	  isbn /= 10;
	  int d1 = isbn % 10;
	  
	  int d10 = ( d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9 ) % 11;
	  
	  if (d10 == 10)
	  {
		  System.out.println(number+"X");
	  }
	  else
	  {
		  System.out.printf("%s%d",number, d10);
		  
	  }
	  
  }
}
