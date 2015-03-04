import java.util.Scanner;

public class E3_19 {
  public static void main(String args[]) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter three edges: ");
	  double edge1 = input.nextDouble();
	  double edge2 = input.nextDouble();
	  double edge3 = input.nextDouble();
	  
	  System.out.printf("Can edges " + edge1 + ", " + edge2 + ", and " + edge3 + " form a triangle? ");
	  System.out.print((edge1 + edge2 > edge3 && edge3 + edge2 > edge1 && edge3 + edge1 > edge2));
	  
    
  } 
}
