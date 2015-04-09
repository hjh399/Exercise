public class E5_24 {
	public static void main(String[] args) {
		final int START_YEAR = 1970;
		final int START_MONTH = 1;
		
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
	    long totalHours = totalMinutes / 60 + 8;

	    // Compute the current hour in the day
	    long currentHour = (int)(totalHours % 24) ;
	    
	    // Obtain the total day
	    long currentDay = (int)(totalHours / 24);
	    	    	    
	//	  Obtain the current year
	    int year = START_YEAR;
	    int days = 0;
	    int numberOfDay = (isLeapYear(year))? 366: 365;
	    
		while (currentDay - days > numberOfDay)
		{
			year ++;
			days += numberOfDay;
			numberOfDay = (isLeapYear(year))? 366: 365;
		}
	 
		double remainingDay = currentDay - days;
		
	//	  Obtain the current month
    	int month = START_MONTH;	
    	days = 0;
	    numberOfDay = getNumberOfDaysInMonth(year, month);
	    
		while (remainingDay - days > numberOfDay)
		{
			month ++;
			days += numberOfDay;
			numberOfDay = getNumberOfDaysInMonth(year, month);
		}
		
		double day = remainingDay - days + 1;
				
	//    Display results
	    System.out.print("Now is " + year);
	    System.out.print(" " + getTheNameOfMonth(month));
	    System.out.print(" " + (int)day);
	    System.out.print(" " + currentHour + ":" + currentMinute + ":" + currentSecond ); 
}
	
	
	//	Determine if it is a leap year 	
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	  }
	
	//	Get the number of days in a month
	public static int getNumberOfDaysInMonth(int year, int month) {
	    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
	      return 31;

	    if (month == 4 || month == 6 || month == 9 || month == 11)
	      return 30;

	    if (month == 2) return isLeapYear(year) ? 29 : 28;

	    return 0; // If month is incorrect
	}
		
	//	Get the name of month
	public static String getTheNameOfMonth(int month) {
		String monthName = "";
		switch (month) {
			case 1: monthName = "January"; break;
			case 2: monthName = "February"; break;
			case 3: monthName = "March"; break;
			case 4: monthName = "April"; break;
			case 5: monthName = "May"; break;
			case 6: monthName = "June"; break;
			case 7: monthName = "July"; break;
			case 8: monthName = "August"; break;
			case 9: monthName = "September"; break;
			case 10: monthName = "October"; break;
			case 11: monthName = "November"; break;
			case 12: monthName = "December";
		}
		return monthName;
	}
} 