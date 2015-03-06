import java.util.Scanner;

public class E3_28 {
  public static void main(String args[]) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter r1's center x- and y-coordinates, width, and height: ");	  
	  double x1 = input.nextDouble();
	  double y1 = input.nextDouble();
	  
	  double width1 = input.nextDouble();
	  double height1 = input.nextDouble();
	  
	  System.out.print("Enter r2's center x- and y-coordinates, width, and height: ");	  
	  double x2 = input.nextDouble();
	  double y2 = input.nextDouble();
	  
	  double width2 = input.nextDouble();
	  double height2 = input.nextDouble();
	  
	  double xDistance = x1 - x2 >= 0 ? x1 - x2 : x2 - x1;
	  double yDistance = y1 - y2 >= 0 ? y1 - y2 : y2 - y1;	  
	  double widthDistance = width1 - width2 >= 0 ? width1 - width2 : width2 - width1;
	  double heightDistance = height1 - height2 >= 0 ? height1 - height2 : height2 - height1;
	  
	  if (yDistance > height1/2 + height2/2 || xDistance > width2/2 + width1/2)
	  {
		  System.out.println("r2 does not overlap r1");
	  }
	  else if (yDistance > heightDistance / 2 || xDistance < widthDistance / 2)
	  {
		  System.out.println("r2 overlaps r1");
	  }
	  else
	  {
		  System.out.println("r2 is inside r1");
	  }
	  
  } 
}