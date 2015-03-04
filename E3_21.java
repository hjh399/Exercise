import java.util.Scanner;
public class E3_21 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter year: (e.g., 2008):");
		int year = input.nextInt();
		
		System.out.print("Enter month: 1-12:");
		int m = input.nextInt();
		
		System.out.print("Enter the day of the month: 1-31:");
		int q = input.nextInt();
		
		switch (m)
		{
		case 1:
			m = 13;
			year--;
			break;

		case 2:
			m = 14;
			year--;
			break;
		}
		
		int j = year / 100;
		int k = year % 100;
		
		int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		String dayOfWeek = "0";
		switch (h)
		{
		case 0:
			dayOfWeek = "Saturday";
			break;
		case 1:
			dayOfWeek = "Sunday";
			break;
		case 2:
			dayOfWeek = "Monday";
			break;
		case 3:
			dayOfWeek = "Tuesday";
			break;
		case 4:
			dayOfWeek = "Wednesday";
			break;
		case 5:
			dayOfWeek = "Thursday";
			break;
		case 6:
			dayOfWeek = "Friday";
			break;
			
		}
		
		System.out.print("Day of the week is " + dayOfWeek);


		
		
		

	}
}
 