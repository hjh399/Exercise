public class E5_8 {
	public static void main(String[] args) {
		double celsius = 40;
		double fahrenheit = 120;
		
		System.out.println("摄氏度\t\t华氏度\t\t摄氏度\t\t华氏度");
		for (int i = 0 ; i < 10 ; i ++,celsius --,fahrenheit -= 10)
		{	
			System.out.printf("%-3.1f\t\t", celsius);
			System.out.printf("%-3.1f\t\t", celsiusToFahrenheit(celsius));
			System.out.printf("%3.1f\t\t", fahrenheit);
			System.out.printf("%3.2f\n", fahrenheitToCelsius(fahrenheit));
		}
	}	
	
//	Converts from Celsius to Fahrenheit
	public static double celsiusToFahrenheit(double celsius) {		
		double celsiusToFahrenheit = (9.0 / 5) * celsius + 32;
		return celsiusToFahrenheit;
	}
	
//	Converts from Fahrenheit to Celsius	
	public static double fahrenheitToCelsius(double fahrenheit) {
		double fahrenheitToCelsius = ( fahrenheit - 32 ) / ( 9.0 / 5 );
		return fahrenheitToCelsius;
	}
}


