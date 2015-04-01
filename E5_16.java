public class E5_16 {
  public static void main(String[] args) {
	  final int startYear = 2000;
	  final int endYear = 2010;
	  
	  for (int i = startYear ; i <= endYear ; i ++)
	  {
		  System.out.println(i + " has " + numberOfDaysInAYear(i) + "days");
	  }	  
  }
  
  public static double numberOfDaysInAYear(int year) {	  
	  int numberOfDaysInAYear = ( (year % 4 == 0 && year % 100 != 0) ||  year % 400 == 0 ) ? 366: 365 ;		  			  
	  
	  return numberOfDaysInAYear;
  }
}

