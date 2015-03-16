import java.util.Scanner;

public class E4_28 {
  public static void main(String[] args) {	  	  
	  Scanner input = new Scanner(System.in);	  
	  System.out.print("Enter the year and the first day :");
	  final int YEAR = input.nextInt();
	  int number = input.nextInt();
	  
	  String month = " ";
	  String dayOfWeek = "0";
	  int m = -1;
	  int year = YEAR;
	  
	  for ( int i = 1 ; i < 13 ; i ++)
	  {
		  switch (i)
			{
			case 1:
				m = 13;
				year--;
				month = "January";
				break;

			case 2:
				m = 14;
				year--;
				month = "February";
				break;
			
			case 3:
				m = 3;
				month = "March";
				break;
				
			case 4:
				m = 4;
				month = "April";
				break;	
				
			case 5:
				m = 5;
				month = "May";
				break;	
			
			case 6:
				m = 6;
				month = "June";
				break;	
				
			case 7:
				m = 7;
				month = "July";
				break;	
				
			case 8:
				m = 8;
				month = "August";
				break;	
				
			case 9:
				m = 9;
				month = "September";
				break;	
				
			case 10:
				m = 10;
				month = "October";
				break;	
				
			case 11:
				m = 11;
				month = "Novermber";
				break;	
				
			case 12:
				m = 12;
				month = "December";
				break;	
			}
			
		  	int j = year / 100;
		  	int k = year % 100;
			int h = (1 + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

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
			
			System.out.println(month + " 1, " + YEAR + " is " + dayOfWeek);	

	  }
	  			
		
  }
}