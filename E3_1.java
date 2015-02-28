import java.util.Scanner;

public class E3_1 {
  public static void main(String[] args) {
	  
	  Scanner in = new Scanner(System.in);
	  System.out.print("Enter a, b, c:");
	  double a = in.nextDouble();
	  double b = in.nextDouble();
	  double c = in.nextDouble();
	  
	  double panbieshi = Math.pow(b, 2) - 4 * a * c;
	  
	  if (panbieshi < 0)
	  {
		  System.out.println("The equation has no real roots");
	  }
	  
	  if (panbieshi == 0)
	  {
		  System.out.println("The root is " + (int)(-b/2 * a));
	  }
	  
	  
	  
	  if (panbieshi > 0)
	  {
		  double x1 = (-b + Math.pow(panbieshi, 0.5))/ 2.0 / a;
		  double x2 = (-b - Math.pow(panbieshi, 0.5))/ 2.0 / a;
		  
		  System.out.printf("The root are %1.6f and %1.5f" , x1, x2);
	  }
	  

	  
	  
	  
  }  
}

 