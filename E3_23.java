import java.util.Scanner;

public class E3_23 {
  public static void main(String[] args) {
	  
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter a point with two coordinates:");
	  int x = input.nextInt();
	  int y = input.nextInt();
	  
	  if ( Math.pow(y * y, 0.5) < 5 / 2.0 && Math.pow(x * x, 0.5) < 10 / 2.0 )
	  {
		  System.out.printf("Point (%d, %d) is in the rectangle",x,y);
	  }
	  
	  else
	  {
			System.out.printf("Point (%d, %d) is not in the rectangle",x,y);
	  }
	  	  
  } 
}  