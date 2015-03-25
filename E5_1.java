public class E5_1 {
  
	/** Main method */
  public static void main(String args[]) {
	  int number = 100;
	  int charsPerLine = 10;
	  
	  for (int n = 1 ; n < number + 1 ; n ++)
	  {		  
		  if ( n % charsPerLine == 0 )
		  {
			  System.out.println(getPentagonalNumber(n));  
		  }
		  else
		  {
			  System.out.print(getPentagonalNumber(n) + "\t");
		  }		  
	  }	  
  }
  
  //  getPentagonalNumber
  public static int getPentagonalNumber (int n) {	  
	  return n * (3 * n - 1) / 2 ;	  	  
  }  
}