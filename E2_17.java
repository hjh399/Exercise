import java.util.Scanner;



public class E2_17 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Fahrenheit:");
		double temperature = input.nextDouble();
		
		System.out.print("Enter the wind speed miles per hours:");
		int windSpeed = input.nextInt();
		
		double chillIndex = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
		System.out.println("The wind chill index is " + chillIndex);
		
		

		 }
}
 