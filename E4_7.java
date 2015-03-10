public class E4_7 {
  public static void main(String[] args) {
	  double tuition = 10000;
	  double sum = 0;
			  
	  for (int year = 1; year < 14; year++)
	  {		  
		  tuition *= 1.05 ;
		  
		  if (year == 10)
		  {
			  System.out.println("The tuition of " + year + " year is " + tuition); 
		  }
		  
		  if (year > 9)
		  {
			  sum += tuition;			  
		  }
	  }
	  System.out.println("The total tuition is " + sum);
	  
  }
}	  