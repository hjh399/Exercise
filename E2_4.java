import java.util.Scanner;


public class E2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number in pounds:");
		
		Scanner input = new Scanner(System.in);
		double pound = input.nextDouble();
		
		double kilogram = pound * 0.454 ;
		
		System.out.println(pound + " pounds is " + kilogram + " kilograms");
		
		
	}

}
