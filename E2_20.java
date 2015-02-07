import java.util.Scanner;

public class E2_20 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x1 and y1 :");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("Enter x2 and y2 :");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		  
		double distance = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
		distance = Math.pow(distance, 0.5);
		
		System.out.println("The distance of the two points is " + distance);
	}
}

 