public class E5_30 {
  public static void main(String[] args) {
	  for (int i = 2;i < 1001; i ++)
	  {
		  if (isPrimeNumber(i) && isPrimeNumber(i + 2))
		  {
			  System.out.printf("(%d,%d)\n",i,i+2);
		  }
	  }
  }
  
//	Return true if number is primeNumber
public static boolean isPrimeNumber(int number) {	
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