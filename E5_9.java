public class E5_9 {
	public static void main(String[] args) {
		double foot = 1;
		double meter = 20;
		
		System.out.println("英尺\t\t米\t\t米\t\t英尺");
		for (int i = 0 ; i < 10 ; i ++,foot ++,meter += 5)
		{	
			System.out.printf("%-3.1f\t\t", foot);
			System.out.printf("%-3.3f\t\t", footToMeter(foot));
			System.out.printf("%3.1f\t\t", meter);
			System.out.printf("%3.3f\n", meterToFoot(meter));
		}
	}	
	
//	Converts from feet to meters
	public static double footToMeter(double foot) {		
		double meter = foot * 0.305;
		return meter;
	}
	
//	Converts from meters to feet	
	public static double meterToFoot(double meter) {
		double foot = meter / 0.305;
		return foot;
	}
}


