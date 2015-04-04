import java.util.Scanner;

public class E5_19MyTriangle {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter side1,side2,side3: ");
	  double side1 = input.nextDouble();
	  double side2 = input.nextDouble();
	  double side3 = input.nextDouble();
	  
	  if (isValid(side1, side2, side3))
	  {
		  System.out.println("The area is " + area(side1, side2, side3));
	  }
	  else
	  {
		  System.out.println("Error");
	  }
	  
	} 
  
//  Returns true if the sum of any two sides is greater than the third side
  public static boolean isValid(double side1, double side2, double side3) {
	  boolean isValid = side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1 ;
	  return isValid;
	} 

//  Return the area of the triangle
  public static double area(double side1, double side2, double side3) {
	  double s = (side1 + side2 + side3) / 2;
	  double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3) , 0.5);
	  
	  return area;
	} 

} 