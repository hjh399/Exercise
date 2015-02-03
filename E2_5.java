import java.util.Scanner;


public class E2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the subtotal and a gratuity rate:");
		
		Scanner input = new Scanner(System.in);
		double subtotal = input.nextDouble();
		int gratuityRate = input.nextInt();
		
		double gratuity = subtotal * gratuityRate / 100 ;
		gratuity = ((int)(gratuity * 100)) * 0.01 ;
		double total = subtotal + gratuity;
		
		System.out.println("The gratuity is " + gratuity + " and total is " + total);
	}

}
