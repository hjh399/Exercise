import java.util.Scanner;
public class E4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an int value, the program exits if the input is 0: ");
		int number = -1;
		int sum = 0;
		int positiveNumber = 0;
		int negativeNumber = 0;
				
		do{
			number = input.nextInt();
			sum += number;
			if (number > 0)
			{
				positiveNumber ++;
			}
			else if (number < 0)
			{
				negativeNumber ++;
			}			
		}while (number != 0);
		
		double average = (double)sum / (positiveNumber + negativeNumber);
		
		System.out.println("The number of positives is " + positiveNumber);
		System.out.println("The number of negatives is " + negativeNumber);
		System.out.println("The total is " + sum);
		System.out.println("The average is " + average);
	}
}
 