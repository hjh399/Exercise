import java.util.Scanner;

public class E3_25 {
  public static void main(String args[]) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter three edges: ");
	  double edge1 = input.nextDouble();
	  double edge2 = input.nextDouble();
	  double edge3 = input.nextDouble();
	  
	  if (edge1 + edge2 > edge3 && edge3 + edge2 > edge1 && edge3 + edge1 > edge2)
	  {
		  double c = edge1 + edge2 + edge3;
		  System.out.println("The perimeter of the triangle is " + c);
	  }
	  else
	  {
		  System.out.printf("edges " + edge1 + ", " + edge2 + ", and " + edge3 + " cannot form a triangle ");
	  }
    
  } 
}