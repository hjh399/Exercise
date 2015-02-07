import java.util.Scanner;

public class E2_23 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter v0,v1, and t :");
		
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		double a = ( v1 - v0 ) / t;
		
//		没有解决四舍五入问题
		System.out.println("The average acceleration is " + (int)(a * 10000) / 10000.0);
		
	}
}

 