import java.util.Scanner;

public class E3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = (int)(Math.random() *100);
		int number2 = (int)(Math.random() *100);
		System.out.printf("The number are %d and %d \n" , number1 , number2 );
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the sum: ");
		int answer = input.nextInt();
		
		System.out.println((answer == number1 + number2));
		
		
	}

}
