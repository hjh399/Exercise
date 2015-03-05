import java.util.Scanner;
public class E3_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		
		double distance = Math.pow(Math.pow(x1, 2) + Math.pow(y1, 2), 0.5);
		
		if (distance <= 10)
		{
			System.out.printf("Point (%d, %d) is in the circle",x1,y1);
		}
		else
		{
			System.out.printf("Point (%d, %d) is not in the circle",x1,y1);
		}

	}
}
 