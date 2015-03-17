import java.util.Scanner;

public class E4_29 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter input
    System.out.print("Enter a year: ");
    int year = input.nextInt();

    System.out.print("Enter the first day of the year: ");
    int firstDay = input.nextInt();

    int numberOfDaysInMonth = 0;

    // Display calendar for each month
    for (int month = 1; month <= 12; month++) 
    {
        // Display Calendar title      
    	switch (month) 
    	{
        case 1: System.out.println("\t\tJanuary " + year );
                numberOfDaysInMonth = 31;
                break;
        case 2: System.out.println("\t\tFebruary " + year);
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                  numberOfDaysInMonth = 29;
                else
                  numberOfDaysInMonth = 28;
                break;
        case 3: System.out.println("\t\tMarch " + year );
		        numberOfDaysInMonth = 31;
		        break;
        case 4: System.out.println("\t\tApril " + year );
		        numberOfDaysInMonth = 30;
		        break;
        case 5: System.out.println("\t\tMay " + year );
		        numberOfDaysInMonth = 31;
		        break;
        case 6: System.out.println("\t\tJune " + year );
		        numberOfDaysInMonth = 30;
		        break;
        case 7: System.out.println("\t\tJuly " + year );
		        numberOfDaysInMonth = 31;
		        break;
        case 8: System.out.println("\t\tAugust " + year );
		        numberOfDaysInMonth = 31;
		        break;
        case 9: System.out.println("\t\tSeptember " + year );
		        numberOfDaysInMonth = 30;
		        break;
        case 10: System.out.println("\t\tOctober " + year );
		        numberOfDaysInMonth = 31;
		        break;
        case 11: System.out.println("\t\tNovember " + year );
		        numberOfDaysInMonth = 30;
		        break;
        case 12: System.out.println("\t\tDecember " + year );
		        numberOfDaysInMonth = 31;
		        break;
    	}
    	
    	System.out.println("----------------------------------------------------");
    	System.out.println("Sun \t Mon \t Tue \t Wed \t Thu \t Fri \t Sat");
    	
        int a = 0;
    	while (a < firstDay )
		{
			System.out.print("\t");
			a ++; 
		}
				
		for (int i = 1; i <= numberOfDaysInMonth ; i ++)
		{
		    String b = (i + firstDay ) % 7 == 0? "\n" : "\t";
			System.out.printf("%3d %s", i , b);
		}
		System.out.println("\n");

		// Get the start day for the next month
		firstDay = (firstDay + numberOfDaysInMonth) % 7;
    }
  }
}