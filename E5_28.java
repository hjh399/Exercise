public class E5_28 {
  public static void main(String[] args) {
	  
	  System.out.println("p\t2^p-1");
	  
	  for (int p = 2;p < 32;p ++)
	  {
		  double i = Math.pow(2, p) - 1;
		  
		  if (isPrimeNumber(i) && Math.rint(p) == p )
		  {
			  System.out.println(p + "\t" + (int)i);
		  }
	  }
  }
  
  //	Return true if number is primeNumber
  public static boolean isPrimeNumber(double number) {	
		boolean isPrimeNumber = true;
		
		for (int divisor = 2; divisor <= number / 2; divisor++) 
		{
		    if (number % divisor == 0) 
		    { // If true, number is not prime
		          isPrimeNumber = false; // Set isPrime to false          
		       break; // Exit the for loop
		    }		    
		}	 
		
		return isPrimeNumber;	    
	}
}