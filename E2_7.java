import java.util.Scanner;


public class E2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.print("Enter the number of minutes :");
	
	Scanner input = new Scanner(System.in);
	int totalMinutes = input.nextInt();
	
	int totalHours = totalMinutes / 60;
	int totalDays = totalHours / 24;
	
	int totalYears = totalDays / 365;
	int remainingDays = totalDays % 365;
	
	System.out.println(totalMinutes + " minutes is approximately " + totalYears + " years and " + remainingDays + " days.");
	}

}
