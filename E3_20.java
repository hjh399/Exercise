import java.util.Scanner;
public class E3_20 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Fahrenheit:");
		double temperature = input.nextDouble();
		
		System.out.print("Enter the wind speed miles per hours:");
		int windSpeed = input.nextInt();
		
		if (temperature < 41 && temperature > -58)
		{
			if (windSpeed >= 2)
			{
				double chillIndex = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
				System.out.println("The wind chill index is " + chillIndex);			
			}
			else
			{
				System.out.println("Speed must be greater than or equal to 2");
			}
		}
		else
		{
			System.out.println("Temperature must be between -58°F and 41°F");
		}
		

	}
}
 