import java.util.Scanner;

public class E5_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter millis: ");
		long totalMilliseconds = input.nextLong();
		
		System.out.print(convertMillis(totalMilliseconds));
	    
	}
	
	public static String convertMillis(long millis) {
		// Obtain the total milliseconds since midnight, Jan 1, 1970

	    // Obtain the total seconds since midnight, Jan 1, 1970
	    long totalSeconds = millis / 1000;

	    // Compute the current second in the minute in the hour
	    long currentSecond = (int)(totalSeconds % 60);

	    // Obtain the total minutes
	    long totalMinutes = totalSeconds / 60;

	    // Compute the current minute in the hour
	    long currentMinute = (int)(totalMinutes % 60);

	    // Obtain the total hours
	    long totalHours = totalMinutes / 60;


		return totalHours + ":" + currentMinute + ":" + currentSecond ;
	}
} 