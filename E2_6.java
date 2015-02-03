import java.util.Scanner;


public class E2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.print("Enter a number between 0 and 1000: ");
	
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	int sum = 0;	
	int digit ;
	
	while (number != 0)
	{
	digit = number % 10;	
	sum += digit;
	number = number / 10;
	}
	
	System.out.println("The sum of the digits is " + sum);
	
	}

}
