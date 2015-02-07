import java.util.Scanner;

public class E2_24 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter v and a:");
		
		double v = input.nextDouble();
		double a = input.nextDouble();
		
		double length = Math.pow(v, 2) / ( 2 * a );
//		参考答案也没有四舍五入也是醉了
		System.out.println("The minimum runway length for this airplane is " + length);
		
	}
}

 