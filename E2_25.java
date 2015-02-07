import java.util.Scanner;

public class E2_25 {
  public static void main(String[] args) {
    // Obtain the total milliseconds since midnight, Jan 1, 1970
    long totalMilliseconds = System.currentTimeMillis();

    // Obtain the total seconds since midnight, Jan 1, 1970
    long totalSeconds = totalMilliseconds / 1000;

    // Compute the current second in the minute in the hour
    long currentSecond = (int)(totalSeconds % 60);

    // Obtain the total minutes
    long totalMinutes = totalSeconds / 60;

    // Compute the current minute in the hour
    long currentMinute = (int)(totalMinutes % 60);

    // Obtain the total hours
    long totalHours = totalMinutes / 60;

    // Compute the current hour
    long currentHour = (int)(totalHours % 24);

    System.out.print("Enter the time zone offset to GMT:");
    Scanner input = new Scanner(System.in);
    double timeZoneOffset = input.nextDouble();
    
    // Display results
    System.out.println("Current time is " + (int)( currentHour + timeZoneOffset ) + ":"
      + currentMinute + ":" + currentSecond + " GMT");
  }
}

 